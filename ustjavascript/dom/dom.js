/*
let h1Element=document.getElementById('demo');
console.log('Element=',h1Element)
h1Element.textContent='good evening';
console.log('Element Text=',h1Element.textContent)

console.log('>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>');

let buttonElement = document.createElement('button');
buttonElement.textContent='click me';
console.log('Button Element',buttonElement)


document.body.appendChild(buttonElement);
let ulElement = document.createElement('ul');
let li1Element = document.createElement('li');
let li2Element = document.createElement('li');
let li3Element = document.createElement('li');

li1Element.textContent = 'java'
li2Element.textContent ='sql'
li3Element.textContent = 'javascript'


ulElement.appendChild(li1Element)
ulElement.appendChild(li2Element)
ulElement.appendChild(li3Element)
document.body.appendChild(ulElement)


h1Element.style.color='red'
h1Element.style.fontSize = '30px'
li3Element.style.color = 'green'
*/

function showMessage(){
    alert('hii hello welcome');
}
function changeColor(){
    let pElement=document.getElementById('mover');
    pElement.style.color='blue'
}

function removeColor(){
    let pElement = document.getElementById('mover')
    pElement.style.color='red'
}
function printHello(){
    //console.log('hello')
    let userName = document.getElementById('username').value
    document.getElementById('showusername').textContent=userName;
}
let name = 'rakesh'
let age = 21
let phoneno = 7499881144

console.log('name is'+name +'age is'+age +'phono is'+phoneno);
console.log('name is ${name} Age is ${age} phone no is ${phoneno}')
console.log('2+2=$(2+2)')