import { BrowserModule } from '@angular/platform-browser';
import { FormsModule ,ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { headerComponent } from './header/header.component';
import { homeComponent } from './home/home.component';
import { aboutComponent } from './about/about.component';


import { helpComponent } from './help/help.component';
import { logComponent } from './log/log.component';
import { RouterModule } from '@angular/router';
import { FooterComponent } from './footer/footer.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { PropertyBindingComponent } from './data-binding/property-binding/property-binding.component';
import { EventComponent } from './data-binding/event/event.component';
import { TwowayBindingComponent } from './data-binding/twoway-binding/twoway-binding.component';
import { DirectiveComponent } from './directive/directive.component';
import { NgifComponent } from './directive/ngif/ngif.component';
import { NgforComponent } from './directive/ngfor/ngfor.component';
import { NgModule } from '@angular/core';
import { NgswitchComponent } from './directive/ngswitch/ngswitch.component';
import { CustomDirective } from './custom.directive';
import { RegistersComponent } from './registers/registers.component';
import { FormsComponent } from './forms/forms.component';
import { Forms2Component } from './forms2/forms2.component';
import { Form3Component } from './form3/form3.component';
import { Form4Component } from './form4/form4.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { BikesComponent } from './bikes/bikes.component';
import { LaptopsComponent } from './laptops/laptops.component';
import { MoviesComponent } from './movies/movies.component';
import { BikechildComponent } from './bikechild/bikechild.component';
import { MoviechildComponent } from './moviechild/moviechild.component';
import { LaptopchildComponent } from './laptopchild/laptopchild.component';
import { MobileComponent } from './mobile/mobile.component';
import { MobilechildComponent } from './mobilechild/mobilechild.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import { DollarPipe } from './dollar.pipe';


@NgModule({
  declarations: [
    AppComponent,
    headerComponent,
    homeComponent,
    aboutComponent,
    helpComponent,
    logComponent,
    FooterComponent,
    DataBindingComponent,
    PropertyBindingComponent,
    EventComponent,
    TwowayBindingComponent,
    DirectiveComponent,
    NgifComponent,
    NgforComponent,
    NgswitchComponent,
    CustomDirective,
    RegistersComponent,
    FormsComponent,
    Forms2Component,
    Form3Component,
    Form4Component,
    ReactiveFormComponent,
    ParentComponent,
    ChildComponent,
  
    BikesComponent,
    LaptopsComponent,
    MoviesComponent,
    BikechildComponent,
    MoviechildComponent,
    LaptopchildComponent,
    MobileComponent,
    MobilechildComponent,
    CommentComponent,
    CommentDetailsComponent,
    DollarPipe,
    

  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path: 'home', component: homeComponent},
      {path: 'about', component: aboutComponent},
      {path: 'help', component: helpComponent},
      {path: 'log', component: logComponent},
      {path: 'property-binding', component: PropertyBindingComponent },
      {path: 'event-binding' , component: EventComponent },
      {path: 'twoway-binding' , component: TwowayBindingComponent},
      {path: 'ng-if' , component: NgifComponent},
      {path: 'ng-for', component: NgforComponent},
      {path: 'ng-switch', component: NgswitchComponent},
      {path: 'register', component:RegistersComponent},
      {path: 'forms',component: FormsComponent },
      {path: 'forms2',component:Forms2Component},
      {path:'forms3',component:Form3Component},
      {path:'forms4' ,component:Form4Component},
      {path:'reactiveform',component:ReactiveFormComponent},
      {path: 'parent',component: ParentComponent},

      {path: 'bikes',component:BikesComponent},
      {path: 'laptop',component:LaptopsComponent},
      {path: 'movies',component:MoviesComponent},
      {path: 'mobiles',component:MobileComponent},
      {path: 'comment-details',component:CommentDetailsComponent}




      


      

      
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }





