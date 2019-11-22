const hobbies=["sleeping","cricket","eating","coding","roaming"];
console.log(typeof hobbies);


//is array method tocheck

const isarrayOrNot=Array.isArray(hobbies);
console.log("hobies array r not?",isarrayOrNot);

// include to whether present r not
const hascricket=hobbies.includes("cricket");
console.log("using include method",hascricket);


//push method to add the elemts to array
hobbies.push('guitor','valleyball');
console.log("after push method",hobbies);

//pop method to remove the elements
hobbies.pop();
console.log("after popping",hobbies);

//unshift method
hobbies.unshift("cooking","riding");
console.log("add elements at first",hobbies);

//shift method remove elemets from starting index
hobbies.shift()
console.log("remove elemets at first",hobbies);

//splice to add remove elemet from array 

hobbies.splice(1,2,"pub g","animal");
console.log("adding and removing",hobbies);

console.log("example 2 splice");
hobbies.splice(1,0,"gymming","jogging");
console.log("after splice",hobbies);

//splice only remove /add

const addoR=hobbies.slice(2,4);
console.log("display slice",addoR);



// join to separting 
const separate=hobbies.join("-");
console.log("after join method",separate);

const number=[100,200,300,400,500];
const number1=number.map(function(value,index){
    let newValue=value+50;
    return newValue;

})
console.log("after mapping",number1);

//by using fatarrow function



//to compare to elements by filter function
const number2=number.filter(function(value,index){
    if(value>200)
    {
        return true;
    }
    else
    {
        return false;
    }
})
console.log("after filter",number2);
// by using fat arrow function'

const num=number.filter(value => value>200 );
console.log(num);
    

const items=({
    name:'esr ring',
    id:1,
    price:5000

},
{
    name:'kajal',
    id:2,
    price:1000
},
{
    name:'trimmer',
    id:2,
    price:500
},
{
    name:'beado',
    id:2,
    price:250
})

    
const items2 = items.map(value => {
    const container = {};
    container[value.item] = value.item;
    container.id = value.id;
    container.price = value.price + 300;
    return container;
})
console.log("After map Arrow function", items2);



const item = [{
    item: 'Earring',
    id: 1,
    price: 5000
},
{
    item: 'Kajal',
    id: 2,
    price: 1000
},
{
    item: 'Trimmer',
    id: 3,
    price: 3000
},
{
    item: 'Beardo',
    id: 4,
    price: 170
}]


const item2 = item.map(value => {
    const container = {};
    container[value.item] = value.item;
    container.id = value.id;
    container.price = value.price + 300;
    return container;
})
console.log("After map Arrow function", items2);

console.log("------------------------------------------------")
console.log('=========2==============')
const cars = [{
    name: 'Audi',
    id: 2,
    price: 500000
}, {
    name: 'BMW',
    id: 2,
    price: 1000000
}, {
    name: 'Nano',
    id: 3,
    price: 100000
}, {
    name: 'Swift',
    id: 4,
    price: 500000
}]

const cars1 = cars.map(value => {

    const container1 = {};
    container1.name = value.name;
    container1.id = value.id;
    container1.price = value.price + 600;
    return container1;
})
console.log(cars1)
//console.log(items)
console.log('=========3===================')

const bikes = [{
    name: 'Duke',
    id: 2,
    price: 200000
}, {
    name: 'NS200',
    id: 2,
    price: 200000
}, {
    name: 'CBR',
    id: 3,
    price: 150000
}, {
    name: 'KTM',
    id: 4,
    price: 200000
}]

const bikes1 = bikes.map(value => {
    const container2 = {};
    container2.name = value.name;
    container2.id = value.id;
    container2.price = value.price + 300;
    return container2;
})
console.log(bikes1)
//console.log(items)
console.log('=========4===================')

const mobiles = [{
    name: 'Redmi',
    id: 2,
    price: 20000
}, {
    name: 'Honor 7x',
    id: 2,
    price: 20000
}, {
    name: 'Nokia',
    id: 3,
    price: 15000
}, {
    name: 'Samsung',
    id: 4,
    price: 25000
}]

const mobiles1 = mobiles.map(value => {
    const container3 = {};
    container3.name = value.name;
    container3.id = value.id;
    container3.price = value.price + 300;
    return container3;
})
console.log(mobiles1)
//console.log(items)

console.log('=========5===================')

const books = [{
    name: 'A',
    id: 2,
    price: 200
}, {
    name: 'B',
    id: 2,
    price: 300
}, {
    name: 'C',
    id: 3,
    price: 150
}, {
    name: 'D',
    id: 4,
    price: 2000
}]

const books1 = books.map(value => {
    const container4 = {};
    container4.name = value.name;
    container4.id = value.id;
    container4.price = value.price + 300;
    return container4;
})
console.log(books1)
//console.log(items)
console.log('=========6===================')

const movieTickets = [{
    name: 'Sahoo',
    id: 2,
    price: 200
}, {
    name: 'Valmiki',
    id: 2,
    price: 150
}, {
    name: 'Sye ra',
    id: 3,
    price: 300
}, {
    name: 'Arjun reddy',
    id: 4,
    price: 200
}]

const movieTickets1 = movieTickets.map(value => {
    const container5 = {};
    container5.name = value.name;
    container5.id = value.id;
    container5.price = value.price + 300;
    return container5;
})
console.log(movieTickets1)
//console.log(items)
console.log('=========7===================')

const pens = [{
    name: 'Reynolds',
    id: 2,
    price: 20
}, {
    name: 'B',
    id: 2,
    price: 20
}, {
    name: 'C',
    id: 3,
    price: 15
}, {
    name: 'D',
    id: 4,
    price: 20
}]

const pens1 = pens.map(value => {
    const container6 = {};
    container6.name = value.name;
    container6.id = value.id;
    container6.price = value.price + 300;
    return container6;
})
console.log(pens1)
//console.log(items)

console.log('=========8===================')

const pencils = [{
    name: 'A',
    id: 2,
    price: 20
}, {
    name: 'B',
    id: 2,
    price: 20
}, {
    name: 'C',
    id: 3,
    price: 15
}, {
    name: 'D',
    id: 4,
    price: 20
}]

const pencils1 = pencils.map(value => {
    const container7 = {};
    container7.name = value.name;
    container7.id = value.id;
    container7.price = value.price + 300;
    return container7;
})
console.log(pencils1)
//console.log(items)
console.log('=========9===================')

const Shoes = [{
    name: 'Reebook',
    id: 2,
    price: 2000
}, {
    name: 'Adidas',
    id: 2,
    price: 2500
}, {
    name: 'Puma',
    id: 3,
    price: 3000
}, {
    name: 'Sparx',
    id: 4,
    price: 1000
}]

const Shoes1 = Shoes.map(value => {
    const container8 = {};
    container8.name = value.name;
    container8.id = value.id;
    container8.price = value.price + 300;
    return container8;
})
console.log(Shoes1)
//console.log(items)
console.log('=========10===================')

const Shirts = [{
    name: 'Puma',
    id: 2,
    price: 1500
}, {
    name: 'Arrow',
    id: 2,
    price: 700
}, {
    name: 'Allen solley',
    id: 3,
    price: 1500
}, {
    name: 'Reymond',
    id: 4,
    price: 2000
}]

const Shirts1 = Shirts.map(value => {
    const container9 = {};
    container9.name = value.name;
    container9.id = value.id;
    container9.price = value.price + 300;
    return container9;
})
console.log(Shirts1)
