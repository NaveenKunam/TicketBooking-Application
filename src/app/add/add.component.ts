import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Booking, HttpClientService } from '../service/http-client.service';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  user: Booking = new Booking("","","","","","","","","","","","","");

  constructor(private httpClientService: HttpClientService,private router: Router) { }

  ngOnInit(): void {
  }
  createBooking(): void {
    console.log("hi")
    this.httpClientService.createBooking(this.user)
        .subscribe( data => {
          alert("Ticket booked sucessfully");
          this.router.navigate(['/viewbookingdetails']);
        },error => {
          alert("Sorry, No bus is available");
        });

  };

}
