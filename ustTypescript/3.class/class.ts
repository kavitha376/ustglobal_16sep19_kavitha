class Person{
    constructor(public name : string ,public age:number){

    }
}
let person1 = new Person('kavitha',21);
console.log(person1);


console.log("...............inheritence................");

class Student extends Person{
    constructor(name:string ,age:number ,public rollno:number){
        super(name,age);
    }
}
let student1 = new Student("harsha",25,122);
console.log(student1);