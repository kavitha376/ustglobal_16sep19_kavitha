import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { UserComponent } from './user/user.component';
import { LogoutComponent } from './logout/logout.component';
import { AddbooksComponent } from './addbooks/addbooks.component';
import { RemovebooksComponent } from './removebooks/removebooks.component';
import { BooksinventryComponent } from './booksinventry/booksinventry.component';
import { IssuebookComponent } from './issuebook/issuebook.component';
import { StudentComponent } from './student/student.component';


const routes: Routes = [ 
  { path: 'home', component:HomeComponent},
  { path: 'login', component:LoginComponent},
  { path: 'register', component:RegisterComponent},
  { path: 'admin', component:AdminComponent},
  { path: 'user', component:UserComponent},
  {path:'logout',component:LogoutComponent},
  {path:'addbooks',component:AddbooksComponent},
  {path:'removebooks',component:RemovebooksComponent},
  {path:'booksinventry',component:BooksinventryComponent},
  {path:'issuebook',component:IssuebookComponent},
  {path:'student',component:StudentComponent}

  

  

  

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
