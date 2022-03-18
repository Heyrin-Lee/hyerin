package com.dev;

import java.util.Calendar;

public class WeekExample {
	public static void main(String[] args) {
		Week today = Week.MONDAY;
		
		Calendar day = Calendar.getInstance(); //new 라는 방식으로 인스턴스를 못 만든다.. 항상 동일한 인스턴스만 리턴해준다.
		System.out.println(day.get(Calendar.DAY_OF_WEEK)); //
		
		switch(day.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			System.out.println(Week.SUNDAY);break;
		case 2:
			System.out.println(Week.MONDAY);break;
		case 3:
			System.out.println(Week.TUESDAY);break;
		case 4:
			System.out.println(Week.WEDNSESDAY);break;
		case 5:
			System.out.println(Week.THURSDAY);break;
		case 6:
			System.out.println(Week.FRIDAY);break;
		case 7:
			System.out.println(Week.SATURDAY);break;
			
		}
	}
}
