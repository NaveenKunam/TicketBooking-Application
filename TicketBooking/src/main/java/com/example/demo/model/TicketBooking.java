package com.example.demo.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ticketbooking")
public class TicketBooking {
	// Use validation annotations as per the requirement

	private String customerName;
	private String mobileNumber;
	private String fromCity;
	private String toCity;
	private String travelClass;
	private int noOfTickets;
	public LocalDate dateOfTravel;
	public String busNumber;
	public String busName;
	public String departure;
	public String duration;
	public String arrival;
	@Id
	public String ticketNumber;
	public double totalfareAmount;
	
	public TicketBooking() {
		// TODO Auto-generated constructor stub
	}

	public TicketBooking(String customerName,String mobileNumber,String fromCity, String toCity, String travelClass,
			int noOfTickets,LocalDate dateOfTravel,String busNumber, String busName,String departure,
			String duration, String arrival, String ticketNumber, double totalfareAmount) {
		super();
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.fromCity = fromCity;
		this.toCity = toCity;
		this.travelClass = travelClass;
		this.noOfTickets = noOfTickets;
		this.dateOfTravel = dateOfTravel;
		this.busNumber = busNumber;
		this.busName = busName;
		this.departure = departure;
		this.duration = duration;
		this.arrival = arrival;
		this.ticketNumber = ticketNumber;
		this.totalfareAmount = totalfareAmount;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	public String getTravelClass() {
		return travelClass;
	}

	public void setTravelClass(String travelClass) {
		this.travelClass = travelClass;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public LocalDate getDateOfTravel() {
		return dateOfTravel;
	}

	public void setDateOfTravel(LocalDate dateOfTravel) {
		this.dateOfTravel = dateOfTravel;
	}
	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public String getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public double getTotalfareAmount() {
		return totalfareAmount;
	}

	public void setTotalfareAmount(double totalfareAmount) {
		this.totalfareAmount = totalfareAmount;
	}

	
}
