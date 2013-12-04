package pl.kwi.intg.main;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.sling.junit.remote.testrunner.SlingRemoteTestParameters;
import org.apache.sling.junit.remote.testrunner.SlingRemoteTestRunner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.runner.RunWith;

@RunWith(SlingRemoteTestRunner.class)
public class RunnerIntgTest implements SlingRemoteTestParameters {
	
	
	private static final int MAX_CHECKING_COUNT = 5;
	private static final String INTG_HOST = "http://localhost:4502";
	private static final String SLING_JUNIT_PAGE = "/system/sling/junit";
	
	
	public RunnerIntgTest() {
		
		int count = 0;
			
		try {
			
			boolean slingJUnitPageReady = isSlingJUnitPageReady();
			while(!slingJUnitPageReady) {
				if(++count > MAX_CHECKING_COUNT) {
					return;
				}
				Thread.sleep(10000);
				slingJUnitPageReady = isSlingJUnitPageReady();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public String getJunitServletUrl() {
		return INTG_HOST + SLING_JUNIT_PAGE;
	}

	public String getTestClassesSelector() {
		return "";
	}

	public String getTestMethodSelector() {
		return "";
	}
	
	
	// ********************************************************* //
	// ******************** HELP METHODS *********************** //
	// ********************************************************* //
	
	
	/**
	 * Method checks if page with Sling JUnit is ready. It means that
	 * this methods check if page is loaded and there is no warnings
	 * on page.
	 * 
	 * @return true if page with Sling JUnit is ready. Otherwise false;
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @throws ParseException
	 */
	private boolean isSlingJUnitPageReady() throws ClientProtocolException, IOException, ParseException {
		
		boolean slingJUnitPageReady = true;
		
		HttpResponse getResponse = getHttpResponse();		
		boolean slingJUnitPageFound = slingJUnitPageFound(getResponse);
		
		if(!slingJUnitPageFound) {
			slingJUnitPageReady =  false;
		} else if(!isSlingJUnitPageLoaded(getResponse)){
			slingJUnitPageReady =  false;
		}
		
		return slingJUnitPageReady;
		
	}
	
	/**
	 * Method gets http response.
	 * 
	 * @return object <code>HttpResponse</code> with http response
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	private HttpResponse getHttpResponse() throws ClientProtocolException, IOException {
		
		HttpGet httpGet = new HttpGet(INTG_HOST + SLING_JUNIT_PAGE + "/.json");			
		DefaultHttpClient httpClient = new DefaultHttpClient();
		return httpClient.execute(httpGet);
		
	}
	
	/**
	 * Method checks if page with Sling JUnit is found.
	 * 
	 * @param getResponse object <code>HttpResponse</code> with http response
	 * @return true if page with Sling JUnit is found. Otherwise false.
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @throws ParseException
	 */
	private boolean slingJUnitPageFound(HttpResponse getResponse) throws ClientProtocolException, IOException, ParseException {		
		return !(getResponse.getStatusLine().getStatusCode() == 404);		
	}
	
	/**
	 * Method checks if page with Sling JUnit is loaded. It means that this
	 * method checks if there is no warnings on this page.
	 * 
	 * @param getResponse object <code>HttpResponse</code> with http response
	 * @return true if page with Sling JUnit is loade. Otherwise false
	 * @throws IllegalStateException
	 * @throws IOException
	 * @throws ParseException
	 */
	private boolean isSlingJUnitPageLoaded(HttpResponse getResponse) throws IllegalStateException, IOException, ParseException {
		
		boolean slingJUnitPageLoaded = true;
		
		InputStream is = getResponse.getEntity().getContent();
		JSONParser parser = new JSONParser();
		
		Object obj = parser.parse(IOUtils.toString(is, "UTF-8"));			
		JSONArray jsonArray = (JSONArray) obj;
		
		@SuppressWarnings("unchecked")
		Iterator<JSONObject> it = jsonArray.iterator();
		while (it.hasNext()) {
			JSONObject jsonObject = it.next();
			String infoSubtype = (String)jsonObject.get("INFO_SUBTYPE");
			if("warning".equals(infoSubtype)){
				slingJUnitPageLoaded = false;
				break;
			}
		}
		
		return slingJUnitPageLoaded;
		
	}


}
