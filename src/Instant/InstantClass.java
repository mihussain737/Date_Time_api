package Instant;

import java.time.Instant;

public class InstantClass {
	public static void main(String[] args) {
		long currentMillis=System.currentTimeMillis();
		System.out.println(currentMillis); //1772814558133  from 1 jan 1970 midnight
		// epochconverter.com=> convert this in date and time
		
		Instant now = Instant.now();
		System.out.println(now); 	// 2026-03-06T16:31:08.012059700Z in nano seconds
	}
}
