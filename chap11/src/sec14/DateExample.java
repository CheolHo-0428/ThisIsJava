package sec14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		String Now1 = now.toString();
		System.out.println(Now1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd/hh/mm/ss");
		String Now2 = sdf.format(now);
		System.out.println(Now2);
		
		String Now3 = sdf1.format(now);
		System.out.println(Now3);
		
		

	}

}
