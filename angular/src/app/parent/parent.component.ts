import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  selectedCar;
  cars=[
    {
      name:'audi',
      imgUrl:'https://cdn.pixabay.com/photo/2016/11/23/17/24/automobile-1853936__340.jpg'

  },
  {
    name:'bmw',
    imgUrl:'https://cdn.pixabay.com/photo/2014/07/01/12/35/taxi-cab-381233__340.jpg'

},
{
  name:'swift',
  imgUrl:'https://cdn.pixabay.com/photo/2016/02/13/13/11/cuba-1197800__340.jpg'

},
{
  name:'benz',
  imgUrl:'https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408__340.jpg'

}]

  constructor() { }

  ngOnInit() {
  }
  sendCar(car){
    this.selectedCar=car;
    console.log(car);

  }
}
