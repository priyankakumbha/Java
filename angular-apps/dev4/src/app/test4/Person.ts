export class Person 
{
    firstName : string ;
    lastName : string ;
    age : number;
    
    constructor(firstName : string, lastName : string, age: number)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    getPersonInfo() : string 
    {
        return this.firstName + ':' + this.lastName + ':' + this.age;
    }
}