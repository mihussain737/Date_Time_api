package intro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Intro {
	public static void main(String[] args) {
		Date date =new Date();
		System.out.println(date);	//Wed Mar 04 14:37:38 IST 2026
		
		LocalDateTime localDateTime=LocalDateTime.now();
		System.out.println(localDateTime);	// 2026-03-04T14:37:39.089337900
		
		LocalDate localDate=LocalDate.now();
		System.out.println(localDate);	//2026-03-04
	}
}
