var brands=['kingfisher','oldmonk','jonywalker','vodka']
for( var Elements of brands)
{
    console.log('value =',Elements);
}
console.log(">>>>>>>>>>>>>>>>>>>>");

for( var index in brands){
    console.log('brands',brands[index]);
}
console.log(">>>>>>>>>>>>>>>>>>>>...");

var person={
    name:'sundari',
    age:33,
    color:'white',
}
for(var key in person){
    console.log('value=',person[key]);
}
console.log(">>>>>>>>>>>>>>>>>>>>>");
var cars=['nano','audi','bmw','ferori','lambrogini'];
cars.forEach(function(value,index){
    console.log('car=',value);
})
console.log("........................");

var item=[{
    item:'bangles',
    id:1,
    price:100

},
{
    item:'watch',
    id:2,
    price:3000
},
{
    item:'lipstick',
    id:3,
    price:350
},
{
    item:'shoes',
    id:4,
    price:500
}]

item.forEach(function(item,index){
    console.log('items=',item);
    console.log('index of item=',index);
})




