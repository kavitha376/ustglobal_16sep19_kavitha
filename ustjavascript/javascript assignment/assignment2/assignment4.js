function addArray(arr)
{
    var additionOfArray=0;
    for(var i in arr)
    {
        additionOfArray+=arr[i];
    }
    console.log('addition of array=',additionOfArray);
}
var arr=[10,20,30,40,50,];
addArray(arr);

//<..................>>

var value=function (arr)
{
    var additionOfArray=0;
    for(var i in arr)
    {
        additionOfArray+=arr[i];
    }
return additionOfArray;
}
var addval=value(arr);
console.log('addition of array=',addval);

//<..................>>

