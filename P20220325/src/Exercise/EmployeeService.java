package Exercise;

import java.util.List;

public interface EmployeeService {
	//실행될 기능에 대한 정의만 해두었다(추상매소드 생성)
	
	public void addEmployee(Employee employee); //직원정보 추가입력
	public List<Employee> employeeList(); //전체직원 목록
	public void modifyEmployee(Employee emoloyee); //직원정보 수정
}
