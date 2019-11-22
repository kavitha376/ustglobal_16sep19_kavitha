const message = new Promise(function(resolve,reject){
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
          
            else{
              reject('failed')
          }
    
    })
    message.then(function(msg){
        console.log('success message =',msg)
    }).catch(function(error){
        console.log('failure message =',error)
    })