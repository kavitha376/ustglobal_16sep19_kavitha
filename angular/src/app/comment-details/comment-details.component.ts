import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-comment-details',
  templateUrl: './comment-details.component.html',
  styleUrls: ['./comment-details.component.css']
})
export class CommentDetailsComponent implements OnInit {
  getComment: any[]=[];
  constructor() { }

  ngOnInit() {
  }
  getAllComments(childData){
    console.log("childData",childData);
    this.getComment.push(childData);

  }

}
