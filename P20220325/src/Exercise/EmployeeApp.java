package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeApp {
	//필드
	List<Employee> list = new ArrayList<Employee>(); //list라는 List컬렉션의 변수에 배열값을 담고, 담긴 값들을 불러올 것이다.(list = 저장을 위한 바구니)
	Scanner scn = new Scanner(System.in);
	
	// 기본생성자
	public EmployeeApp() {
		
	}
	
	//멤버클래스(인스턴스 멤버클래스) :멤버클래스는 상위클래스(..?)의 필드에 자유롭게 접근가능하다
	//EmployeeService의 기능의 구현클래스인 셈이다
	class EmployeeServiceImple implements EmployeeService { //class가 interface를 상속받을 때는 implements를 써야한다! class는 상속받은 interface의 기능을 다 사용해야한다!

		// 상속받은 기능을 다 사용하기 위한 매소드(..?)
		@Override
		public void addEmployee(Employee employee) {
			list.add(employee);
		}

		@Override
		public List<Employee> employeeList() {
			return list;
		}

		@Override
		public void modifyEmployee(Employee employee) {
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getEmployeeId() == employee.getEmployeeId()) {
					list.get(i).setPhone(employee.getPhone());
				}
			}
		}
	}// end of EmployeeServiceImpl
		
	// 기능을 실제로 구현하기 위한 매소드. 이 매소드는 EmployeeExe 클래스에서 호출되어 기능들이 실행된다
	public void execute() {
		// 메뉴: 1. 직원정보 추가입력 2. 전체직원 목록 3. 직원정보 수정
		// 직원이 마케팅부일 경우 출력=> 기본정보 + 마케팅부장이름
		// 직원이 영업부일 경우 출력=> 기본정보 + 영업부장이름
		
		//EmployeeServiceImpl 클래스에서 생성한 매소드들을 인스턴스화해서 service라는 객체(변수)를 생성하였다.(add,modify,List 등의 기능을 쉽게 호출하기 위해서..?)
		EmployeeService service = new EmployeeServiceImple();
		
		//구체적으로 기능이 실행되면 이렇게 되어라~ 라고 설명해준다
		while(true) {
			System.out.println("메뉴: 1.직원정보 추가입력 2.전체직원 목록 3.직원정보 수정");
			System.out.println("선택 >> ");
			int menu = scn.nextInt();
			
			if(menu == 1) {
				System.out.println("부서 선택: 1.마케팅부 2.영업부");
				int department = scn.nextInt();
				System.out.println("직원번호 입력 >> ");
				int employeeId = scn.nextInt();
				System.out.println("직원이름 입력 >> ");
				String employeeName = scn.next();
				System.out.println("직원 연락처 입력 >> ");
				String phone = scn.next();
				
					if(department == 1) {
						System.out.println("마케팅부장 이름 입력 >> ");
						String mhead = scn.next(); 
						Marketing mk = new Marketing(employeeId, employeeName, phone, mhead);
						service.addEmployee(mk);
						
					} else if(department == 2) {
						System.out.println("영업부장 이름 입력 >> ");
						String bhead = scn.next();
						Business bs = new Business(employeeId, employeeName, phone, bhead);
						service.addEmployee(bs);
					}
				if(menu == 2) {
					List<Employee> list = service.employeeList(); //EmployeeService 클래스에서 생성한 employeeList를 위에서 EmployeeServiceImpl을 인스턴스화해서 만든 객체 service를 이용해서 호출하였다. (service는 EmployeeService를 상속받은 EmployeeServiceImpl 클래스의 객체)
						for(Employee e : list) {
							System.out.println(e.toString());
						}
				} else if(menu == 3) {
					System.out.println("수정할 직원의 번호 입력 >> ");
					int Id = scn.nextInt();
					System.out.println("연락처 입력 >> ");
					String call = scn.next();
					
					Employee e1 = new Employee(Id, null, call);
					service.modifyEmployee(e1);
					System.out.println("수정이 완료되었습니다.");
				} else if(menu == 4) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}  
			}
		}
		
	}
	
}
