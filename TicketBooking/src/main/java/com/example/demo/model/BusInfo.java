package com.example.demo.model;


public class BusInfo {
	private String busNumber;
	private String busName;
	private String from;
	private String to;
	private String tavelClass;
	private String departure;
	private String duration;
	private String arrival;
	private double farePerPassenger;

	public BusInfo() {
		// TODO Auto-generated constructor stub
	}

	public BusInfo(String busNumber, String busName, String from, String to, String tavelClass, String departure,
			String duration, String arrival, double farePerPassenger) {
		super();
		this.busNumber = busNumber;
		this.busName = busName;
		this.from = from;
		this.to = to;
		this.tavelClass = tavelClass;
		this.departure = departure;
		this.duration = duration;
		this.arrival = arrival;
		this.farePerPassenger = farePerPassenger;
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

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getTavelClass() {
		return tavelClass;
	}

	public void setTavelClass(String tavelClass) {
		this.tavelClass = tavelClass;
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

	public double getFarePerPassenger() {
		return farePerPassenger;
	}

	public void setFarePerPassenger(double farePerPassenger) {
		this.farePerPassenger = farePerPassenger;
	}

}
