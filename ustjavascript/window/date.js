var todayDate=new Date();
console.log('today Date',todayDate);
console.log('day',todayDate.getDay());
console.log('year',todayDate.getFullYear());
console.log('month',todayDate.getMonth());
console.log('date',todayDate.getDate());

var constmili = new Date(0);
console.log('date',constmili);

var constString = new Date('nov 10');
console.log('date string constructor',constString);

var constYear=new Date(2017,10);
console.log('date year Constructor',constYear);