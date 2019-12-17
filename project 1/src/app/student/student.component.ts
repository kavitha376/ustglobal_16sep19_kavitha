import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {
books:any[]=[];
search:string[];
msg:string;
allocatedBooks:any ={};
  constructor(private auth: AuthService, private router: Router) { 
    this.display();
    
  }
  display(){
  this.auth.viewBooks().subscribe(data=>{
    console.log(data);
    this.books=data.books;
  });
}
  SendRequest(book){
    console.log(book);
    const userDetails =JSON.parse(localStorage.getItem('userDetails'));
    console.log('student details',userDetails);
    const userId= userDetails.users[0].userId;

    this.auth.requestBook(userId,book).subscribe(data=>{
    this.msg="resquest sent to d librarian";
      console.log(data);
      this.display();
    });
  }
  ngOnInit() {
  }

}
