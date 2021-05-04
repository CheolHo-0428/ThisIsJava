package sec14;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
			
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);			//연도
		int month = now.get(Calendar.MONTH) + 1;	//월
		int day = now.get(Calendar.DAY_OF_MONTH);	//일
		int week = now.get(Calendar.DAY_OF_WEEK);	//요일
		int amPm = now.get(Calendar.AM_PM);			//오전 오후를 리턴
		int hour = now.get(Calendar.HOUR);			//시를 리턴
		int minute = now.get(Calendar.MINUTE);		//분을 리턴
		int second = now.get(Calendar.SECOND);		//초를 리턴
		
		String strWeek = null;
		
		switch(week) {
			case Calendar.SUNDAY : strWeek = "일요일"; break;
			case Calendar.MONDAY : strWeek = "월요일"; break;
			case Calendar.TUESDAY : strWeek = "화요일"; break;
			case Calendar.WEDNESDAY : strWeek = "수요일"; break;
			case Calendar.THURSDAY : strWeek = "목요일"; break;
			case Calendar.FRIDAY : strWeek = "금요일"; break;
			case Calendar.SATURDAY : strWeek = "토요일"; break;
		}
		
		String strAmPm;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		System.out.print(year+"년 ");
		System.out.print(month+"월 ");
		System.out.println(day+"일");
		System.out.print(strWeek);
		System.out.println(" "+strAmPm);
		
	}

}
