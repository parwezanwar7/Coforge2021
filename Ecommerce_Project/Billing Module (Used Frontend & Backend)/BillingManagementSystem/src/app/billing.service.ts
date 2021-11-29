import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BillingService {

  private baseUrl = 'http://localhost:8070/api/v1/billings';

  constructor(private http: HttpClient) { }

  getBilling(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }
      // calling the backend api create employee method from here
  createBilling(billing: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`, billing);
  }

  updateBilling(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }

  deleteBilling(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }
      //this method is to get list of all values
  getBillingsList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
}
