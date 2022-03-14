package com.edu;

import java.util.Scanner;

// 이름을 입력받도록 (String)
// 연락처 입력받도록 (String) -> scn.nextLine();
// 나이 입력받도록 (int) -> scn.nextInt();
// 키 입력받도록 (double) -> scn.nextDouble();
// 몸무게 입력받도록
// 적정몸무게 : (키-100)*0.9 크면 과체중 작으면 저체중
// 이름은 : ?
// 연락처 : ?
// 나이 : ?
//키 : ?
// +- 5키로... 55.3 <  <  65.3
public class TodayExample {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String name, number;
		int age;
		double heigh, weight, basic;
		
		System.out.println("이름을 입력하세요.");
		name = scn.nextLine();
		System.out.println("이름: " + name);
		
		System.out.println("연락처를 입력하세요.");
		number = scn.nextLine();
		System.out.println("연락처: "+ number);
		
		System.out.println("나이를 입력하세요.");
		age = scn.nextInt();
		System.out.println("나이: " + age);
		
		System.out.println("키를 입력하세요.");
		heigh = scn.nextDouble();
		System.out.println("키: " + heigh);
		
		System.out.println("몸무게를 입력하세요.");
		weight = scn.nextDouble();
		//if(weight > (heigh-100)*0.9) {
			//System.out.println("과체중입니다.");
		//}else {
				//System.out.println("저체중입니다.");
		//}	
		
		
		basic = (heigh-100)*0.9; // 72.5 ~ 62.5 사이에 적정.
		
		
		if(basic + 5>weight && basic -5 <weight) {
			System.out.println("적정몸무게입니다.");
		} else {
			System.out.println("비정상입니다.");
		}
		scn.close();
	}
		
}

