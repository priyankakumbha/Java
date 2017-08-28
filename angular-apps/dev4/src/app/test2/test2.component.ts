import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test2',
  template: '<p>Hello to {{name}}</p><br>' +
  '<p>{{getHello()}}</p>',
  styles: ['p { font-weight:bold;}']
  
  
})
export class Test2Component implements OnInit {
name : string = 'Indian';
  constructor() { }

  ngOnInit() {
  }
  getHello() : string
  {
    return 'Hello to Angular2';
  }

}
