import { Component } from "@angular/core";

import { templateJitUrl } from '@angular/compiler';
import { HttpClient } from '@angular/common/http';





@Component({
    selector: 'app-home',
    templateUrl: './home.component.html',
    styleUrls: ['./home.component.css']
})

export class homeComponent{
    news;
    constructor(private http:HttpClient) {
      this.getNews();
    }
    getNews() {
        this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=33ed0710712244c7aa25fc46fe4dba7e').subscribe(data=>{
   
       this.news = data.articles;

    }, err =>  {
        console.log(err);
    }, () => {
        console.log('new got sucessfully');
    });
  }
}