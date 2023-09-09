package Java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.Month;
public class DateTime {

	public static void main(String[] args) {
		//date
		LocalDate today = LocalDate.now();	
		System.out.println("Current Date="+today);
		//time
		LocalTime time = LocalTime.now();
		System.out.println("Current Time="+today);
		
		LocalTime timeKolkata = LocalTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Time in IST="+timeKolkata);
		
		LocalDate firstDay_2023 = LocalDate.of(2023, 12, 5);
		System.out.println("Specific Date="+firstDay_2023);
		
		LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Date in IST="+todayKolkata);
		
		
		
		
		
	}
}