import { Component, OnInit } from '@angular/core';
import{Person} from './Person';
@Component({
  selector: 'app-test4',
  templateUrl: './test4.component.html',
  styleUrls: ['./test4.component.css']
})
export class Test4Component implements OnInit {

  constructor() { }
person : Person = new Person('abc', 'xyz', 22);
  ngOnInit() {
  }
  getData() : string 
  {
    return this.person.getPersonInfo();
  }

}
