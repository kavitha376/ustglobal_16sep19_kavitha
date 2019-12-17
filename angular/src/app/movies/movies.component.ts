import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {
  selectedMovie;
  movies=[
    {
      
      imgUrl :'https://cdn.pixabay.com/photo/2019/05/10/18/21/thanos-4194122__340.png', 
      name:'Avengers',
      ratting:9/10,
    

  },
  {
    
    imgUrl:'https://cdn.pixabay.com/photo/2016/03/21/20/01/chaplin-1271422__340.jpg',
    name:'Charlie Chaplin',
    ratting:7/10,
    

},
{
  
  imgUrl:'https://cdn.pixabay.com/photo/2019/08/25/06/43/captain-america-4428842__340.jpg',
  name:'Spider Man',
  ratting:5/10,
  

   
  },

{
  imgUrl:'https://cdn.pixabay.com/photo/2019/04/08/16/27/spiderman-4112322__340.jpg',
  name:'Ironman',
  ratting:4/10,
 

}]

  constructor() { }

  ngOnInit() {
  }
  sendmovie(movie){
    this.selectedMovie=movie;
    console.log(movie);

  }

}
