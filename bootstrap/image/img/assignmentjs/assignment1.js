//named function
function factorial(x)
{
  if(x===0) 
   {
        return 1;
    }
    return x*factorial(x-1);
}
console.log("factorial of 5=",factorial(5));

//anonama
console.log(".................");

var fact = function factorial(y)
{
  if(y===0) 
   {
        return 1;
    }
    return y*fact(y-1);
}
var value = fact(4)
console.log("factorial of value=",value);

// self invoke function

console.log("......................");

(function(z)
{
  if(z===0) 
   {
        return 1;
    }
    console.log("the value of number=", z*fact(z-1));
    
})(4)

// fat arrowfunction

console.log(">.................................>");
var val=(a)=>
{
if(a===0) 
   {
        return 1;
    }
    console.log("the value of number=", a*fact(a-1));
}   
val(6)






