const cricketer=['rahul','hardik','doni','dravid'];
 const isarrayOrNot=Array.isArray(cricketer);
console.log(isarrayOrNot);


console.log("............2nd example........");
const laptop=['hp','dell','lenova','coolpad'];
const value=Array.isArray(laptop);
console.log(value);


console.log("...........3rd example.........");

const pensil=['hp','appsara','nataraja','straper'];
const result=Array.isArray(pensil);
console.log(result);


console.log('............4th example.........');

const animals=['dog','cat','buffalo','cow'];
const values=Array.isArray(animals);
console.log(values);


console.log(".........5th........");
const mobiles=['coolpad','motorol','redmi','6T'];
const arrays=Array.isArray(mobiles);
console.log(arrays);

console.log("........6th .......");
const states=['up','mp','ap','bihar'];
const state=Array.isArray(states);
console.log(state);

console.log(".....7th.......");
const country=['landon','america','uk','us'];
const count=Array.isArray(country);
console.log(count);

console.log(".......8th......");
const books=['achiver','mangala','kavith'];
const book=Array.isArray(books);

console.log(book);

console.log(".....9th.....");
const actor=['srk','yash','dboss'];
const act1=Array.isArray(actor);


console.log(act1);

console.log("......10th......");
const waterbottle=['aqua','kinngfisher'];
const water=Array.isArray(waterbottle);

console.log(water);


console.log(">>>>>>>>>>>>>>>>include>>>>");
const bottle=['aqua','kinngfisher','360'];
const hasbottle=waterbottle.includes('kinngfisher',0);
console.log(hasbottle);

console.log("............2th.........");
const actorss=['srk','yash','dboss'];
const hasactorss=actorss.includes('ambrish',1);
console.log(hasactorss);

console.log(".......3rd........");
const books1=['achiver','mangala','kavith'];
const hasbook1=books1.includes('kavith',1);
console.log(hasbook1);

console.log("......4th.....");
const states1=['up','mp','ap','bihar'];
const hasstates1=states1.includes('mp',0);
console.log(hasstates1);

console.log(".........5th......");
const mobiles1=['coolpad','motorol','redmi','6T'];
const hasmobiles=mobiles1.includes('mi',2);
console.log(hasmobiles);

console.log("..........6th........");
const animalss=['dog','cat','buffalo','cow'];
const hasanimals=animalss.includes('buffalo',1);
console.log(hasanimals);


console.log("........7th.....");
const count1=['paris','new yark','usa','uk'];
const hascount=count1.includes('america',3);
console.log(hascount);

console.log("........8th.......");
const laptops=['hp','dell','lenova','coolpad'];
const haslaptops=laptops.includes("dell",0);
console.log(haslaptops);

console.log(".......9th.......");

const pensil1=['hp','appsara','nataraja','straper'];
const haspensil=pensil1.includes('straper',2);
console.log(haspensil);

console.log(".....10th.....");
const brands=["zara","hk","ck","puma"];
const hasbrands=brands.includes('ck',2);
console.log(hasbrands);


console.log(".....push.....");
const brands1=["zara","hk","ck","puma"];
brands1.push("pk");
console.log(brands1);

console.log("......2nd.....");
const pensil2=['hp','appsara','nataraja','straper'];
pensil2.push('raja');
console.log(pensil2);

console.log(".......3rd ......");
const countryss=['us','uk','america','paris'];
countryss.push("india","pakishthana");
console.log(countryss);

console.log('..........4th.......');
const colors=["red","pink","white","yellow"];
colors.push("orange","rosy");
console.log(colors);

console.log('.....5th.......');
const mobilebrands=["moto",'6t','redmi','hanor'];
mobilebrands.push('samsung');
console.log(mobilebrands);

console.log("......6th......");
const laptopsbrands=["hp","lenova","dell"];
laptopsbrands.push("assus");
console.log(laptopsbrands);

console.log(".....7th......");
const creams=['pondas','fairnlovly','whitetone'];
creams.push("butterfly");
console.log(creams);

console.log("......8th.......");
const watches=['titan','fastrac',"quads"];
watches.push("ronals","ck");
console.log(watches);

