package sec16;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		
		DateTimeFormatter dateTimeFormatter = 
				DateTimeFormatter.ofPattern("yyyy년 MM월");
		
		String day = now.format(dateTimeFormatter);
		
		System.out.println(day);
	}
}
