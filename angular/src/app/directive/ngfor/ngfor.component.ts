import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ngfor',
  templateUrl: './ngfor.component.html',
  styleUrls: ['./ngfor.component.css']
})
export class NgforComponent implements OnInit {

  products = [
    {
      img: 'https://cdn.pixabay.com/photo/2018/07/12/11/13/fresh-3533085_960_720.jpg ',
      name:'lemon',
      price: 250
    },
    {
      img: 'https://cdn.pixabay.com/photo/2019/09/29/15/45/cabbage-4513641__340.jpg ',
      name:'cabage',
      price: 950
    },
    {
      img: 'https://cdn.pixabay.com/photo/2019/09/27/09/39/melons-4507974__340.jpg',
      name:'coconut',
      price: 150
    },
  ];
  constructor() { }

  ngOnInit() {
  }

}
