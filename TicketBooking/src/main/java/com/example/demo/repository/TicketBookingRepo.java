package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.TicketBooking;


public interface TicketBookingRepo extends JpaRepository<TicketBooking,String>{
	//public List<TicketBooking> findByticketNumber(String pnrNumber);
	public List<TicketBooking> findByticketNumber(String ticketNumber);
}
