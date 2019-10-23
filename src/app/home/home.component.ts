import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  isActive: boolean;
   imgName = 'https://cdn.pixabay.com/photo/2019/10/02/14/09/jam-4521023__340.jpg' ;
   imgPic = 'https://cdn.pixabay.com/photo/2019/09/19/17/40/insects-4489864__340.jpg';
   picture = 'https://cdn.pixabay.com/photo/2019/09/30/14/51/squirrel-4515962__340.jpg';
   pic = 'https://cdn.pixabay.com/photo/2019/10/03/11/14/camp-4522970_960_720.jpg';
   ColorName = 'red';
  constructor() {
    setInterval(() => {
      this.isActive = !this.isActive;
    }, 2000);
   }

  ngOnInit() {
  }

}
