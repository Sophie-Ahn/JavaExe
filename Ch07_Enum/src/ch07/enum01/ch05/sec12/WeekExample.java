package ch07.enum01.ch05.sec12;

import java.util.Calendar;

public class WeekExample {
	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance(); // 캘린더의 객체를 얻음
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1: today = Week.SUNDAY;
		case 2: today = Week.MONDAY;
		case 3: today = Week.TUESDAY;
		case 4: today = Week.WEDNESDAY;
		case 5: today = Week.THUSDAY;
		case 6: today = Week.FIRDAY;
		case 7: today = Week.SATURDAY;
		}
		
		if (today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		}else {
			System.out.println(today.toString());
			System.out.println(today.ordinal());
			System.out.println("열심히 자바를 공부합니다.");
		}
	}
}
