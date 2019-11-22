const person={
               name:'sundara',
               age:100,
                color:'white',
                adress:{

                    city:'bijapura',
                    state:'karantaka',
                    pincode:561023
                },
                hobbies:['coding','bird watching','singing']
          }
         console.log("javascript person object",person)
          const jsonObject =  JSON.stringify(person)
          console.log('JSON person object',jsonObject)
          const javascriptpersonObject=JSON.parse(jsonObject)
          console.log('javascript person object after parse',javascriptpersonObject)


        // let value =
          localStorage.setItem('email','billgate@gmail.com')

         //console.log(value);
         const emailId = localStorage.getItem('email')
         console.log('EMAIL ID is',emailId)
         localStorage.clear();
