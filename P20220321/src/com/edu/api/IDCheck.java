package com.edu.api;

public class IDCheck {
	// 주민번호 입력 -> 950304-1234567, 000205-4567890
	// 950304-1234567, 950304 1234567

	// String getGender() -> 남자, 여자

	public String getGender(String sno) {
		char sex = sno.charAt(6);
		char sex2 = sno.charAt(7);
		String gen = null;

		if (sno.length() == 14) { // 8번째
			char no = sno.charAt(7); // 인덱스값으로는 7번째, 실제는 8번째,, '1'=>49 ''은 char타입으로 선언된 것이다.
			if (no == '1' || no == '3') {
				gen = "남자";
			} else if (no == '2' || no == '4') { // 7번쨰
				gen = "여자";
			} else {
				gen = "잘못된 번호입니다.";
			}
		} else if (sno.length() == 13) {
			char no = sno.charAt(6);
			if (no == '1' || no == '3') {
				gen = "남자";
			} else if (no == '2' || no == '4') {
				gen = "여자";
			} else {
				gen = "잘못된 번호입니다.";
			}

			// ----------------------
//		char n1 = 0;
//		if (sno.length() == 14) {
//			n1 = sno.charAt(7);
//		} else if (sno.length() == 13) {
//			n1 = sno.charAt(6);
//		}
//
//		switch (n1) {
//		case '1':
//		case '3':
//			gen = "남자";
//			break;
//		case '2':
//		case '4':
//			gen = "여자";
//			break;
//		}

		}
		return gen;

	}

	// ----------
	public String getGender2(String sno) {
		String gen = null;
		String newSno = sno.replace("-", ""); // -을 지워버리겠다
		newSno = sno.replace(" ", ""); // 공백도 지워버리겠다.
		String result = null;
		if (sno.length() == 13) {
			char no = sno.charAt(6);
			if (no == '1' || no == '3') {
				gen = "남자";
			} else if (no == '2' || no == '4') {
				gen = "여자";
			} else {
				gen = "잘못된 번호입니다.";
			}
		}
//		if(sex == 1 & sex == 3) {
//			System.out.println("남자");
//		} else if (sex == 2 & sex == 4) {
//			System.out.println("여자");
//		}
		return gen;
	}
}
