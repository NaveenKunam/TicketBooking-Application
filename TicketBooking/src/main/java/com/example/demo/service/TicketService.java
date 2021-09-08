package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.TicketBooking;
import com.example.demo.model.BusInfo;
import com.example.demo.repository.TicketBookingRepo;

@Service
public class TicketService {
	@Autowired
	TicketBookingRepo repo;
	public List<TicketBooking> view(String ticket) {
		// TODO Auto-generated method stub
//		return repo.findAll();
		return repo.findByticketNumber(ticket);
	}
	
	public List<TicketBooking> findTicket(String ticketNumber) {
        // TODO Auto-generated method stub
        return repo.findByticketNumber(ticketNumber);
    }

	public TicketBooking create(TicketBooking ticketbooking) {
		return repo.save(ticketbooking);
	}
	
	public BusInfo getTicketBookingResult(TicketBooking ticketBooking) {
		//Add code here..
		
		List<BusInfo> list1 = buildbusses();
		
		if(ticketBooking.getFromCity().equalsIgnoreCase(ticketBooking.getToCity())) {

			
		}
		else {

			String travelClass=ticketBooking.getTravelClass();
			String bcd=travelClass;
			System.out.println(bcd);
			String trv=travelClass.substring(travelClass.length()-3,travelClass.length()-1).trim();
			
			for(BusInfo ti:list1) {
				String ab=ti.getTavelClass();
				String bc=trv;
				System.out.println(ab+"   "+bc);

			if(ti.getTavelClass().equalsIgnoreCase(trv) && ti.getFrom().equalsIgnoreCase(ticketBooking.getFromCity()) && ti.getTo().equalsIgnoreCase(ticketBooking.getToCity())) {

			return ti;

			}

			}

			}
		return null;  //TODO, modify return value
	}
	
	public String getTicketNumber(TicketBooking ticketBooking)  {
		//Add code here..
		String firstend = ticketBooking.getMobileNumber().substring(0,7);

		// String secend = t.getTrainNumber().substring(0,3);

		if(ticketBooking.getFromCity().equalsIgnoreCase(ticketBooking.getToCity())) {
				System.out.println("hii");
				return null;

		}

		else {

		return "-"+firstend;

		}
	}
	
	// DO NOT MODIFY THIS METHOD 
    //DO NOT MODIFY CODE WITHIN METHOD
	private List<BusInfo> buildbusses() {
		List<BusInfo> busses = new ArrayList<BusInfo>();
		
		//pune to bangalore
		BusInfo BusInfo1=new BusInfo("101", "Garuda", "Pune", "Bangalore", "1A", "1:55 AM", "20 hr 30 min", "10:25 PM", 3080);
		BusInfo BusInfo2=new BusInfo("101", "Garuda", "Pune", "Bangalore", "2A", "1:55 AM", "20 hr 30 min", "10:25 PM", 1825);
		BusInfo BusInfo3=new BusInfo("101", "Garuda", "Pune", "Bangalore", "3A", "1:55 AM", "20 hr 30 min", "10:25 PM", 1150);
		BusInfo BusInfo4=new BusInfo("101", "Garuda", "Pune", "Bangalore", "SL", "1:55 AM", "20 hr 30 min", "10:25 PM", 475);
		BusInfo BusInfo5=new BusInfo("101", "Garuda", "Pune", "Bangalore", "2S", "1:55 AM", "20 hr 30 min", "10:25 PM", 285);
		
		//bagalore to pune
		BusInfo BusInfo6=new BusInfo("102", "Volvo",  "Bangalore", "Pune","1A", "8:20 PM", "19 hr 40 min", "4:00 PM", 3080);
		BusInfo BusInfo7=new BusInfo("102", "Volvo", "Bangalore", "Pune", "2A", "8:20 PM", "19 hr 40 min", "4:00 PM", 1825);
		BusInfo BusInfo8=new BusInfo("102", "Volvo", "Bangalore","Pune",  "3A", "8:20 PM", "19 hr 40 min", "4:00 PM", 1275);
		BusInfo BusInfo9=new BusInfo("102", "Volvo", "Bangalore","Pune",  "SL", "8:20 PM", "19 hr 40 min", "4:00 PM", 475);
		BusInfo BusInfo10=new BusInfo("102", "Volvo", "Bangalore","Pune",  "2S", "8:20 PM", "19 hr 40 min", "4:00 PM", 285);
		
		//chennai to pune 
		BusInfo BusInfo11=new BusInfo("103", "Amaravathi", "Chennai", "Pune", "2A", "6:25 PM", "16 hr 45 min", "11:10 AM", 2440);
		BusInfo BusInfo12=new BusInfo("103", "Amaravathi", "Chennai","Pune",  "3A", "6:25 PM", "16 hr 45 min", "11:10 AM", 1785);
		BusInfo BusInfo13=new BusInfo("103", "Amaravathi", "Chennai","Pune",  "SL", "6:25 PM", "16 hr 45 min", "11:10 AM", 685);
		BusInfo BusInfo14=new BusInfo("103", "Amaravathi", "Chennai","Pune",  "2S", "6:25 PM", "16 hr 45 min", "11:10 AM", 335);
		
		//bangalore to chennai
		BusInfo BusInfo15=new BusInfo("104", "Orange",  "Bangalore","Chennai", "2A", "9:00 AM", "6 hr 15 min", "3:15 PM", 945);
		BusInfo BusInfo16=new BusInfo("104", "Orange", "Bangalore", "Chennai", "3A", "9:00 AM", "6 hr 15 min", "3:15 PM", 625);
		BusInfo BusInfo17=new BusInfo("104", "Orange", "Bangalore","Chennai",  "SL", "9:00 AM", "6 hr 15 min", "3:15 PM", 265);
		BusInfo BusInfo18=new BusInfo("104", "Orange", "Bangalore", "Chennai", "2S", "9:00 AM", "6 hr 15 min", "3:15 PM", 160);
		
		//chennai to bangalore
		BusInfo BusInfo19=new BusInfo("105", "Vennila",  "Chennai","Bangalore", "2A", "1:55 PM", "6 hr 25 min", "8:20 PM", 945);
		BusInfo BusInfo20=new BusInfo("105", "Vennila",  "Chennai","Bangalore", "3A", "1:55 PM", "6 hr 25 min", "8:20 PM", 680);
		BusInfo BusInfo21=new BusInfo("105", "Vennila",  "Chennai","Bangalore", "SL", "1:55 PM", "6 hr 25 min", "8:20 PM", 265);
		BusInfo BusInfo22=new BusInfo("105", "Vennila",  "Chennai","Bangalore", "2S", "1:55 PM", "6 hr 25 min", "8:20 PM", 160);
		
		busses.add(BusInfo1);
		busses.add(BusInfo2);
		busses.add(BusInfo3);
		busses.add(BusInfo4);
		busses.add(BusInfo5);
		busses.add(BusInfo6);
		busses.add(BusInfo7);
		busses.add(BusInfo8);
		busses.add(BusInfo9);
		busses.add(BusInfo10);
		busses.add(BusInfo11);
		busses.add(BusInfo12);
		busses.add(BusInfo13);
		busses.add(BusInfo14);
		busses.add(BusInfo15);
		busses.add(BusInfo16);
		busses.add(BusInfo17);
		busses.add(BusInfo18);
		busses.add(BusInfo19);
		busses.add(BusInfo20);
		busses.add(BusInfo21);
		busses.add(BusInfo22);
		
		return busses;
	}
		
}
