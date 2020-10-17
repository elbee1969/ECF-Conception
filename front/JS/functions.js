function postResponse(data,url,endPoint){
    values = data;
    let filler = "";
    values.forEach(value => reponse +=
        '<div class="cadre"><p>Surnom : ' + value.surnom + ', date : ' + value.date + '</p><div class="cadre">  <h2>Description : </h2><p>' + value.description + '</p><div class="cadre"><h3>Code : </h3><div class="cadre">' + value.code + '</div></div></div></div>'); 
        document.getElementById("reponse").innerHTML = filler;          
}

function setData(data){
    console.log("in setData!");
}

function submitForm(getForm,url,postEndPoint,form) {
    const formData = new FormData(getForm);
    let object = {};
    formData.forEach((value,key) => {
      object[key]= value;
    });
    let json = JSON.stringify(object);
    console.log("json : " + json);
    let myHeaders = new Headers();
    myHeaders.append("Content-Type", "application/json");
    let requestOptions = {
      method: 'POST',
      headers: myHeaders,
      body: json
    };
    
    fetch(url + postEndPoint, requestOptions)
      .then((response) => response.text())
      .then((result) => {
        console.log("result : " + JSON.stringify(result))
        redirect(form);
      })
      .catch(error => {
        console.log('error', error)
      });
    
}
let nameOfForum = "";
let nameSujet ="";

const retrievePosts = async function (url,getEndPoint,form) {
    try {
        let response = await fetch(url + getEndPoint);
        if (response.ok){
            let data = await response.json();

            if (form == 'reponse') {
    data.forEach(value => 
        console.log (value)); 

            }
        } else {
            console.error('Erreur serveur : ', response.status);
        }
    } catch (error) {
        console.log(error);
    }
}

function redirect(form){
    if (form == 'forum') {
        window.location.replace('/component/sujetPage.html')
    } else if (form == 'sujet') {
        window.location.replace('/component/reponsePage.html')
    } else {
        
    }
}

function addTitle(msg,id) {
    const tag = document.createElement("h1");
    const text = document.createTextNode(msg);
    tag.appendChild(text);
    const element = document.getElementById(id);
    element.prepend(tag);
}

function eventListening(submitF,myForm,url,endPoint,form){
    submitF.addEventListener('click', (e) => {
        e.preventDefault();
        submitForm(myForm,url,endPoint,form);
      });
}

function callbackRetrieve(url,endPoint){
    retrievePosts(url, endPoint)
}