import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';


@Component({
  selector: 'app-addbooks',
  templateUrl: './addbooks.component.html',
  styleUrls: ['./addbooks.component.css']
})
export class AddbooksComponent implements OnInit {
  error: String;
  msg:string;
  constructor(private auth: AuthService) { }

addbooks(form: NgForm) {
  this.error = null;
  this.auth.addbooks(form.value)
    .subscribe(res => {
      console.log(res);
      this.msg="book is added sucessfully";
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });
}

  ngOnInit() {

    document.body.classList.add('bg-img');
  }

}
