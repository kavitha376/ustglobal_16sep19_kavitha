import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-forms2',
  templateUrl: './forms2.component.html',
  styleUrls: ['./forms2.component.css']
})
export class Forms2Component implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  CandidateData(form:NgForm){
    console.log(form);
  }

}
