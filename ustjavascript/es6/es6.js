const employee = new Promise(function(resolve,reject){
if(30>10){
    resolve([{


        name:'billgates',
        age:67

    },{
        name : 'jedd nexo',
        age : 45
    },
    {
        name:'kavitha gowda',
        age:40
    }])
      
 } else{
          reject('failed')
      }

})
employee.then(function(data){
    console.log('success message =',data)
}).catch(function(error){
    console.log('failure message =',error)
})
     
//closer

function outerfunction(counter){
    function innerfunction(){
        let count;
        count = counter + 10
        return count
    }
    return innerfunction
}
let innerfunc = outerfunction(20)
let counter = innerfunc()
console.log('counter value',counter)