console.log("....9th.....");

const tea=["green","black","pink","white"];
tea.push("brown");
console.log(tea);

console.log("....10th.....");
const bags=['sky',"tunderbird","dell"];
bags.push('travel');
console.log(bags);

console.log("..........pop........");
const bagss=['sky',"tunderbird","dell"];
bagss.pop();
console.log("after popping",bagss);

console.log("......2nd example.....");
const tea1=["green","black","pink","white"];

tea1.pop();
console.log("after popping",tea1);

console.log("....3rd....");
const watches1=['titan','fastrac',"quads"];

watches1.pop();
console.log("after popping",watches1);

console.log("....4th examples....");
const creams1=['pondas','fairnlovly','whitetone'];

creams1.pop();
console.log("after popping",creams1);

console.log(".....5th example......");
const hobbies=["gymming","jogging","playing"];
hobbies.pop();
console.log("after popping",hobbies);

console.log(".....6th example......");
const booksname=["gandi","room104","titanic"];
booksname.pop();
console.log("after popping",booksname);

console.log(".....7th example......");
const states2=['up','mp','ap','bihar'];

states2.pop();
console.log("after popping",states2);

console.log(".....8th example......");
const count2=['paris','new yark','usa','uk'];



count2.pop();
console.log("after popping",count2);

console.log(".....9th example......");
const brands2=["zara","hk","ck","puma"];

brands2.pop();
console.log("after popping",brands2);

console.log(".....10th example......");
const laptopsbrands1=["hp","lenova","dell"];

laptopsbrands1.pop();
console.log("after popping",laptopsbrands1);

console.log(".....unshift  example......");
const lapbrands=["hp","lenova","dell"];

lapbrands.unshift("coolpad","mac");
console.log("add elements at first",lapbrands);

console.log(".....unshift 2nd example......");
const colors2=["red","pink","white","yellow"];


colors2.unshift("green","nilon");
console.log("add elements at first",colors2);


console.log(".....unshift 3rd example......");
const colorrs=["red","pink","white","yellow"];

colorrs.unshift("black","orange");
console.log("add elements at first",colorrs);

console.log(".....unshift 4th example......");
const aanimalss=['cow','buffalo','dog']
aanimalss.unshift("cat");
console.log("add elements at first",aanimalss);


console.log(".....unshift 5th example......");
const flowers=["rose",'lilly','jasmin']

flowers.unshift("chapk","whiterose");
console.log("add elements at first",flowers);

console.log(".....unshift 6th  example......");

const bookname=["gandi","room104","titanic"];
bookname.unshift("coolpad","mac");
console.log("add elements at first",bookname);


console.log(".....unshift 7th example......");
const hobbies4=["gymming","jogging","playing"];

hobbies4.unshift("chatting","chanting");
console.log("add elements at first",hobbies4);


console.log(".....unshift 8th example......");
const countr=['us','uk','america','paris'];
countr.unshift("coolpad","mac");
console.log("add elements at first",countr);


console.log(".....unshift 9th example......");
const pensil4=['hp','appsara','nataraja','straper'];


pensil4.unshift("pad","mark");
console.log("add elements at first",pensil4);

console.log(".....unshift 10th example......");
const bagages=['sky',"tunderbird","dell"];

bagages.unshift("himalayya","mamales");
console.log("add elements at first",bagages);

console.log("....shifts........")

console.log("......1st shift.....");
const bagagess=['sky',"tunderbird","dell"];

bagagess.shift();
console.log("add elements at first",bagagess);



console.log("......2nd shift.....");
const pencil=['hp','appsara','nataraja','straper'];

pencil.shift();
console.log("add elements at first",pencil);


console.log("......3rd shift.....");
const ccountryss=['us','uk','america','paris'];

ccountryss.shift();
console.log("add elements at first",ccountryss);



console.log(".....4th. shift.....");
const hobby=["gymming","jogging","playing"];


hobby.shift();
console.log("add elements at first",hobby);


console.log("......5th shift.....");
const flowerss=["rose",'lilly','jasmin']


