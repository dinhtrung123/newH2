
  import { Injectable } from '@angular/core';
  import { HttpClient, HttpResponse } from '@angular/common/http';
  import { Observable } from 'rxjs';
  import { SERVER_API_URL } from 'app/app.constants';
  import {IStudent} from "../../shared/model/student.model";
  type EntityResponseType = HttpResponse<IStudent>;
  @Injectable({
    providedIn: 'root'
  })
  export class StudentService {
    private apiUrl =  SERVER_API_URL + 'api/student' ;

    constructor(private http: HttpClient) { }

    getAll(): Observable<any> {
      return this.http.get(this.apiUrl);
    }
    getStudent(id : number): Observable<any> {
      return this.http.get(`${  this.apiUrl}/${id}`);
    }

    addStudent(student : any): Observable<any> {
      return this.http.post(this.apiUrl, student );
    }

    updateStudent(id : any, data : any): Observable<any> {
      return this.http.put(`${this.apiUrl}`, data);
    }
    delete(id : any): Observable<any> {
      return this.http.delete(`${this.apiUrl}/${id}` );
    }


  }

