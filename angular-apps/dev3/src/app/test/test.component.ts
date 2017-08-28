import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {
param1 = "Hello";

param2: string = "hello to all";
param3: string = 'test to all';
  constructor() { }

  ngOnInit() {
  }

  test1()
  {
    return "from test1 method";
  }
  test2()
 {
     return this.param1;
   }
   test3()
   {
     alert("hello");
   }
   test4()
   {
     alert("Hello to all");
   }
   test5()
   {
     this.param1 = "Hello To Angular";
   }
   getImage()
   {
     return 'assets/back.jpg';
   }
}
