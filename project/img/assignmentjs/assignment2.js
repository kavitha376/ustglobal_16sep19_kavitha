
 //named function

function circumOfCircle(rad)
{
  console.log("circumference of circle="+2*3.14*rad); 

}
circumOfCircle(7);

console.log("<...................>");

//anonymous
var sub=function(rad)
{
    console.log("circumference of circle=",2*3.14*rad);

}
var value=sub(5);
console.log('value=',value);


console.log("..................");
//self invoke function

(function(rad){
    console.log('circumference of circle=',2*3.14*rad);
})(3)

//fat arrowfunction
console.log("................");

var val=(rad)=>
{
    console.log('circumference of circle=',2*3.14*rad);
}
val(8)
