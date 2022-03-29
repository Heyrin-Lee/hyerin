package com.prod.emp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO extends DAO {

	// 전체조회
	public List<Employee> empList() {
		List<Employee> employees = new ArrayList<Employee>();
		conn = getConnect();
		try {
			psmt = conn.prepareStatement("select * from emp_java");
			rs = psmt.executeQuery(); //조회
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id")); //employees.employee_id 칼럼에 있는 값을 int 타입으로 읽어온다
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setSalary(rs.getInt("salary"));
				emp.setHireDate(rs.getString("hire_date").substring(0,10)); //subString() 자릿수 끊어서 출력하기
				emp.setJobId(rs.getString("job_id"));
				
				employees.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { //finally: 정상적으로 프로그램이 실행되더라도, 에러가 나더라도 반드시 실행되어야 할 구문을 넣어준다
			disconnect();
		}
		return employees;
	}
	// 한건 조회
	
	// 입력처리
	
	// 수정처리
	
	// 삭제처리
}
