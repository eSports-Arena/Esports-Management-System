function getGame(){
	let httpRequest = new XMLHttpRequest();
	httpRequest.open("POST",'http://localhost:8080/getDetails')
	httpRequest.send();
	httpRequest.onload = function(){
		alert(httpRequest.responseText);
		return response;
	}
	console.log("inside the .js file");
}