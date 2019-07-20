window.onclick = function() {
console.log("inside func");
console.log(location.href);
if(location.href.search("error") != -1) {
document.getElementById("err").style.visibility = "visible";
}
if(location.href.search("loged") != -1) {
document.getElementById("success").style.visibility = "visible";
}
}