flowerss.shift();
console.log("add elements at first",flowerss);


console.log("...... 6th shift.....");
const aanimalss1=['cow','buffalo','dog']

aanimalss1.shift();
console.log("add elements at first",aanimalss1);

console.log("......7th shift.....");
const lappbrands=["hp","lenova","dell"];


lappbrands.shift();
console.log("add elements at first",lappbrands);



console.log("......8th shift.....");
const brandss2=["zara","hk","ck","puma"];


brandss2.shift();
console.log("add elements at first",brandss2);


console.log("......9th shift.....");

const clothscolors=["red","pink","white"];
clothscolors.shift();
console.log("add elements at first",clothscolors);


console.log("......10th shift.....");
const airoplane=["kingfisher","airasia","airindia"];
airoplane.shift();
console.log("add elements at first",airoplane);

console.log(".......join.....")

console.log("......1st join.....");
const bagagess1=['sky',"tunderbird","dell"];

const exp1=bagagess1.join("-");
console.log("add elements at first",exp1);



console.log("......2nd join.....");
const pencil1=['hp','appsara','nataraja','straper'];

const exp2=pencil1.join("-");
console.log("add elements at first",exp2);


console.log("......3rd join....");
const ccountryss1=['us','uk','america','paris'];

const exp3=ccountryss1.join("-");
console.log("add elements at first",exp3);



console.log(".....4th. join.....");
const hobby1=["gymming","jogging","playing"];


const exp4=hobby1.join("-");
console.log("add elements at first",exp4);


console.log("......5th join.....");
const flowerss1=["rose",'lilly','jasmin']


const exp5=flowerss1.join("-");
console.log("add elements at first",exp5);


console.log("...... 6th join.....");
const aanimalss11=['cow','buffalo','dog']

const exp6=aanimalss11.join("-");
console.log("add elements at first",exp6);

console.log("......7th join.....");
const lappbrandss=["hp","lenova","dell"];


const exp7=lappbrandss.join("-");;
console.log("add elements at first",exp7);



console.log("......8th join.....");
const brandss22=["zara","hk","ck","puma"];


const exp8=brandss22.join("-");
console.log("add elements at first",exp8);


console.log("......9th join.....");

const clothscolors1=["red","pink","white"];
const exp9=clothscolors1.join("-");
console.log("add elements at first",exp9);


console.log("......10th join.....");
const airoplane1=["kingfisher","airasia","airindia"];
const exp10=airoplane1.join("-");
console.log("add elements at first",exp10);

console.log("......slice......")

const bagagess12=['sky',"tunderbird","dell"];

const expri1=bagagess12.slice(1,2);
console.log("add elements at first",expri1);



console.log("......2nd slice.....");
const pencil12=['hp','appsara','nataraja','straper'];

const expri2=pencil12.slice(0,2);
console.log("add elements at first",expri2);


console.log("......3rd slice....");
const ccountryss12=['us','uk','america','paris'];

const expri3=ccountryss12.slice(1,2);
console.log("add elements at first",expri3);



console.log(".....4th. join.....");
const hobby12=["gymming","jogging","playing"];


const expri4=hobby12.slice(1,2);
console.log("add elements at first",expri4);


console.log("......5th join.....");
const flowerss12=["rose",'lilly','jasmin']


const expri5=flowerss12.slice(1,2);
console.log("add elements at first",expri5);


console.log("...... 6th join.....");
const aanimalss112=['cow','buffalo','dog']

const expri6=aanimalss112.slice(1,2);
console.log("add elements at first",expri6);

console.log("......7th join.....");
const lappbrandss1=["hp","lenova","dell"];


const expri7=lappbrandss1.slice(1,2);
console.log("add elements at first",expri7);



console.log("......8th join.....");
const brandss221=["zara","hk","ck","puma"];


const expri8=brandss221.slice(1,2);
console.log("add elements at first",expri8);


console.log("......9th join.....");

const clothscolors11=["red","pink","white"];
const expri9=clothscolors11.slice(0,1);
console.log("add elements at first",expri9);


