import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-laptops',
  templateUrl: './laptops.component.html',
  styleUrls: ['./laptops.component.css']
})

export class LaptopsComponent implements OnInit {

  selectedLaptop;

  laptops=[
    {
      
      imgUrl:'https://cdn.pixabay.com/photo/2018/03/01/09/33/laptop-3190194__340.jpg',
      name:'Asus ROG Gaming',
      price:'Rs-53000'

  },
  {

    imgUrl:'https://cdn.pixabay.com/photo/2018/02/16/10/52/beverage-3157395__340.jpg',
    name:'HP Pavillion',
    price:'Rs-40000'
    

},
{
 
  imgUrl:'https://cdn.pixabay.com/photo/2014/05/02/21/49/home-office-336373__340.jpg',
  name:'Toshiba',
  price:'rs-690000'

},
{
 
  imgUrl:'https://cdn.pixabay.com/photo/2014/05/02/21/47/workstation-336369__340.jpg',
  name:'Apple Macbook air',
  price:'Rs-59999'


}]

  constructor() { }

  ngOnInit() {
  }
  sendlaptop(laptop){
    this.selectedLaptop=laptop;
  console.log(laptop);

  }

}
