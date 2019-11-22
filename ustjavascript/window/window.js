//console.log('window object',window);
//console.log('this keyword',this);
//console.log(this===window);

//window.alert('welcome to javascript class');
//alert('welcome ust global and test yantra');

//let confirmdate =confirm('are you sure about all the polices');
//console.log('confirmdate',confirmdate);

//let username=prompt('what is your name',);
//console.log('username',username);


const person={
    firstname:'alia',
    age:26,
    lastname:'kapoor',
    getName:function(){
        return this.firstname+''+this.lastname
    }


}
let fullName = person.getName()
console.log(' Full Name',fullName)
