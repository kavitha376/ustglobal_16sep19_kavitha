import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-event',
  templateUrl: './event.component.html',
  styleUrls: ['./event.component.css']
})
export class EventComponent implements OnInit {
 inputData = '';
  constructor() { }
  printAlertmsg() {
    alert("hii hello kavi welcome");
  }
  dataInput(event) {
    console.log(event.target.value);
    this.inputData = event.target.value;
    
  }

  ngOnInit() {
  }

}
