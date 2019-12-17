import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-removebooks',
  templateUrl: './removebooks.component.html',
  styleUrls: ['./removebooks.component.css']
})
export class RemovebooksComponent implements OnInit {

  books:any[]=[];
  search:string;
  msg:string;
  constructor(private auth: AuthService, private router: Router) {
     this.display();
}
display(){
  this.auth.viewBooks().subscribe(data=>{
    console.log(data);
    this.books=data.books;
})
}
   
  deleteBooks(book){
    this.auth.deleteBooks(book.bookId).subscribe(data=>{
      console.log(data);
      this.msg="Book Deleted Successfully";
      this.display();
    });
  }
  deleteBook(book){
    this.auth.deleteBooks(book.bookId).subscribe(data=>{
      console.log(data);
      this.msg ='Book Deleted Successfully';
      this.display();
    });
  }
ngOnInit() {
  }

}
