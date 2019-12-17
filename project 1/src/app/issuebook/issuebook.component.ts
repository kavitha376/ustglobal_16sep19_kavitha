import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-issuebook',
  templateUrl: './issuebook.component.html',
  styleUrls: ['./issuebook.component.css']
})
export class IssuebookComponent implements OnInit {
  name='';
  requests:any={};
  bookRequests:any[]=[];
  msg:string;
  constructor(private router:Router,private service:AuthService) {
    
    this.display();
   }
   display(){
    this.service.bookRequests().subscribe(data=>{
      console.log(data);
      this.requests=data;
      console.log(this.requests)
      console.log(this.requests.bookReg)
      this.bookRequests=this.requests.bookReg;
     })
   }
  

  acceptReq(reqs){
   
    this.service.acceptReq(reqs).subscribe(data=>{
      console.log(data);
      this.msg="you accepted the request";
      this.display();
    })
  }
  
 

  decline(reqs){
    console.log(reqs)
    console.log(reqs.bookId)
    
    this.service.declineBook(reqs.bookId,reqs).subscribe(data=>{
      console.log(data);
      this.msg="Request Declined...!";
      this.display();
    });
  }
  
 
 

  

 

  
  
 
  ngOnInit() {
  }

}
