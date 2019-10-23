import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';

import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { PracticeComponent } from './practice/practice.component';
import { HomeComponent } from './home/home.component';
import { MoviesComponent } from './movies/movies.component';
import { AddmoviesComponent } from './addmovies/addmovies.component';
import { LoginComponent } from './login/login.component';
import { ReactiveformComponent } from './reactiveform/reactiveform.component';


@NgModule({
  declarations: [
    AppComponent,
    PracticeComponent,
    HomeComponent,
    MoviesComponent,
    AddmoviesComponent,
    LoginComponent,
    ReactiveformComponent,
   
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,


    
     RouterModule.forRoot([
       {path :'home' ,component:HomeComponent},
       {path :'movies' ,component:MoviesComponent},
       {path :'addmovie' ,component:AddmoviesComponent},
       {path :'login' ,component:LoginComponent},
       {path :'reactive' ,component: ReactiveformComponent}



     
  ])
],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }