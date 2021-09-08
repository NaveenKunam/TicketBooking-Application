import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { AddComponent } from './add/add.component';
import { ErrorComponent } from './error/error.component';
import { HeaderComponent } from './header/header.component';
import { BookingComponent } from './booking/booking.component';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { FooterComponent } from './footer/footer.component';
import { ViewticketComponent } from './viewticket/viewticket.component';
import { TicketdetailsComponent } from './ticketdetails/ticketdetails.component';

@NgModule({
  declarations: [
    AppComponent,
    AddComponent,
    ErrorComponent,
    HeaderComponent,
    BookingComponent,
    HomeComponent,
    AboutComponent,
    FooterComponent,
    ViewticketComponent,
    TicketdetailsComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
