import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

export class Booking{
  constructor(
    public customerName:String,
    public mobileNumber:string,
    public fromCity:string,
    public toCity:string,
    public travelClass:string,
    public noOfTickets:string,
    public ticketNumber:string,
    public busNumber:string,
    public busName:string,
    public departure:string,
    public arrival:string,
    public dateOfTravel:string,
    public totalfareAmount:string
  ) {}
  
}

@Injectable({
  providedIn: 'root'
})
export class HttpClientService {

  constructor(
    private httpClient:HttpClient
  ) { 
     }

     getBookings()
  {
    console.log("test call");
    return this.httpClient.get<Booking[]>('http://localhost:8080');
  }

  public deleteBooking(booking:any) {
    return this.httpClient.delete<Booking>("http://localhost:8080" + "/"+ booking.name);
  }

  public createBooking(booking:any) {
    return this.httpClient.post<Booking>("http://localhost:8080",booking);
  }

  public viewticket(booking:any) {
    return this.httpClient.get<Booking>("http://localhost:8080/getticket"+"/"+booking.ticketNumber);
  }
  public editBooking(booking:any) {
    return this.httpClient.put<Booking>("http://localhost:8080",booking);
  }
  getTicketById()
  {
    console.log("test call");
    return this.httpClient.get<Booking[]>('http://localhost:8080/getticket+"/"+ticketNumber');
  }
}
