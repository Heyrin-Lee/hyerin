package com.prod.emp;

import java.util.List;
import java.util.Scanner;

public class EmpExe {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		Scanner scn = new Scanner(System.in);

		// 메뉴: 1.사원리스트 2.입력 3.수정 4.삭제 5.한건조회 9.종료
		while (true) {
			System.out.println("메뉴: 1.사원리스트 2.입력 3.수정 4.삭제 5.한건조회 6.다수조회 7.다수조회2 9.종료");
			System.out.println("메뉴 선택>> ");

			int menu = scn.nextInt();
			if (menu == 1) { // 전체리스트
				List<Employee> list = dao.empList(); // 전체 조회기능

				System.out.println("사원리스트");
				for (Employee emp : list) {
					System.out.println(emp.toString());
				}
			} else if (menu == 2) { // 입력기능
				// 사원번호(int), lastName, email, hireDate, jobId

				System.out.println("사원번호>> ");
				int id = scn.nextInt();
				System.out.println("lastName>> ");
				String lastName = scn.next();
				System.out.println("email>> ");
				String email = scn.next();
				System.out.println("hireDate>> ");
				String hireDate = scn.next();
				System.out.println("jobId>> ");
				String jobId = scn.next();

				Employee emp = new Employee(id, lastName, email, hireDate, jobId);
				// set메소드 이용
//				emp.setEmployeeId(id);
//				emp.setLastName(lastName);
//				emp.setEmail(email);
//				emp.setHireDate(hireDate);
//				emp.setJobId(jobId);
//				
				dao.insertEmp(emp); // sql 서버에 저장 매소드
//				System.out.println("사원번호: " + emp.getEmployeeId() + "lastName: " + emp.getLastName() + "email: " + emp.getEmail() + "hireDate: " + emp.getHireDate() + "jobId: " + emp.getJobId());

				// 생성자
				System.out.println("사원번호: " + emp.getEmployeeId() + "lastName: " + emp.getLastName() + "email: "
						+ emp.getEmail() + "hireDate: " + emp.getHireDate() + "jobId: " + emp.getJobId());

				boolean tOrF = dao.insertEmp(emp); // boolean 타입으로 결과값을 받아와서 입력한 값이 있으면 정상, 없으면 오류 메시지 출력
				if (tOrF) {
					System.out.println("정상");
				} else
					System.out.println("오류");

			} else if (menu == 3) { // 수정
				// 사원번호, 전화번호, firstName,salary 입력받아서

				System.out.println("사원번호>> ");
				int id = scn.nextInt();
				System.out.println("전화번호>> ");
				String phoneNumber = scn.next();
				System.out.println("firstName>> ");
				String firstName = scn.next();
				System.out.println("salary>> ");
				int salary = scn.nextInt();

				Employee emp = new Employee();

				emp.setEmployeeId(id);
				emp.setPhoneNumber(phoneNumber);
				emp.setFirstName(firstName);
				emp.setSalary(salary);

				dao.updateEmp(emp);
				System.out.println("수정되었습니다.");

				boolean result = dao.updateEmp(emp); // boolean 타입의 변수 result를 설정하여 수정매소드를 변수에 담는다
				if (result) { // 변수(수정 건)이 있으면 정상수정 메시지 출력
					System.out.println("정상수정");
				} else
					System.out.println("수정 오류");

			} else if (menu == 4) { // 삭제
				// 삭제할 사원번호

				System.out.println("삭제할 사원번호>> ");
				int empId = scn.nextInt();

				Employee emp = new Employee();

//				dao.deletEmp(변수);
				dao.deleteEmp(empId);
				System.out.println("삭제되었습니다.");

			} else if (menu == 5) { // 한건조회
				System.out.println("한건 조회 사원번호>> ");
				int empId = scn.nextInt();

				System.out.println(dao.searchEmp(empId).toString());

			} else if (menu == 6) { // 다수 조회(이름)
				System.out.println("다수 조회 last_Name>> ");
				String lastName = scn.next();
				List<Employee> list = dao.nameList(lastName); // 매개변수를 넣어서 입력한 값의 결과만 list에 담는다

				System.out.println("같은 성을 가진 사원의 리스트");
				for (Employee name : list) {
					System.out.println(name.toString());
				}
			} else if (menu == 7) { // 다수 조회2(연봉,job_id)
				System.out.println("다수 조회2 salary>> ");
				int salary = scn.nextInt();
				System.out.println("다수 조회2 job_id>> ");
				String job_id = scn.next();
				List<Employee> list = dao.doubleList(salary, job_id); // 매개변수를 넣어서 입력한 값의 결과만 list에 담는다

				System.out.println("입력한 값의 연봉과 job_id에 해당하는 사원의 리스트");
				for (Employee db : list) {
					System.out.println(db.toString());
				}

			} else if (menu == 9) { // 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		} // end of while
		System.out.println("end of program");
		scn.close();
	}// end of main method

} // end of class
