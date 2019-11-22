
console.log("..........examples for for loop..........");
var colors=["red","pink","blue","yellow","black"];
var i;
for( i = 0;i<colors.length; i++)
{
    console.log("colors are=",colors[i]);
}

console.log(">>>>>>>>>>2nd example>>>>>>>>>>>>>");

var bikes=["fz","royal enfiels","tvs","duke","unicorn"];
for(var i=0;i<bikes.length;i++)
{
    console.log("bikes are=",bikes[i]);
}
console.log(">>>>>>>3rd example>>>>>>");
var brands=["bukadi","vodka","jhony walker","king fisher"];
for(var i=0;i<brands.length;i++)
{
    console.log("brands are=",brands[i]);
}

console.log("...............4th examples.......");

var electronics=["laptop","mobile","straightner","charger"];
for(var i=0;i<electronics.length;i++)
{
    console.log("electronics are=",electronics[i]);
}

console.log(">>>>>>>>>>>5th examples>>>>>>>>>>>>>>>");
var books=["sapna","apsara","kavitha","saathi"];
for(var i=0;i<books.length;i++)
{
    console.log("bookes are=",books[i]);
}
console.log(">>>>>>>>>>>>>6th example>>>>>>>>>>>");
var pensile=["hp","nataraja","aprara"];
for(var i=0;i<pensile.length;i++)
{
    console.log("pensile are=",pensile[i]);
}

console.log(">>>>>>>>>>>>>.7th example>>>>>>>>>>>");
var colors=["red","black","pink","green"];
for(var i=0;i<colors.length;i++)
{
    console.log("colors are=",colors[i]);
}

console.log(">>>>>>>>>>>>>>8th example>>>>>>>>>>");
var state=["mp","up","ap","bihar"];
for(var i=0;i<state.length;i++)
{
    console.log("states are=",state[i]);
}

console.log(">>>>>>>>>>>>>>9th example>>>>>>>>>>");
var actor=["ranbineer","ranvire","srk","rithik"];
for(var i=0;i<actor.length;i++)
{
    console.log("actors are=",actor[i]);
}

console.log(">>>>>>>>>>>>>>10th example>>>>>>>>>>");
var heroin=["alia","priyanka","karishama","rashmika"];
for(var i=0;i<heroin.length;i++)
{
    console.log("actorss are=",heroin[i]);
}


console.log(">>>>>>>>>>>>>> example>>>>>>>>>>");



console.log("<<<<<<for of>>>>>>>>>>>>>>");
var books=["sapna","apsara","kavitha","saathi"];

for( var values of books)
{
    console.log("value =",values);
}

console.log(">>>>>>>>>second example>>>>>>>>>");

var electronics=["laptop","mobile","straightner","charger"];
for( var example of electronics)
{
    console.log("electronics are =",example);
}

console.log("<<<<<<<<<<<3rd examples>>>>>>>>>>>");
var dabas=["swathi","kruthanga","nanadana","druid"];
for(var elem of dabas)
{
    console.log("dabas are=",elem);

}
console.log("<<<<<<<<<4th examples>>>>>>>>");
var shopping=["cloths","jeans","lipstick","earphone"];
for(var result of shopping)
{
    console.log("shopping are=",result);
}

console.log("<<<<<<<<<<.5th examples.>>>>>>>");
var bikes=["fz","royal enfiels","tvs","duke","unicorn"];
for(var result of bikes)
{
    console.log("bikes are=",result);

}
console.log(">>>>>>>>>>>>>>6th example>>>>>>>>>>");
var heroin=["alia","priyanka","karishama","rashmika"];
for(var result of heroin)
{
    console.log("actorss are=",result);
}
console.log(">>>>>>>>>>>>>>7th example>>>>>>>>>>");
var actor=["ranbineer","ranvire","srk","rithik"];
for(var result of actor)
{
    console.log("actorss are=",result);
}

console.log(">>>>>>>>>>>>>>8th example>>>>>>>>>>");
var colors=["red","black","pink","green"];
for(var result of colors)
{
    console.log("actorss are=",result);
}
console.log(">>>>>>>>>>>>>>9th example>>>>>>>>>>");
var country=["us","uk","paris","swiz"];
for(var result of country)
{
    console.log("actorss are=",result);
}
console.log(">>>>>>>>>>>>>>10th example>>>>>>>>>>");
var pen=["red","black","pink","green"];
for(var result of pen)
{
    console.log("actorss are=",result);
}