console.log("......10th join.....");
const airoplane11=["kingfisher","airasia","airindia"];
const expri10=airoplane11.slice(2,3);
console.log("add elements at first",expri10);

console.log("........splice.......");

const bagag=['sky',"tunderbird","dell"];

const expriment1=bagag.splice(1,2,'zara','mk');
console.log("add elements at first",expriment1);



console.log("......2nd slice.....");
const penci=['hp','appsara','nataraja','straper'];

const expriment2=penci.splice(0,2,'renno','mello');
console.log("add elements at first",expriment2);


console.log("......3rd splice....");
const ccou=['us','uk','america','paris'];

const expriment3=ccou.splice(1,2,'paris','swiz');
console.log("add elements at first",expriment3);



console.log(".....4th. splice.....");
const hobb=["gymming","jogging","playing"];


const expriment4=hobb.splice(1,2,'chatting',"chantting");
console.log("add elements at first",expriment4);


console.log("......5th splice.....");
const flow=["rose",'lilly','jasmin']


const expriment5=flow.splice(1,2,'whitelilly','pinly');
console.log("add elements at first",expriment5);


console.log("...... 6th splice.....");
const aani=['cow','buffalo','dog']

const expriment6=aani.splice(1,2,"pig",'goat');
console.log("add elements at first",expriment6);

console.log("......7th splice.....");
const lapp=["hp","lenova","dell"];


const expriment7=lapp.splice(1,2,'assus','windows');
console.log("add elements at first",expriment7);



console.log("......8th splice.....");
const bran=["zara","hk","ck","puma"];


const expriment8=bran.splice(1,2,'adidas','mk');
console.log("add elements at first",expriment8);


console.log("......9th splice.....");

const clot=["red","pink","white"];
const expriment9=clot.splice(1,0,'blue','orange');
console.log("add elements at first",expriment9);


console.log("......10th splice.....");
const airopl=["kingfisher","airasia","airindia"];
const expriment10=airopl.splice(2,3,'airjet','jetair');
console.log("add elements at first",expriment10);

console.log(".........map......");

const number=[100,200,300,400,500];
const number2=number.map(function(value,index){
    let newValue=value+50;
    return newValue;

})
console.log("after mapping",number2);

console.log(".....2nd......");

const number1=[11,20,30,4,5];
const number11=number1.map(function(value,index){
    let newValue=value+10;
    return newValue;

})
console.log("after mapping",number1);

const  price=[100,200,300,400]
const price1= price.map(function(value,index)
{
    let newValue = value + 50
     return newValue
})
console.log('after mapping',price1);

//using filter
const price3 = price.filter(function(value,index)
    {
         if(value >250)
            {  return true
            }
          else { return false
               }    
    }
    )
console.log('after mapping',price3);
console.log('=================================================================')

const  pricee=[100,200,300,400]
const price110= pricee.map(function(value,index)
{
    let newValue = value + 50
     return newValue
})
console.log('after mapping',price110);

//using filter
const price310 = pricee.filter(function(value,index)
    {
         if(value >250)
            {  return true
            }
          else { return false
               }    
    })
console.log('after mapping',price310);
console.log('=================================================================')
//2
console.log(".........map......");

const numberr=[100,200,300,400,500];
const number22=numberr.map(function(value,index){
    let newValue=value+50;
    return newValue;

})
console.log("after mapping",number22);

console.log(".....2nd......");

const number111=[11,20,30,4,5];
const number112=number111.map(function(value,index){
    let newValue=value+10;
    return newValue;

})
console.log("after mapping",number111);

const  pprice=[100,200,300,400]
const pprice1= pprice.map(function(value,index)
{
    let newValue = value + 50
     return newValue
})
console.log('after mapping',pprice1);

//using filter
const price311 = price.filter(function(value,index)
    {
         if(value >250)
            {  return true
            }
          else { return false
               }    
    }
    )
console.log('after mapping',price311);
console.log('=================================================================')

const price312 = price.filter(function(value,index)
    {
         if(value >100)
            {  return true
            }
          else { return false
               }    
    }
    )
console.log('after mapping',price312);
console.log('=================================================================')
