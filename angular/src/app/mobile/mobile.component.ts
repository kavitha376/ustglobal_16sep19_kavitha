import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mobile',
  templateUrl: './mobile.component.html',
  styleUrls: ['./mobile.component.css']
})
export class MobileComponent implements OnInit {

  selectedMobile;
    mobiles=[
    {
      
      imgUrl :'https://cdn.pixabay.com/photo/2016/12/09/11/33/smartphone-1894723__340.jpg', 
      name:'RedMi',
      price:'Rs-12000'
    

  },
  {
    
    imgUrl:'https://cdn.pixabay.com/photo/2014/08/05/10/30/iphone-410324__340.jpg',
    name:'6T',
    price:'rs-52000'
    

},
{
  
  imgUrl:'https://cdn.pixabay.com/photo/2015/03/26/09/41/phone-690091__340.jpg',
  name:'assus',
  price:'Rs-12000'
  

   
  },

{
  imgUrl:'https://cdn.pixabay.com/photo/2015/05/12/09/13/social-media-763731__340.jpg',
  name:'Asus Zenfone 5',
  price:'Rs-14999'
 

}]

  constructor() { }

  ngOnInit() {
  }
  sendmobile(mobile){
    this.selectedMobile=mobile;
    console.log(mobile);

  }

}
