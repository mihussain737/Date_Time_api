package localDateTime;

import java.time.LocalDateTime;

public class LocalDateTimeClass {
	public static void main(String[] args) {
		// LocalDateTime in java 8
		
		LocalDateTime now=LocalDateTime.now();
		System.out.println(now); 		//2026-03-05T21:54:26.920914900
		
		LocalDateTime custemDateTime = LocalDateTime.of(2026, 07, 01, 9, 55);
		System.out.println(custemDateTime); 		//2026-07-01T09:55
		
		LocalDateTime localDateTime = LocalDateTime.parse("2026-07-01T10:55");
		System.out.println(localDateTime); 	//2026-07-01T10:55
		
		LocalDateTime minusDays = now.minusDays(1);
		System.out.println(minusDays); 		//2026-03-04T21:57:48.307056700
	}

}
