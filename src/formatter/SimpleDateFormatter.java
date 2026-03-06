package formatter;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SimpleDateFormatter {
	public static void main(String[] args) {
		LocalDate t=LocalDate.now();
		System.out.println(t); 	//2026-03-06
		
		// Custom format in String 2026-03-06 => 06/03/2026
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formatedDate = formatter.format(t);
		System.out.println(formatedDate); 	//06/03/2026
		
		// converting dd/mm/yyyy formate to date
		String sDate="25/04/1997";
//		LocalDate paresd = LocalDate.parse(sDate);
//		System.out.println(paresd); 	//exception
		LocalDate parse=LocalDate.parse(sDate,formatter);
		System.out.println(parse); 	// 1997-04-25
		
		
		// dd/MM/yyyy → yyyy-MM-dd
		
		String input = "25/04/1997";

		DateTimeFormatter inputFormatter =
		        DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(input, inputFormatter);
		DateTimeFormatter outputFormatter =
		        DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String output = date.format(outputFormatter);
		System.out.println(output);
		
		/*
		 String ("25/04/1997")
        		↓
		parse() with dd/MM/yyyy
        		↓
			LocalDate
        		↓
		format() with yyyy-MM-dd
        		↓
		"1997-04-25"
	 */
	}

}
