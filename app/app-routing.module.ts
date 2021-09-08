import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { AboutComponent } from "./about/about.component";
import { AddComponent } from "./add/add.component";
import { BookingComponent } from "./booking/booking.component";
import { HomeComponent } from "./home/home.component";
import { TicketdetailsComponent } from "./ticketdetails/ticketdetails.component";
import { ViewticketComponent } from "./viewticket/viewticket.component";

const routes: Routes = [
    { path:'', component: HomeComponent},
    { path:'addbookingdetails', component: AddComponent},
    { path:'viewbookingdetails', component: BookingComponent},
    { path:'addbookingdetails',component:HomeComponent},
    {path:'about',component:AboutComponent},
    {path:'viewticket',component:ViewticketComponent},
    {path:'ticketdetails',component:TicketdetailsComponent},
    { path:'home',component:HomeComponent}
  
  ];
  
  @NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
  })
  export class AppRoutingModule { }
  