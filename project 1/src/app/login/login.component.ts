import { Component, OnInit } from '@angular/core';
import {  NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {


  ngOnInit() {
}
 
  error;
  msg;

  constructor(private auth: AuthService, private router: Router) { }

  login(form:NgForm) {
   console.log(form.value)
   this.error =null;
   this.auth.loginUser(form.value).subscribe(data => {
      console.log('Response of login', data);
      if (data && data.message === 'Success') {
        localStorage.setItem('userDetails', JSON.stringify(data));
        const userDetails =JSON.parse(localStorage.getItem('userDetails'));
        console.log(userDetails);
        if (userDetails && userDetails.users[0].userRole  === 'admin') {
          this.router.navigateByUrl('/admin');
        }else if(userDetails && userDetails.users[0].userRole === 'student'){
          this.router.navigateByUrl('/student');

        } else{
          this.router.navigateByUrl('/issuebook');

        }
      form.reset();
      }else{
        this.msg="Invalid user name or password";
        form.reset();
      }
    }, err => {
            console.log(err);
      this.error = err.error.message;
    });
  }

}

