let url = "http://localhost:9090";

let endPointResponse = "/api/forum/reponse";
let endPointResponses = "/api/forum/reponses";
let form = ('reponse');

window.onload = (event) => {
    console.log('The page has fully loaded');
    let msg = "La discution " + nameOfForum;
    let id ='reponsetName';
    addTitle(msg,id);
    retrievePosts(url,endPointResponses,form);
};
const submitF = document.getElementById('submitForm');
const myForm = document.getElementById('reponse');

eventListening(submitF,myForm,url,endPointResponse,form);