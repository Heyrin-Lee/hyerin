package com.edu.api;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		
		creatCalendar(2022, 7);
	}

	public static void creatCalendar(int year, int month) {
		
		
		Calendar today = Calendar.getInstance();
		today.set(year, month-1, 1); // 2022.3.1로 오늘을 설정
		System.out.println("올해는 " + today.get(Calendar.YEAR)); // get 이라는 매소드로 ()속 필드의 값을 읽어온다.
		System.out.println("이번달은: " + (today.get(Calendar.MONTH) + 1)); // 1월이 0부터 시작 => 3월은 2라고 출력된다.
		System.out.println("오늘은: " + today.get(Calendar.DATE));
		System.out.println("요일정보: " + today.get(Calendar.DAY_OF_WEEK)); // 일요일이 1로 시작 -> 수요일은 4라고 출력된다
		System.out.println("마지막날의 정보: " + today.getActualMaximum(Calendar.DATE));
		// 달력모양 만들기
		int gapDay = today.get(Calendar.DAY_OF_WEEK);
		int lastDate = today.getActualMaximum(Calendar.DATE);
		// 요일정보출력
		String[] days = { "SUN", "MON", "TUE", "WEN", "THU", "FRI", "SAT" };
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		System.out.println();
		// 1일의 위치지정
		for (int i = 1; i < today.get(Calendar.DAY_OF_WEEK); i++) {
			System.out.printf("%4s", "");
		}
		// 실제 날짜 출력
		for (int i = 1; i <= lastDate; i++) {
			System.out.printf("%4d", i);
			if ((i + gapDay - 1) % 7 == 0) {
				System.out.println();
			}
		}
		// 프로그램 끝 부분
		System.out.println("\nend of prog");
	}
} //이번달을 7월로 출력하고 싶다: month 값에 7을 입력하면 컴퓨터언어로는 0부터 1월이 시작하기 때문에 8월이 출력될것-> 7월을 출력하고 싶기 때문에 today.set(month-1)에 7월이라고 저장해둔다.
//그럼 왜 today.get(Calendar.MONTH)+1인지..? : 7월을 출력하고자 해서 set에 7을 저장해두었다. 그런데 컴퓨터언어로는 7월은 6을 입력해야 7월이 출력될것.(0->1월 1->2월... 6->7월) => +1을 해줘야 7월이 출력되니까.