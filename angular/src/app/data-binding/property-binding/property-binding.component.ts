import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
  name = 'kavitha gowda';
  imgUrl = 'https://cdn.pixabay.com/photo/2017/11/04/11/25/fog-2917232_960_720.jpg';
   address = 'doddbalpur,banglore-560123';
   colorName = 'blue';
   isActive:boolean =false;
   colspanValue:number = 2;
  constructor() { }

  ngOnInit() {
    setInterval(() => {
    this.colorName = 'red';
    this.isActive = !this.isActive;
    // tslint:disable-next-line: whitespace
    },2000);
  }

}
