package sec15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String now1 = sdf.format(now);
		
		System.out.println(now1);
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String now2 = sdf.format(now);
		System.out.println(now2);
		
		sdf = new SimpleDateFormat("yyyy.MM.dd.a HH:mm:ss");
		String now3 = sdf.format(now);
		System.out.println(now3);
		
		sdf = new SimpleDateFormat("오늘은 E요일");
		String now4 = sdf.format(now);
		System.out.println(now4);

	}
}
