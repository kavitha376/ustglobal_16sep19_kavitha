//named functions

function add(num1,num2)
{
    console.log('sum=',num1+num2);

}
add(10,12);//as like java creationg object and passing values

//function expression(annonymous)
var sub=function(num1,num2)
{
     var subValue=num1-num2;
     return subValue;


}
var value=sub(90,89)
console.log('value=',value);
var a=Math.floor(10.6);
console.log('the value is=',a);
console.log('hello');
//self invole functions
(function(num1,num2){
    console.log('value=',num1*num2)
})(10,20)




//no method overloading in javascript

var div=(num1,num2)=>{
    console.log('value=',num1/num2);

}
div(10,5)

var div1=num1=>{
    console.log('value=',num1);
}
div1(10)


var div2=num1=>console.log(num1);
div2(10)


var add1=(num1,num2)=>num1+num2;
var a=add1(10,30)

var value1=add2(10,20);




console.log("........................");

greeting('kavitha');
function greeting(msg)
{
    console.log('hello',msg);
}

console.log("....................")
greeting('Dinga');

var greet = function(msg)
{
    console.log('hi',msg);
}

console.log(">...............>");

greeting('dingi');
var greets=(msg)=>{
    console.log('hi',msg);
}