console.log("<<<<<<<<<<for in >>>>>>>>>>>>>");


var books=["sapna","apsara","kavitha","saathi"];

for( var values in books)
{
    console.log("value =",books[values]);
}

console.log("<<<<2nd example>>>>>>>");
var bikes=["fz","royal enfiels","tvs","duke","unicorn"];
for(var result in bikes)
{
    console.log("bikes are=",bikes[result]);
}
console.log("<<<<<<<<<<<3rd example>>>>>>>>");
var books=["sapna","apsara","kavitha","saathi"];

for( var values in books)
{
    console.log("value =",books[values]);
}
console.log("<<<<<<<<<<4th exaple>>>>>>>>>>");

var shopping=["cloths","jeans","lipstick","earphone"];
for(var result in shopping)
{
    console.log("shopping are=",shopping[result]);
}
console.log("<<<<<<<<<<<<5th example>>>>>>>>");
var dabas=["swathi","kruthanga","nanadana","druid"];
for(var elem in dabas)
{
    console.log("dabas are=",dabas[elem]);

}
console.log(">>>>>>>>>>>>>>6th example>>>>>>>>>>");
var heroin=["alia","priyanka","karishama","rashmika"];
for(var result in heroin)
{
    console.log("actorss are=",heroin[result]);
}
console.log(">>>>>>>>>>>>>>7th example>>>>>>>>>>");
var actor=["ranbineer","ranvire","srk","rithik"];
for(var result in actor)
{
    console.log("actorss are=",actor[result]);
}

console.log(">>>>>>>>>>>>>>8th example>>>>>>>>>>");
var colors=["red","black","pink","green"];
for(var result in colors)
{
    console.log("actorss are=",colors[result]);
}
console.log(">>>>>>>>>>>>>>9th example>>>>>>>>>>");
var country=["us","uk","paris","swiz"];
for(var result in country)
{
    console.log("actorss are=",country[result]);
}
console.log(">>>>>>>>>>>>>>10th example>>>>>>>>>>");
var pen=["red","black","pink","green"];
for(var result in pen)
{
    console.log("actorss are=",pen[result]);
}


console.log("<<<<<<<for each>>>>>>>.");
var cars=['nano','audi','bmw','ferori','lambrogini'];
cars.forEach(function(value,index){
    console.log('car=',value);
})

console.log("<<<<<<<<<<2nd exaample>>>>>>>>");
var dabas=["swathi","kruthanga","nanadana","druid"];
dabas.forEach(function(value,index){
    console.log('dabas=',value);
})

console.log("<<<<<3rd example")
var books=["sapna","apsara","kavitha","saathi"];
books.forEach(function(value,index){
    console.log('bookes=',value);
})

console.log("<<<<<<<<<<4th>>>>>>>>>>");
var bikes=["fz","royal enfiels","tvs","duke","unicorn"];
bikes.forEach(function(value,index){
    console.log('bikes=',value);
})

console.log("<<<<<<<<<<<<<<5th example>>>>>>>>");
var shopping=["cloths","jeans","lipstick","earphone"];
shopping.forEach(function(value,index){
    console.log('bikes=',value);
})
console.log(">>>>>>>>>>>>>>6th example>>>>>>>>>>");
var heroin=["alia","priyanka","karishama","rashmika"];
heroin.forEach(function(value,index){
    
    console.log("actorss are=",value);
})

console.log(">>>>>>>>7th example");
var actor=["ranbineer","ranvire","srk","rithik"];
actor.forEach(function(value,index)
    {
    console.log("actorss are=",value);
})

console.log(">>>>>>>>>>>>>>8th example>>>>>>>>>>");
var colors=["red","black","pink","green"];
colors.forEach(function(value,index){
    
    console.log("actorss are=",value);
})
console.log(">>>>>>>>>>>>>>9th example>>>>>>>>>>");
var country=["us","uk","paris","swiz"];
country.forEach(function(value,index){
    
    console.log("actorss are=",value);
})

console.log(">>>>>>>>>>>>>>10th example>>>>>>>>>>");
var pen=["red","black","pink","green"];
pen.forEach(function(value,index){
    
    console.log("actorss are=",value);
})

