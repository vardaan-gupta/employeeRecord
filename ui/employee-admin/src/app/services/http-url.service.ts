import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { environment } from '../../environments/environment';


@Injectable()
export class HttpUrlService {

 
  url: string = "";

  constructor(private http: HttpClient) {
    
  }
  /**
   * This method is used to fetch the product list
   */
  getEmployeeList() {
    this.url = environment.contextPath + 'v1/employees/';
    console.log('url', this.url);
    return this.http.get(this.url);
  } 


}
