//named function

function fibbnoci(number)
{
 var a=0,b=1,c=1;
 for(var i=2;i<=number;i++)
 {
     c=a+b;
     a=b;
     b=c;
 }
  console.log("the the fibnnoci =",c);

}
fibbnoci(4)

//anonymous
console.log(".........................");

var res=function(num)
{
    var a=0,b=1,c=1;
    for(var i=2;i<=num;i++)
    {
        c=a+b;
        a=b;
        b=c;
    }
}
var value=res(6);
console.log('value=',value);

console.log("..................");
(function(num)
{
    var a=0,b=1,c=1;
    for(var i=2;i<=num;i++)
    {
        c=a+b;
        a=b;
        b=c;
    }
    console.log("the fibnocci series are=",c);

})(6)



console.log("..............");
var res=(num)=>{
    var a=0,b=1,c=1;
    for(var i=2;i<=num;i++)
    {
        c=a+b;
        a=b;
        b=c;
    }
    console.log("the fibnocci series are=",c);

}
res(7)