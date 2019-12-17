import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';

const headeroption = {
  headers: new HttpHeaders({'Content-Type': 'application/json'})
};
@Injectable({
  providedIn: 'root'
})
export class AuthService {
  
  // viewBooks() {
  //   throw new Error("Method not implemented.");
  // }
 

  constructor(private http: HttpClient) { }

  registerUser(user): Observable<any> {
    return this.http.post('http://localhost:8080/librarymanagement/register', user);
  }

  loginUser(user): Observable<any> {
    console.log(user)
    return this.http.post('http://localhost:8080/librarymanagement/login',user);
  }
  addbooks(user): Observable<any> {
    return this.http.post(
      'http://localhost:8080/librarymanagement/addBook',user);
  }
  
  deleteBooks(id):Observable<any>{
    return this.http.delete(`http://localhost:8080/librarymanagement/deleteBook/${id}`,headeroption);
  }
  viewBooks():Observable<any> {
    return this.http.get('http://localhost:8080/librarymanagement/getAllBook',headeroption);
  }
  bookRequests():Observable<any> {
    return this.http.get(`http://localhost:8080/librarymanagement/viewreqs`,headeroption);

  }
  acceptReq(data):Observable<any>{
    return this.http.post(`http://localhost:8080/librarymanagement/acceptreq`,data,headeroption);

  }
  declineBook(id,data):Observable<any> {
    return this.http.post(`http://localhost:8080/librarymanagement/bookaction1/${id}`,data,headeroption);

  }
  requestBook(userId,data):Observable<any> {
    return this.http.post(`http://localhost:8080/librarymanagement/allocatebook/${userId}`,data,headeroption);

  }

}
