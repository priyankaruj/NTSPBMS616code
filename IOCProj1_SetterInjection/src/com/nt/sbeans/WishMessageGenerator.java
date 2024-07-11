package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
//	public static void main (String args[]) {
//		System.out.println("WishMessageGenerator_priyanka");
	
	//has-A property
	private LocalDataTime dateTime;
 
	//setter methode for setter injection
	@Autowired
	public void setDateTime(LocalDataTime dateTime) {
		System.out.println("WishMessageGenerator.setDateTime()");//systrace+strl+space gives sop with message
		this.dateTime = dateTime;
	}
	//business method
	public String showWishMessage(String user) {
		System.out.println("WishMessageGenerator.showWishMessage()");
		//get current hour of the day
		int hour=dateTime.getHour();
		//generate the wish message
		if(hour<12)
			return "Good Morning"+user;
		if(hour<16)
			return "Good Afternoon"+user;
		if(hour<20)
			return "Good Evening"+user;
		else
			return "Good Night"+user;
	}
		
	
	
	
	

}
	

}
