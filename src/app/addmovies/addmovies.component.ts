import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-addmovies',
  templateUrl: './addmovies.component.html',
  styleUrls: ['./addmovies.component.css']
})
export class AddmoviesComponent implements OnInit {

  get movie(){
    return this.form.get('movie');
  }

  get movieTitle(){
    return this.form.get('movieTitle');

    
  }
  get movieurl(){
    return this.form.get('movieurl');

    
  }
  get moviedesc(){
    return this.form.get('moviedesc');

    
  }
  form = new FormGroup({
    movie: new FormControl('', [Validators.required]),
    movieTitle: new FormControl('', [Validators.required]),
    movieurl: new FormControl('', [Validators.required]),
    moviedesc: new FormControl('', [Validators.required]),



  });

  constructor() { }

  ngOnInit() {
  }

  movieData(form){
    console.log(form);
  }
}
