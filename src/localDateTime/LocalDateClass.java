package localDateTime;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateClass {
	
	public static void main(String[] args) {
		
		LocalDate today =LocalDate.now();
		System.out.println(today);  // 2026-03-04
		
		// custom date
		LocalDate customDate=LocalDate.of(1990, 2, 7);
		System.out.println(customDate); //1990-02-07
		
		// day, month and year
		int dayOfMonth = today.getDayOfMonth();
		Month month = today.getMonth();
		int monthValue = today.getMonthValue();
		int year = today.getYear();
		System.out.println("dayOfMonth: "+dayOfMonth+" monthValue: "+monthValue+ " year: "+year);
		
		// yesterday
		LocalDate yesterday = today.minusDays(1);
		System.out.println("yesterday :"+yesterday); //2026-03-03
		
		// last 100 month
		LocalDate minusMonths = today.minusMonths(100);
		System.out.println("minus 100 month: "+minusMonths);
		
		// First Day of the month
		LocalDate firstDateOfMonth = LocalDate.of(today.getYear(), today.getMonthValue(), 1);
		System.out.println(firstDateOfMonth); //2026-03-01
		
		
		if(today.isAfter(yesterday)) {
			System.out.println("today comes after yesterday");
		}
	}
}
