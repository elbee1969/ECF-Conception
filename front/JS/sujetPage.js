let url = "http://localhost:9090";
let endPointSujet = "/api/forum/sujet";

window.onload = (event) => {
    console.log('The page has fully loaded');
let msg = "Création d'un sujet du forum " + nameOfForum;
let id ='sujetName';
addTitle(msg,id);
};

const submitF = document.getElementById('submitForm');
const myForm = document.getElementById('sujet');
let form = ('sujet');

eventListening(submitF,myForm,url,endPointSujet,form);