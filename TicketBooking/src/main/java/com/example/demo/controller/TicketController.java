package com.example.demo.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TicketBooking;
import com.example.demo.repository.TicketBookingRepo;
import com.example.demo.model.BusInfo;
import com.example.demo.service.TicketService;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class TicketController {
	
	@Autowired
	TicketBookingRepo repo;
	
	private TicketService service;
	public String completeTkt="";
	@Autowired
	public TicketController(TicketService service) {
		super();
		this.service = service;
	}
	 @GetMapping(produces = "application/json")

	 public List<TicketBooking> firstPage() {
	System.out.println(completeTkt);
		return service.view(completeTkt);

	 }	
	
	@PostMapping

	 public TicketBooking create(@RequestBody TicketBooking ticketbooking) {
		BusInfo ti =service.getTicketBookingResult(ticketbooking);
		String ticket = service.getTicketNumber(ticketbooking);
		LocalDate today = LocalDate.now();
	    
		completeTkt = ti.getBusNumber().substring(0,3).concat(ticket);
		ticketbooking.ticketNumber=completeTkt;
		ticketbooking.totalfareAmount=ti.getFarePerPassenger() * ticketbooking.getNoOfTickets();
		ticketbooking.dateOfTravel=today.plusDays(1);
		ticketbooking.busNumber=ti.getBusNumber();
		ticketbooking.busName=ti.getBusName();
		ticketbooking.arrival=ti.getArrival();
		ticketbooking.duration=ti.getDuration();
		ticketbooking.departure=ti.getDeparture();
		return service.create(ticketbooking);
			
	 }
	@GetMapping("getticket/{ticketNumber}")
	public List<TicketBooking>firstPage1(@PathVariable("ticketNumber") String ticketNumber) {
		return repo.findByticketNumber(ticketNumber);
	}
	
	@DeleteMapping("delete/{ticketNumber}")
	public String cancel(@PathVariable("ticketNumber") String ticketNumber) {
		TicketBooking obj=repo.getOne(ticketNumber);
		repo.delete(obj);
		return "deleted";
	}
	

	
	
}
