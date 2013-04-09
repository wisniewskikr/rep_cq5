//	HYPE.documents["indexbrmx"]

(function HYPE_DocumentLoader() {
	var resourcesFolderName = "resources";
	var documentName = "indexbrmx";
	var documentLoaderFilename = "script.js";
	var mainContainerID = "container";

	// find the URL for this script's absolute path and set as the resourceFolderName
	try {
		var scripts = document.getElementsByTagName('script');
		for(var i = 0; i < scripts.length; i++) {
			var scriptSrc = scripts[i].src;
			if(scriptSrc != null && scriptSrc.indexOf(documentLoaderFilename) != -1) {
				resourcesFolderName = scriptSrc.substr(0, scriptSrc.lastIndexOf("/"));
				break;
			}
		}
	} catch(err) {	}

	// Legacy support
	if (typeof window.HYPE_DocumentsToLoad == "undefined") {
		window.HYPE_DocumentsToLoad = new Array();
	}
 
	// load HYPE.js if it hasn't been loaded yet
	if(typeof HYPE_150 == "undefined") {
		if(typeof window.HYPE_150_DocumentsToLoad == "undefined") {
			window.HYPE_150_DocumentsToLoad = new Array();
			window.HYPE_150_DocumentsToLoad.push(HYPE_DocumentLoader);

			var headElement = document.getElementsByTagName('head')[0];
			var scriptElement = document.createElement('script');
			scriptElement.type= 'text/javascript';
			scriptElement.src = resourcesFolderName + '/' + 'scripts.js?hype_version=150';
			headElement.appendChild(scriptElement);
		} else {
			window.HYPE_150_DocumentsToLoad.push(HYPE_DocumentLoader);
		}
		return;
	}
	
	// handle attempting to load multiple times
	if(HYPE.documents[documentName] != null) {
		var index = 1;
		var originalDocumentName = documentName;
		do {
			documentName = "" + originalDocumentName + "-" + (index++);
		} while(HYPE.documents[documentName] != null);
		
		var allDivs = document.getElementsByTagName("div");
		var foundEligibleContainer = false;
		for(var i = 0; i < allDivs.length; i++) {
			if(allDivs[i].id == mainContainerID && allDivs[i].getAttribute("HYPE_documentName") == null) {
				var index = 1;
				var originalMainContainerID = mainContainerID;
				do {
					mainContainerID = "" + originalMainContainerID + "-" + (index++);
				} while(document.getElementById(mainContainerID) != null);
				
				allDivs[i].id = mainContainerID;
				foundEligibleContainer = true;
				break;
			}
		}
		
		if(foundEligibleContainer == false) {
			return;
		}
	}
	
	var hypeDoc = new HYPE_150();
	
	var attributeTransformerMapping = {b:"i",c:"i",bC:"i",d:"i",aS:"i",M:"i",e:"f",N:"i",f:"d",aT:"i",O:"i",g:"c",aU:"i",P:"i",Q:"i",aV:"i",R:"c",bG:"f",aW:"f",S:"i",aI:"i",bH:"d",l:"d",aX:"i",T:"i",m:"c",bI:"f",aJ:"i",n:"c",aK:"i",bJ:"f",aZ:"i",X:"i",A:"c",bK:"f",Y:"bM",B:"c",aL:"i",C:"c",bL:"f",D:"c",t:"i",E:"i",G:"c",bA:"c",a:"i",bB:"i"};
	
	var resources = {"10":{n:"BR_.png",p:1},"2":{n:"CL.png",p:1},"15":{n:"UY_.png",p:1},"3":{n:"CO.png",p:1},"11":{n:"CL_.png",p:1},"4":{n:"EC.png",p:1},"16":{n:"PE_.png",p:1},"5":{n:"MX.png",p:1},"12":{n:"AR_.png",p:1},"17":{n:"MX_.png",p:1},"6":{n:"PE.png",p:1},"13":{n:"CO_.png",p:1},"7":{n:"UY.png",p:1},"18":{n:"EC_.png",p:1},"0":{n:"AR.png",p:1},"8":{n:"VE.png",p:1},"14":{n:"VE_.png",p:1},"1":{n:"BR.png",p:1},"9":{n:"background.jpg",p:1}};
	
	var scenes = [{x:0,p:"600px",c:"#FFFFFF",v:{"12":{aU:0,bJ:"0.000000",c:32,q:"100% 100%",aV:0,r:"inline",d:32,e:"1.000000",bK:"1.000000",bL:"0.000000",aX:0,h:"3",bF:"59",j:"absolute",x:"visible",k:"div",bG:"0.000000",z:"1",aS:0,bH:"0deg",aT:0,a:0,o:"content-box",bI:"1.000000",b:0},"13":{aU:0,bJ:"0.000000",c:32,q:"100% 100%",aV:0,r:"inline",d:32,e:"1.000000",bK:"1.000000",bL:"0.000000",aX:0,h:"4",bF:"60",j:"absolute",x:"visible",k:"div",bG:"0.000000",z:"1",aS:0,bH:"0deg",aT:0,a:0,o:"content-box",bI:"1.000000",b:0},"5":{o:"content-box",bI:"1.000000",h:"9",x:"visible",a:0,q:"100% 100%",b:0,j:"absolute",r:"inline",c:960,z:"1",bK:"1.000000",d:450,bJ:"0.000000",k:"div",e:"0.000000",bG:"0.000000",bL:"0.000000",bH:"0deg"},"22":{b:2,z:"2",K:"None",bB:0,bC:0,L:"None",aS:8,M:0,e:"1.000000",N:0,aT:30,O:0,aU:8,P:0,bF:"54",aV:8,j:"absolute",bG:"0.000000",k:"div",bH:"0deg",aX:0,bI:"1.000000",bJ:"0.000000",aZ:0,bK:"1.000000",Z:"break-word",r:"inline",bL:"0.000000",s:"Verdana,Tahoma,Geneva,Sans-Serif",t:10,v:"bold",G:"#6A6A6A",w:"Chile",bA:"#000000",x:"visible",I:"None",a:34,y:"preserve",J:"None"},"14":{aU:0,bJ:"0.000000",c:32,q:"100% 100%",aV:0,r:"inline",d:32,e:"1.000000",bK:"1.000000",bL:"0.000000",aX:0,h:"5",bF:"61",j:"absolute",x:"visible",k:"div",bG:"0.000000",z:"1",aS:0,bH:"0deg",aT:0,a:0,o:"content-box",bI:"1.000000",b:0},"97":{o:"content-box",h:"18",p:"no-repeat",x:"visible",a:0,q:"100% 100%",b:0,j:"absolute",r:"inline",c:32,z:"3",k:"div",d:32,bF:"60",e:"0.000000"},"23":{b:2,z:"2",K:"None",bB:0,bC:0,L:"None",aS:8,M:0,e:"1.000000",N:0,aT:30,O:0,aU:8,P:0,bF:"59",aV:8,j:"absolute",bG:"0.000000",k:"div",bH:"0deg",aX:0,bI:"1.000000",bJ:"0.000000",aZ:0,bK:"1.000000",Z:"break-word",r:"inline",bL:"0.000000",s:"Verdana,Tahoma,Geneva,Sans-Serif",t:10,v:"bold",G:"#6A6A6A",w:"Colombia",bA:"#000000",x:"visible",I:"None",a:34,y:"preserve",J:"None"},"15":{aU:0,bJ:"0.000000",c:32,q:"100% 100%",aV:0,r:"inline",d:32,e:"1.000000",bK:"1.000000",bL:"0.000000",aX:0,h:"6",bF:"62",j:"absolute",x:"visible",k:"div",bG:"0.000000",z:"1",aS:0,bH:"0deg",aT:0,a:0,o:"content-box",bI:"1.000000",b:0},"98":{o:"content-box",h:"17",p:"no-repeat",x:"visible",a:0,q:"100% 100%",b:0,j:"absolute",r:"inline",c:32,z:"3",k:"div",d:32,bF:"61",e:"0.000000"},"24":{b:2,z:"2",K:"None",bB:0,bC:0,L:"None",aS:8,M:0,e:"1.000000",N:0,aT:30,O:0,aU:8,P:0,bF:"60",aV:8,j:"absolute",bG:"0.000000",k:"div",bH:"0deg",aX:0,bI:"1.000000",bJ:"0.000000",aZ:0,bK:"1.000000",Z:"break-word",r:"inline",bL:"0.000000",s:"Verdana,Tahoma,Geneva,Sans-Serif",t:10,v:"bold",G:"#6A6A6A",w:"Ecuador",bA:"#000000",x:"visible",I:"None",a:34,y:"preserve",J:"None"},"50":{aD:[{timelineIdentifier:"52",type:3}],x:"visible",a:644,b:74,j:"absolute",r:"inline",c:156,k:"div",z:"16",d:37,aE:[{goToURL:"http://www.dialogoroche.com.br",type:5,openInNewWindow:false}],aP:"pointer",e:"0.000000",aC:[{timelineIdentifier:"53",type:3}],bD:"none"},"99":{o:"content-box",h:"16",p:"no-repeat",x:"visible",a:0,q:"100% 100%",b:0,j:"absolute",r:"inline",c:32,z:"3",k:"div",d:32,bF:"62",e:"0.000000"},"16":{aU:0,bJ:"0.000000",c:32,q:"100% 100%",aV:0,r:"inline",d:32,e:"1.000000",bK:"1.000000",bL:"0.000000",aX:0,h:"7",bF:"63",j:"absolute",x:"visible",k:"div",bG:"0.000000",z:"1",aS:0,bH:"0deg",aT:0,a:0,o:"content-box",bI:"1.000000",b:0},"25":{b:2,z:"2",K:"None",bB:0,bC:0,L:"None",aS:8,M:0,e:"1.000000",N:0,aT:30,O:0,aU:8,P:0,bF:"61",aV:8,j:"absolute",bG:"0.000000",k:"div",bH:"0deg",aX:0,bI:"1.000000",bJ:"0.000000",aZ:0,bK:"1.000000",Z:"break-word",r:"inline",bL:"0.000000",s:"Verdana,Tahoma,Geneva,Sans-Serif",t:10,v:"bold",G:"#6A6A6A",w:"M\u00e9xico",bA:"#000000",x:"visible",I:"None",a:34,y:"preserve",J:"None"},"51":{o:"content-box",h:"10",x:"visible",a:0,q:"100% 100%",b:0,j:"absolute",r:"inline",c:32,z:"3",k:"div",d:32,bF:"50",e:"0.000000"},"60":{aD:[{timelineIdentifier:"86",type:3}],x:"visible",a:644,b:226,j:"absolute",r:"none",c:156,k:"div",z:"31",d:37,aE:[{goToURL:"http://www.dialogoroche.com.br",type:5,openInNewWindow:false}],aP:"pointer",e:"0.000000",aC:[{timelineIdentifier:"87",type:3}],bD:"none"},"17":{aU:0,bJ:"0.000000",c:32,q:"100% 100%",aV:0,r:"inline",d:32,e:"1.000000",bK:"1.000000",bL:"0.000000",aX:0,h:"8",bF:"64",j:"absolute",x:"visible",k:"div",bG:"0.000000",z:"1",aS:0,bH:"0deg",aT:0,a:0,o:"content-box",bI:"1.000000",b:0},"26":{b:2,z:"2",K:"None",bB:0,bC:0,L:"None",aS:8,M:0,e:"1.000000",N:0,aT:30,O:0,aU:8,P:0,bF:"62",aV:8,j:"absolute",bG:"0.000000",k:"div",bH:"0deg",aX:0,bI:"1.000000",bJ:"0.000000",aZ:0,bK:"1.000000",Z:"break-word",r:"inline",bL:"0.000000",s:"Verdana,Tahoma,Geneva,Sans-Serif",t:10,v:"bold",G:"#6A6A6A",w:"Per\u00fa",bA:"#000000",x:"visible",I:"None",a:34,y:"preserve",J:"None"},"61":{aD:[{timelineIdentifier:"88",type:3}],x:"visible",a:644,b:112,j:"absolute",r:"inline",c:156,k:"div",z:"36",d:37,aE:[{goToURL:"http://www.dialogoroche.com.mx",type:5,openInNewWindow:false}],aP:"pointer",e:"0.000000",aC:[{timelineIdentifier:"89",type:3}],bD:"none"},"27":{b:2,z:"2",K:"None",bB:0,bC:0,L:"None",aS:8,M:0,e:"1.000000",N:0,aT:30,O:0,aU:8,P:0,bF:"63",aV:8,j:"absolute",bG:"0.000000",k:"div",bH:"0deg",aX:0,bI:"1.000000",bJ:"0.000000",aZ:0,bK:"1.000000",Z:"break-word",r:"inline",bL:"0.000000",s:"Verdana,Tahoma,Geneva,Sans-Serif",t:10,v:"bold",G:"#6A6A6A",w:"Uruguay",bA:"#000000",x:"visible",I:"None",a:34,y:"preserve",J:"None"},"62":{aD:[{timelineIdentifier:"90",type:3}],x:"visible",a:644,b:302,j:"absolute",r:"none",c:156,k:"div",z:"41",d:37,aE:[{goToURL:"http://www.dialogoroche.com.br",type:5,openInNewWindow:false}],aP:"pointer",e:"0.000000",aC:[{timelineIdentifier:"91",type:3}],bD:"none"},"19":{b:2,z:"2",K:"None",bB:0,bC:0,L:"None",aS:8,M:0,e:"1.000000",N:0,aT:30,O:0,aU:31,P:0,bF:"50",aV:8,j:"absolute",bG:"0.000000",k:"div",bH:"0deg",aX:0,bI:"1.000000",bJ:"0.000000",aZ:0,A:"#919191",bK:"1.000000",Z:"break-word",r:"inline",bL:"0.000000",s:"Verdana,Tahoma,Geneva,Sans-Serif",t:10,v:"bold",G:"#6A6A6A",w:"Brazil",bA:"#000000",x:"visible",I:"None",a:34,y:"preserve",J:"None"},"71":{o:"content-box",h:"13",p:"no-repeat",x:"visible",a:0,q:"100% 100%",b:0,j:"absolute",r:"inline",c:32,z:"3",k:"div",d:32,bF:"59",e:"0.000000"},"54":{aD:[{timelineIdentifier:"56",type:3}],x:"visible",a:644,b:150,j:"absolute",r:"none",c:156,k:"div",z:"21",d:37,aE:[{goToURL:"http://www.dialogoroche.com.cl",type:5,openInNewWindow:false}],aP:"pointer",e:"0.000000",aC:[{timelineIdentifier:"58",type:3}],bD:"none"},"28":{b:2,z:"2",K:"None",bB:0,bC:0,L:"None",aS:8,M:0,e:"1.000000",N:0,aT:30,O:0,aU:8,P:0,bF:"64",aV:8,j:"absolute",bG:"0.000000",k:"div",bH:"0deg",aX:0,bI:"1.000000",bJ:"0.000000",aZ:0,bK:"1.000000",Z:"break-word",r:"inline",bL:"0.000000",s:"Verdana,Tahoma,Geneva,Sans-Serif",t:10,v:"bold",G:"#6A6A6A",w:"Venezuela",bA:"#000000",x:"visible",I:"None",a:34,y:"preserve",J:"None"},"63":{aD:[{timelineIdentifier:"92",type:3}],x:"visible",a:644,b:340,j:"absolute",r:"none",c:156,k:"div",z:"46",d:37,aE:[{goToURL:"http://www.dialogoroche.com.br",type:5,openInNewWindow:false}],aP:"pointer",e:"0.000000",aC:[{timelineIdentifier:"93",type:3}],bD:"none"},"55":{o:"content-box",h:"11",x:"visible",a:0,q:"100% 100%",b:0,j:"absolute",r:"inline",c:32,z:"3",k:"div",d:32,bF:"54",e:"0.000000"},"64":{aD:[{timelineIdentifier:"94",type:3}],x:"visible",a:644,b:378,j:"absolute",r:"none",c:156,k:"div",z:"51",d:37,aE:[{goToURL:"http://www.dialogoroche.com.br",type:5,openInNewWindow:false}],aP:"pointer",e:"0.000000",aC:[{timelineIdentifier:"95",type:3}],bD:"none"},"100":{o:"content-box",h:"15",p:"no-repeat",x:"visible",a:0,q:"100% 100%",b:0,j:"absolute",r:"inline",c:32,z:"3",k:"div",d:32,bF:"63",e:"0.000000"},"65":{aD:[{timelineIdentifier:"45",type:3}],x:"visible",a:644,b:74,j:"absolute",r:"none",c:156,k:"div",z:"2",d:37,aE:[{goToURL:"http://www.dialogoroche.com.cl",type:5,openInNewWindow:false}],aP:"pointer",e:"0.000000",aC:[{timelineIdentifier:"49",type:3}],bD:"none"},"66":{p:"no-repeat",aU:0,c:32,q:"100% 100%",bJ:"0.000000",aV:0,r:"inline",d:32,e:"1.000000",bK:"1.000000",bL:"0.000000",aX:0,h:"0",bF:"65",j:"absolute",x:"visible",k:"div",bG:"0.000000",z:"1",aS:0,bH:"0deg",aT:0,a:0,o:"content-box",bI:"1.000000",b:0},"101":{p:"no-repeat",bJ:"0.000000",c:32,q:"100% 100%",bK:"1.000000",r:"inline",d:32,e:"0.000000",bL:"0.000000",h:"14",bF:"64",j:"absolute",x:"visible",k:"div",bG:"0.000000",z:"3",bH:"0deg",bI:"1.000000",a:0,o:"content-box",b:0},"67":{b:2,z:"2",K:"None",bB:0,bC:0,L:"None",aS:8,M:0,e:"1.000000",N:0,aT:30,O:0,aU:8,P:0,bF:"65",aV:8,j:"absolute",bG:"0.000000",k:"div",bH:"0deg",aX:0,bI:"1.000000",bJ:"0.000000",aZ:0,bK:"1.000000",Z:"break-word",r:"inline",bL:"0.000000",s:"Verdana,Tahoma,Geneva,Sans-Serif",t:10,v:"bold",G:"#6A6A6A",w:"Argentina",bA:"#000000",x:"visible",I:"None",a:34,y:"preserve",J:"None"},"10":{aU:0,bJ:"0.000000",c:32,q:"100% 100%",aV:0,r:"inline",d:32,e:"1.000000",bK:"1.000000",bL:"0.000000",aX:0,h:"1",bF:"50",j:"absolute",x:"visible",k:"div",bG:"0.000000",z:"1",aS:0,bH:"0deg",aT:0,a:0,o:"content-box",bI:"1.000000",b:0},"59":{aD:[{timelineIdentifier:"72",type:3}],x:"visible",a:644,b:188,j:"absolute",r:"none",c:156,k:"div",z:"26",d:37,aE:[{goToURL:"http://www.dialogoroche.com.br",type:5,openInNewWindow:false}],aP:"pointer",e:"0.000000",aC:[{timelineIdentifier:"73",type:3}],bD:"none"},"68":{o:"content-box",h:"12",p:"no-repeat",x:"visible",a:0,q:"100% 100%",b:0,j:"absolute",r:"inline",c:32,z:"3",k:"div",d:32,bF:"65",e:"0.000000"},"11":{aU:0,bJ:"0.000000",c:32,q:"100% 100%",aV:0,r:"inline",d:32,e:"1.000000",bK:"1.000000",bL:"0.000000",aX:0,h:"2",bF:"54",j:"absolute",x:"visible",k:"div",bG:"0.000000",z:"1",aS:0,bH:"0deg",aT:0,a:0,o:"content-box",bI:"1.000000",b:0}},n:"Untitled Scene",T:{"93":{d:0.04,i:"93",n:"UYTO",a:[{f:"3",t:0,d:0.04,i:"d",e:32,r:1,s:32,o:"100"},{f:"3",t:0,d:0.04,i:"a",e:0,r:1,s:0,o:"100"},{f:"3",t:0,d:0.04,i:"b",e:0,r:1,s:0,o:"100"},{f:"3",t:0,d:0.04,i:"c",e:32,r:1,s:32,o:"100"},{f:"4",t:0,d:0.04,i:"G",e:"#6A6A6A",r:1,s:"#6A6A6A",o:"27"},{f:"1",t:0.03,d:0.01,i:"e",e:"0.000000",r:1,s:"0.000000",o:"100"}],f:30},"89":{d:0.04,i:"89",n:"MXTO",a:[{f:"3",t:0,d:0.04,i:"d",e:32,r:1,s:32,o:"98"},{f:"3",t:0,d:0.04,i:"a",e:0,r:1,s:0,o:"98"},{f:"3",t:0,d:0.04,i:"b",e:0,r:1,s:0,o:"98"},{f:"3",t:0,d:0.04,i:"c",e:32,r:1,s:32,o:"98"},{f:"4",t:0,d:0.04,i:"G",e:"#6A6A6A",r:1,s:"#6A6A6A",o:"25"},{f:"1",t:0.03,d:0.01,i:"e",e:"0.000000",r:1,s:"0.000000",o:"98"}],f:30},"94":{d:0.04,i:"94",n:"VET",a:[{f:"3",t:0,d:0.02,i:"e",e:"1.000000",r:1,s:"0.000000",o:"101"},{f:"3",t:0,d:0.04,i:"d",e:48,r:1,s:32,o:"101"},{f:"3",t:0,d:0.04,i:"a",e:-8,r:1,s:0,o:"101"},{f:"3",t:0,d:0.04,i:"b",e:-8,r:1,s:0,o:"101"},{f:"3",t:0,d:0.04,i:"c",e:48,r:1,s:32,o:"101"},{f:"4",t:0,d:0.04,i:"G",e:"#D71E00",r:1,s:"#6A6A6A",o:"28"}],f:30},"53":{d:0.04,i:"53",n:"BRTO",a:[{f:"3",t:0,d:0.04,i:"d",e:32,r:1,s:32,o:"51"},{f:"3",t:0,d:0.04,i:"a",e:0,r:1,s:0,o:"51"},{f:"3",t:0,d:0.04,i:"b",e:0,r:1,s:0,o:"51"},{f:"3",t:0,d:0.04,i:"c",e:32,r:1,s:32,o:"51"},{f:"4",t:0,d:0.04,i:"G",e:"#6A6A6A",r:1,s:"#6A6A6A",o:"19"},{f:"1",t:0.03,d:0.01,i:"e",e:"0.000000",r:1,s:"0.000000",o:"51"}],f:30},"91":{d:0.04,i:"91",n:"PETO",a:[{f:"3",t:0,d:0.04,i:"d",e:32,r:1,s:32,o:"99"},{f:"3",t:0,d:0.04,i:"a",e:0,r:1,s:0,o:"99"},{f:"3",t:0,d:0.04,i:"b",e:0,r:1,s:0,o:"99"},{f:"3",t:0,d:0.04,i:"c",e:32,r:1,s:32,o:"99"},{f:"4",t:0,d:0.04,i:"G",e:"#6A6A6A",r:1,s:"#6A6A6A",o:"26"},{f:"1",t:0.03,d:0.01,i:"e",e:"0.000000",r:1,s:"0.000000",o:"99"}],f:30},"58":{d:0.04,i:"58",n:"CLTO",a:[{f:"3",t:0,d:0.04,i:"d",e:32,r:1,s:32,o:"55"},{f:"3",t:0,d:0.04,i:"a",e:0,r:1,s:0,o:"55"},{f:"3",t:0,d:0.04,i:"b",e:0,r:1,s:0,o:"55"},{f:"3",t:0,d:0.04,i:"c",e:32,r:1,s:32,o:"55"},{f:"4",t:0,d:0.04,i:"G",e:"#6A6A6A",r:1,s:"#6A6A6A",o:"22"},{f:"1",t:0.03,d:0.01,i:"e",e:"0.000000",r:1,s:"0.000000",o:"55"}],f:30},"95":{d:0.04,i:"95",n:"VETO",a:[{f:"3",t:0,d:0.04,i:"d",e:32,r:1,s:32,o:"101"},{f:"3",t:0,d:0.04,i:"a",e:0,r:1,s:0,o:"101"},{f:"3",t:0,d:0.04,i:"b",e:0,r:1,s:0,o:"101"},{f:"3",t:0,d:0.04,i:"c",e:32,r:1,s:32,o:"101"},{f:"4",t:0,d:0.04,i:"G",e:"#6A6A6A",r:1,s:"#6A6A6A",o:"28"},{f:"1",t:0.03,d:0.01,i:"e",e:"0.000000",r:1,s:"0.000000",o:"101"}],f:30},"86":{d:0.04,i:"86",n:"ECT",a:[{f:"3",t:0,d:0.02,i:"e",e:"1.000000",r:1,s:"0.000000",o:"97"},{f:"3",t:0,d:0.04,i:"d",e:48,r:1,s:32,o:"97"},{f:"3",t:0,d:0.04,i:"a",e:-8,r:1,s:0,o:"97"},{f:"3",t:0,d:0.04,i:"b",e:-8,r:1,s:0,o:"97"},{f:"3",t:0,d:0.04,i:"c",e:48,r:1,s:32,o:"97"},{f:"4",t:0,d:0.04,i:"G",e:"#D71E00",r:1,s:"#6A6A6A",o:"24"}],f:30},"92":{d:0.04,i:"92",n:"UYT",a:[{f:"3",t:0,d:0.02,i:"e",e:"1.000000",r:1,s:"0.000000",o:"100"},{f:"3",t:0,d:0.04,i:"d",e:48,r:1,s:32,o:"100"},{f:"3",t:0,d:0.04,i:"a",e:-8,r:1,s:0,o:"100"},{f:"3",t:0,d:0.04,i:"b",e:-8,r:1,s:0,o:"100"},{f:"3",t:0,d:0.04,i:"c",e:48,r:1,s:32,o:"100"},{f:"4",t:0,d:0.04,i:"G",e:"#D71E00",r:1,s:"#6A6A6A",o:"27"}],f:30},"49":{d:0.04,i:"49",n:"ARTO",a:[{f:"3",t:0,d:0.04,i:"d",e:32,r:1,s:32,o:"68"},{f:"3",t:0,d:0.04,i:"a",e:0,r:1,s:0,o:"68"},{f:"3",t:0,d:0.04,i:"b",e:0,r:1,s:0,o:"68"},{f:"3",t:0,d:0.04,i:"c",e:32,r:1,s:32,o:"68"},{f:"4",t:0,d:0.04,i:"G",e:"#6A6A6A",r:1,s:"#6A6A6A",o:"67"},{f:"1",t:0.03,d:0.01,i:"e",e:"0.000000",r:1,s:"0.000000",o:"68"}],f:30},"87":{d:0.04,i:"87",n:"ECTO",a:[{f:"3",t:0,d:0.04,i:"d",e:32,r:1,s:32,o:"97"},{f:"3",t:0,d:0.04,i:"a",e:0,r:1,s:0,o:"97"},{f:"3",t:0,d:0.04,i:"b",e:0,r:1,s:0,o:"97"},{f:"3",t:0,d:0.04,i:"c",e:32,r:1,s:32,o:"97"},{f:"4",t:0,d:0.04,i:"G",e:"#6A6A6A",r:1,s:"#6A6A6A",o:"24"},{f:"1",t:0.03,d:0.01,i:"e",e:"0.000000",r:1,s:"0.000000",o:"97"}],f:30},"72":{d:0.04,i:"72",n:"COT",a:[{f:"3",t:0,d:0.02,i:"e",e:"1.000000",r:1,s:"0.000000",o:"71"},{f:"3",t:0,d:0.04,i:"d",e:48,r:1,s:32,o:"71"},{f:"3",t:0,d:0.04,i:"a",e:-8,r:1,s:0,o:"71"},{f:"3",t:0,d:0.04,i:"b",e:-8,r:1,s:0,o:"71"},{f:"3",t:0,d:0.04,i:"c",e:48,r:1,s:32,o:"71"},{f:"4",t:0,d:0.04,i:"G",e:"#D71E00",r:1,s:"#6A6A6A",o:"23"}],f:30},"45":{d:0.04,i:"45",n:"ART",a:[{f:"3",t:0,d:0.02,i:"e",e:"1.000000",r:1,s:"0.000000",o:"68"},{f:"3",t:0,d:0.04,i:"d",e:48,r:1,s:32,o:"68"},{f:"3",t:0,d:0.04,i:"a",e:-8,r:1,s:0,o:"68"},{f:"3",t:0,d:0.04,i:"b",e:-8,r:1,s:0,o:"68"},{f:"3",t:0,d:0.04,i:"c",e:48,r:1,s:32,o:"68"},{f:"4",t:0,d:0.04,i:"G",e:"#D71E00",r:1,s:"#6A6A6A",o:"67"}],f:30},kTimelineDefaultIdentifier:{d:0.27,i:"kTimelineDefaultIdentifier",n:"Main Timeline",a:[{f:"4",t:0,d:0.25,i:"e",e:"1.000000",s:"0.000000",o:"5"},{f:"4",t:0,d:0.16,i:"e",e:"0.000000",s:"0.000000",o:"65"},{f:"3",t:0.09,d:0.11,i:"e",e:"1.000000",s:"0.000000",o:"60"},{f:"3",t:0.09,d:0.11,i:"e",e:"1.000000",s:"0.000000",o:"50"},{f:"3",t:0.1,d:0.11,i:"e",e:"1.000000",s:"0.000000",o:"59"},{f:"3",t:0.12,d:0.11,i:"e",e:"1.000000",s:"0.000000",o:"62"},{f:"3",t:0.12,d:0.11,i:"e",e:"1.000000",s:"0.000000",o:"54"},{f:"3",t:0.13,d:0.11,i:"e",e:"1.000000",s:"0.000000",o:"61"},{f:"3",t:0.14,d:0.11,i:"e",e:"1.000000",s:"0.000000",o:"63"},{f:"3",t:0.16,d:0.11,i:"e",e:"1.000000",s:"0.000000",o:"64"},{f:"3",t:0.16,d:0.11,i:"e",e:"1.000000",s:"0.000000",o:"65"}],f:30},"56":{d:0.04,i:"56",n:"CLT",a:[{f:"3",t:0,d:0.02,i:"e",e:"1.000000",r:1,s:"0.000000",o:"55"},{f:"3",t:0,d:0.04,i:"d",e:48,r:1,s:32,o:"55"},{f:"3",t:0,d:0.04,i:"a",e:-8,r:1,s:0,o:"55"},{f:"3",t:0,d:0.04,i:"b",e:-8,r:1,s:0,o:"55"},{f:"3",t:0,d:0.04,i:"c",e:48,r:1,s:32,o:"55"},{f:"4",t:0,d:0.04,i:"G",e:"#D71E00",r:1,s:"#6A6A6A",o:"22"}],f:30},"88":{d:0.04,i:"88",n:"MXT",a:[{f:"3",t:0,d:0.02,i:"e",e:"1.000000",r:1,s:"0.000000",o:"98"},{f:"3",t:0,d:0.04,i:"d",e:48,r:1,s:32,o:"98"},{f:"3",t:0,d:0.04,i:"a",e:-8,r:1,s:0,o:"98"},{f:"3",t:0,d:0.04,i:"b",e:-8,r:1,s:0,o:"98"},{f:"3",t:0,d:0.04,i:"c",e:48,r:1,s:32,o:"98"},{f:"4",t:0,d:0.04,i:"G",e:"#D71E00",r:1,s:"#6A6A6A",o:"25"}],f:30},"73":{d:0.04,i:"73",n:"COTO",a:[{f:"3",t:0,d:0.04,i:"d",e:32,r:1,s:32,o:"71"},{f:"3",t:0,d:0.04,i:"a",e:0,r:1,s:0,o:"71"},{f:"3",t:0,d:0.04,i:"b",e:0,r:1,s:0,o:"71"},{f:"3",t:0,d:0.04,i:"c",e:32,r:1,s:32,o:"71"},{f:"4",t:0,d:0.04,i:"G",e:"#6A6A6A",r:1,s:"#6A6A6A",o:"23"},{f:"1",t:0.03,d:0.01,i:"e",e:"0.000000",r:1,s:"0.000000",o:"71"}],f:30},"52":{d:0.04,i:"52",n:"BRT",a:[{f:"3",t:0,d:0.02,i:"e",e:"1.000000",r:1,s:"0.000000",o:"51"},{f:"3",t:0,d:0.04,i:"d",e:48,r:1,s:32,o:"51"},{f:"3",t:0,d:0.04,i:"a",e:-8,r:1,s:0,o:"51"},{f:"3",t:0,d:0.04,i:"b",e:-8,r:1,s:0,o:"51"},{f:"3",t:0,d:0.04,i:"c",e:48,r:1,s:32,o:"51"},{f:"4",t:0,d:0.04,i:"G",e:"#D71E00",r:1,s:"#6A6A6A",o:"19"}],f:30},"90":{d:0.04,i:"90",n:"PET",a:[{f:"3",t:0,d:0.02,i:"e",e:"1.000000",r:1,s:"0.000000",o:"99"},{f:"3",t:0,d:0.04,i:"d",e:48,r:1,s:32,o:"99"},{f:"3",t:0,d:0.04,i:"a",e:-8,r:1,s:0,o:"99"},{f:"3",t:0,d:0.04,i:"b",e:-8,r:1,s:0,o:"99"},{f:"3",t:0,d:0.04,i:"c",e:48,r:1,s:32,o:"99"},{f:"4",t:0,d:0.04,i:"G",e:"#D71E00",r:1,s:"#6A6A6A",o:"26"}],f:30}},o:"1"}];
	
	var javascripts = [];
	
	var functions = {};
	var javascriptMapping = {};
	for(var i = 0; i < javascripts.length; i++) {
		try {
			javascriptMapping[javascripts[i].identifier] = javascripts[i].name;
			eval("functions." + javascripts[i].name + " = " + javascripts[i].source);
		} catch (e) {
			hypeDoc.log(e);
			functions[javascripts[i].name] = (function () {});
		}
	}
	
	hypeDoc.setAttributeTransformerMapping(attributeTransformerMapping);
	hypeDoc.setResources(resources);
	hypeDoc.setScenes(scenes);
	hypeDoc.setJavascriptMapping(javascriptMapping);
	hypeDoc.functions = functions;
	hypeDoc.setCurrentSceneIndex(0);
	hypeDoc.setMainContentContainerID(mainContainerID);
	hypeDoc.setResourcesFolderName(resourcesFolderName);
	hypeDoc.setShowHypeBuiltWatermark(0);
	hypeDoc.setShowLoadingPage(false);
	hypeDoc.setDrawSceneBackgrounds(true);
	hypeDoc.setGraphicsAcceleration(true);
	hypeDoc.setDocumentName(documentName);

	HYPE.documents[documentName] = hypeDoc.API;
	document.getElementById(mainContainerID).setAttribute("HYPE_documentName", documentName);

	hypeDoc.documentLoad(this.body);
}());

