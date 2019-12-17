import { Component, OnInit, DoCheck, AfterViewChecked, AfterViewInit, OnDestroy } from '@angular/core';
// import { NgForm } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-registers',
  templateUrl: './registers.component.html',
  styleUrls: ['./registers.component.css']
})
export class RegistersComponent implements OnInit, DoCheck ,AfterViewInit,AfterViewChecked,OnDestroy{
 
 
  users;
  selectedUser;
  today = new Date();
  constructor(public service: UserService ) { 
    this.getData();
    console.log("constructor is exected")
  }

  ngOnInit() {
    console.log("ngOnint is executed");
  }
  
  // tslint:disable-next-line: adjacent-overload-signatures
  ngDoCheck(){
    console.log("ngDocheck is executed");
  }
  ngAfterViewInit(){
    console.log("ngafterviewint is executed");
  }
  ngAfterViewChecked(){
    console.log("ngAfterViewChecked is executed");
  }
  ngOnDestroy(){
    console.log("ngondestroy is executed");
  }
  loginData(form) {
    console.log(form.value);
    this.service.postUser(form.value).subscribe(data =>{
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('data posted succesfully');
    });

  }
  getData() {
    this.service.getUsers().subscribe(data=>{
      console.log(data);



      this.users = data;

    },err => {
      console.log(err);
    }, () => {
      console.log('data posted succesfully');
    })
  }
   
  deleteData(user){
    console.log(user);
    this.service.deleteUser(user.id).subscribe(data=> {
      console.log(data);
      this.getData();

    },err => {
      console.log(err);
    }, () => {
      console.log('data deleated succesfully');
    })
  }
  selectUser(user){
    console.log(user);
    this.selectedUser = user;
  }
  updateData(form){
    console.log(form.value);
    this.service.updateUser(form.value.is,form.value).subscribe(data=> {
      console.log(data);
      this.getData();

    },err => {
      console.log(err);
    }, () => {
      console.log('data updated succesfully');
    })
  }
}
