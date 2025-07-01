package com.chaitu.sbeans;

import java.time.LocalTime;

public class WishMessageGenerator {
	
	private LocalTime time;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator::0 parameter constructor");
	}

	public void setTime(LocalTime time) {
		System.out.println("WishMessageGenerator.setTime()");
		this.time = time;
	} 
	
	public String showMessage(String userName) {
		int hour=time.getHour();
		if(hour<12)
			return "Good Morning : "+userName;
		
		else if(hour<16)
			return "Good Afternoon : "+userName;
		
		else if(hour<20)
			return "Good Evening : "+userName;
		
		else
			return "Good Night : "+userName;
	}
	
}
