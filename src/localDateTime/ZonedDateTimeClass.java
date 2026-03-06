package localDateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTimeClass {
	public static void main(String[] args) {
		ZonedDateTime indiaTime=ZonedDateTime.now();
		System.out.println(indiaTime); 	//2026-03-06T21:47:17.024553800+05:30[Asia/Calcutta]
		
		Set<String> availableZoneIds=ZoneId.getAvailableZoneIds();
		System.out.println(availableZoneIds);
		
		// custom date time zone
		ZonedDateTime cuaibaTime = ZonedDateTime.of(2000, 12,1,14,30,30,30,ZoneId.of("America/Cuiaba"));
		System.out.println(cuaibaTime); 	//2000-12-01T14:30:30.000000030-03:00[America/Cuiaba]
		
		// new york time
		ZonedDateTime newYorkTime=ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(newYorkTime); 		//2000-12-01T14:30:30.000000030-03:00[America/Cuiaba]
		
		// Parsing String to zonedTime
		ZonedDateTime parsedTime = ZonedDateTime.parse("2026-03-06T11:23:35.185571900-05:00[America/New_York]");
		System.out.println(parsedTime); 	//2026-03-06T11:23:35.185571900-05:00[America/New_York]
	}

}
