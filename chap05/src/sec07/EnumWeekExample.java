package sec07;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		Weeks today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1: today = Weeks.SUNDAY;break;
		case 2: today = Weeks.MONDAY;break;
		case 3: today = Weeks.TUESDAY;break;
		case 4: today = Weeks.WEDENSDAY;break;
		case 5: today = Weeks.THUSRDAY;break;
		case 6: today = Weeks.FRIDAY;break;
		case 7: today = Weeks.SATURDAY;break;
		}
		
		System.out.println("오늘 요일: " + today);

	}

}
