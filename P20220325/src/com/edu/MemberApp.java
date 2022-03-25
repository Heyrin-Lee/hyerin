package com.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberApp {

	List<Member> members = new ArrayList<Member>();
	Scanner scn = new Scanner(System.in);

	public MemberApp() {
	}

	// MemberService를 구현하는 구현클래스를 선언
	class MemberServiceImpl implements MemberService {

		@Override
		public void addMember(Member member) {
			members.add(member);
		}

		@Override
		public void modifyMember(Member member) {
			for (int i = 0; i < members.size(); i++) {
				if (members.get(i).getMemberId() == member.getMemberId()) {
					members.get(i).setPhone(member.getPhone());
				}
			}
		}

		@Override
		public List<Member> memberList() {
			return members;
		}
		// 기능 구현
	} // end of MemberServiceImpl

	public void execute() {
		// 메유: 1.등록 2.수정 3.전체리스트 9.종료 (등록 -> 전체리스트 -> 수정 순서로)
		// 도서반=>기본정보+도서반장이름,강의실이름 members에 추가하기
		// 축구반=>기본정보+코치이름,락커룸이름
		// 수영반=>기본정보+강사이름,수영등급
		// execute에서는 구현클래스를 호출
		MemberService service = new MemberServiceImpl();
		
		while (true) {
			System.out.println("1.등록 2.수정 3.전체리스트 9.종료");
			System.out.println("선택>> ");
			int menu = scn.nextInt();

			if (menu == 1) {
				System.out.println("등록반 선택 1.도서반 2. 축구반 3. 수영반>> ");
				int choice = scn.nextInt();
				System.out.println("회원번호 입력>> ");
				int id = scn.nextInt();
				System.out.println("회원이름 입력>> ");
				String name = scn.next();
				System.out.println("연락처 입력>>");
				String number = scn.next();

				if (choice == 1) {
					System.out.println("도서반장이름 입력>> ");
					String banjang = scn.next();
					System.out.println("강의실 이름 입력>>");
					String room = scn.next();
					BookMember b1 = new BookMember(id, name, number, banjang,room);
					service.addMember(b1);
					
				} else if (choice == 2) {
					System.out.println("코치이름 입력>> ");
					String coach = scn.next();
					System.out.println("락커룸이름 입력>> ");
					String locker = scn.next();
					BookMember so1 = new BookMember(id, name, number, coach, locker);
					service.addMember(so1);
					
				} else if (choice == 3) {
					System.out.println("강사이름 입력>> ");
					String teacher = scn.next();
					System.out.println("수영등급 입력>> ");
					String grade = scn.next();
					BookMember s1 = new BookMember(id, name, number, teacher, grade);
					service.addMember(s1);
				}

			} else if (menu == 2) {
				System.out.println("수정할 회원번호 입력>> ");
				int memberId = scn.nextInt();
				System.out.println("연락처 입력");
				String phone = scn.next();

				Member m1 = new Member(memberId, null, phone);
				service.modifyMember(m1);
				System.out.println("수정이 완료되었습니다.");
			} else if (menu == 3) {
				List<Member> members = service.memberList();
				for (Member m : members) {
					System.out.println(m.toString());
				}
			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		} // end of while()
	}
}
