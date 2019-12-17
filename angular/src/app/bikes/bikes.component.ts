import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bikes',
  templateUrl: './bikes.component.html',
  styleUrls: ['./bikes.component.css']
})
export class BikesComponent implements OnInit {
  selectedbike;
  bikes=[
    {
      
      imgUrl :'https://cdn.pixabay.com/photo/2015/01/13/05/05/motorcycle-racer-597913__340.jpg',
     Model : 1945,
      name:'BMW'
  },
  {
    
    imgUrl:'https://cdn.pixabay.com/photo/2015/11/07/11/18/moped-1031006__340.jpg',
    Model : 1885,
    name:'Suzuki',
},
{
  
  imgUrl:'https://cdn.pixabay.com/photo/2019/09/23/08/01/traffic-4497805__340.jpg',
  Model : 1885,
  name:'Kawasaki',
},
{
  imgUrl:'https://cdn.pixabay.com/photo/2017/01/31/15/22/art-2025018__340.png',
  Model : 1885,
  name:'RE Classic 350',

}]
  constructor() { }

  ngOnInit() {
  }
  sendbike(bike){
    this.selectedbike=bike;
    console.log(bike);

  }

}
