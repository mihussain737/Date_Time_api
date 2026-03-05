package localDateTime;

import java.time.LocalTime;

public class LocalTimeClass {
	public static void main(String[] args) {
		
		LocalTime now=LocalTime.now();
		System.out.println(now); 	// 15:33:42.549307100
		
		// Hour , Minute and Second
		System.out.println(now.getHour());
		System.out.println(now.getMinute());
		System.out.println(now.getSecond());
		
		// Custom Time
		LocalTime customTime=LocalTime.of(20, 55, 40); 
		System.out.println(customTime);		// 20:55:40
		
		// Parsed Time from String to LocalTime
		String time="15:30:40";
		LocalTime parsedTime=LocalTime.parse(time);
		System.out.println(parsedTime); 	//15:30:40
		
		LocalTime bfrOneHour=now.minusHours(1);
		System.out.println(bfrOneHour);
	}

}
