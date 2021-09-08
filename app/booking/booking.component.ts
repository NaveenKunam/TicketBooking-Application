import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Booking, HttpClientService } from '../service/http-client.service';

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent implements OnInit {

  bookings:Booking[]=[];

  constructor(private httpClientService: HttpClientService,private _router:Router  ) {
    this.httpClientService.getBookings().subscribe(
      response =>{this.bookings = response;}
     );
   }

  ngOnInit(): void {
  }
  home() {
    this._router.navigate(['/home'])
  }

}
