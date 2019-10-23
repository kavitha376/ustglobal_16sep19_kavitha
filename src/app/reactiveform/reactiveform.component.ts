import { Component, OnInit } from '@angular/core';
import { NgForm, FormGroup, FormControl,Validators } from '@angular/forms';

@Component({
  selector: 'app-reactiveform',
  templateUrl: './reactiveform.component.html',
  styleUrls: ['./reactiveform.component.css']
})
export class ReactiveformComponent implements OnInit {
 get email(){
   return this.form.get('email');
 }
 get password()
 {
   return this.form.get('password');
 }
  form = new FormGroup({
    email: new FormControl( ' ' , [Validators.required]),
    password: new FormControl( '' , [Validators.required])

});
  constructor() { }

  ngOnInit() {
  }
  loginData(form: NgForm)
  {
    console.log(form.value);
  }

}
