import org.apache.commons.httpclient.*
import org.apache.commons.httpclient.methods.*
import org.apache.commons.httpclient.auth.*
import org.apache.commons.httpclient.methods.multipart.*

//method declaration for execute of PostMethod
def executePost(httpclient, httppost, outputResponse){
    try {
        httpclient.executeMethod(httppost);
        if (outputResponse){
            println httppost.responseBodyAsString
        }
    } catch (Exception e) {
        println("exception: " + e)
    } finally {
        httppost.releaseConnection()
    }
}

def uploadAndInstall(hostPort, packageName, projectRoot, httpclient){
    //upload package
    def httppost = new PostMethod(hostPort + '/crx/packmgr/service.jsp')	                                    
    def file = new File(projectRoot + '/target/' + packageName)

    println("Installing package " + packageName + " to " + hostPort)

    if(file.exists()){

        def parts = [new FilePart("file", file)] as Part[]
        httppost.setRequestEntity(new MultipartRequestEntity(parts,
        httppost.getParams()))

        executePost(httpclient, httppost, true)

        //install package
        def installURL = hostPort + '/crx/packmgr/service/.json/etc/packages/' + packageName
        println('INASTALL: ' + installURL)
        httppost = new PostMethod(installURL)
        httppost.addParameter("cmd", "install")

        executePost(httpclient, httppost, true)
    } else {
        println("File does not exist for " + packageName + ". Not Deploying.")
    }
}

def user = project.properties['cquser']
def pass = project.properties['cqpassword']
def packageName = project.properties['packageName']
def projectRoot = project.properties['projectDir']

// set up the client
def httpclient = new HttpClient()
def defaultcreds = new UsernamePasswordCredentials(user, pass)
httpclient.getState().setCredentials(AuthScope.ANY, defaultcreds)
httpclient.getParams().setAuthenticationPreemptive(true)

println "CQSERVERS:" + project.properties['cqservers']

project.properties['cqservers'].tokenize(',').each {
    uploadAndInstall(it, packageName, projectRoot, httpclient)
}