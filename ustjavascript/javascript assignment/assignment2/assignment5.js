//named function
function Prime(n)
{
    if(n === 0 || n===1)
    {
        return false;
    }
    else if(n === 2)
    {
       return true;
    }
    else
    {

    for(var i=2;i<n;i++)
    {
        if(n%i==0)
        {
            return false;
        }
        return true;
    }
 } 
}
console.log(Prime(5));
console.log(".............");

//anonymous

var print=function(n)
{
    if(n === 0 || n===1)
    {
        return false;
    }
    else if(n === 2)
    {
       return true;
    }
    else
    {
    for(var i=2;i<n;i++)
    {
        if(n%i==0)
        {
            console.log(false);
        }
        console.log(true) ;
    }
 }
}
var res=print(7);
console.log("the number is prime=",res);
console.log(".................");

//self invoke functions

(function(n)
{
    if(n === 0 || n===1)
    {
        return false;
    }
    else if(n === 2)
    {
       return true;
    }
    else
    {
    for(var i=2;i<n;i++)
    {
        if(n%i==0)
        {
            console.log(false);
        }
        console.log(true) ;
    }
 } 

})(3)


//fat arrow
var div=(n)=>
{
    if(n === 0 || n===1)
    {
        return false;
    }
    else if(n === 2)
    {
       return true;
    }
    else
    {
    for(var i=2;i<n;i++)
    {
        if(n%i==0)
        {
            console.log(false);
        }
        console.log(true) ;
    }
 }
}
div(11)