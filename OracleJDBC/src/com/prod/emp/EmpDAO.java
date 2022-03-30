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
			rs = psmt.executeQuery(); // 조회할때만 executeQuery() .. rs는 자바에서 제공하는 클래스같은 것(result)
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id")); // employees.employee_id 칼럼에 있는 값을 int 타입으로 읽어온다
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setSalary(rs.getInt("salary"));
				emp.setHireDate(rs.getString("hire_date").substring(0, 10)); // subString() 자릿수 끊어서 출력하기
				emp.setJobId(rs.getString("job_id"));

				employees.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { // finally: 정상적으로 프로그램이 실행되더라도, 에러가 나더라도 반드시 실행되어야 할 구문을 넣어준다
			disconnect();
		}
		return employees;
	}
	// 한건 조회
	public Employee searchEmp(int empId) {
	conn = getConnect();
	Employee emp = new Employee();
	try {
		String sql = "select * from emp_java where employee_id = ? ";
		psmt = conn.prepareStatement(sql);
		psmt.setInt(1, empId);
		rs = psmt.executeQuery(); // 조회할때만 executeQuery()
		if (rs.next()) {
			emp.setEmployeeId(rs.getInt("employee_id")); // employees.employee_id 칼럼에 있는 값을 int 타입으로 읽어온다
			emp.setFirstName(rs.getString("first_name"));
			emp.setLastName(rs.getString("last_name"));
			emp.setEmail(rs.getString("email"));
			emp.setSalary(rs.getInt("salary"));
			emp.setHireDate(rs.getString("hire_date").substring(0, 10)); // subString() 자릿수 끊어서 출력하기
			emp.setJobId(rs.getString("job_id"));

		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally { // finally: 정상적으로 프로그램이 실행되더라도, 에러가 나더라도 반드시 실행되어야 할 구문을 넣어준다
		disconnect();
	}
	return emp;
}

	
	// 입력처리 executeUpdate()
	public boolean insertEmp(Employee emp) { // 메소드 하나 실행할 때마다 연결하고 disconnect해줘야한다.. void=>return 구문 자체가 없다..
//		boolean result = false;
		conn = getConnect(); // 연결
		String sql = "insert into emp_java (employee_id, last_name, email, hire_date, job_id) \r\n"
				+ "values (?, ?, ?, ?, ?)"; // 쿼리문
		try {
			psmt = conn.prepareStatement(sql); // ? <= 매개변수값중에서 employeeId값을 대체해서 넣는다(필드값)
			psmt.setInt(1, emp.getEmployeeId()); // 첫번재 파라미터(=employee_id) 값을 넣는다.. emp.getEmployeeId()값이 int
													// 타입이므로setInt
			psmt.setString(2, emp.getLastName());
			psmt.setString(3, emp.getEmail());
			psmt.setString(4, emp.getHireDate());
			psmt.setString(5, emp.getJobId());
			int r = psmt.executeUpdate(); // 쿼리가 실행된 건수만큼 반환된다
			System.out.println(r + "건 입력되었습니다.");
			if (r > 0) {
				return true;
			} 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 정상실행,예외(에러)발생 상관없이 반드시 실행할 코드
			disconnect();
		}
		
		return false;
		
	}

	// 수정처리
	public boolean updateEmp(Employee emp) { // 리턴값을 boolean으로 설정하여 제대로 수정되었는가를 확인한다(true or false)
		conn = getConnect();
		String sql = "update emp_java "
				+ "set first_name = ?, "
				+ "    phone_number = ?, "
				+ "    salary = ? "
				+ "where employee_id = ?"; // 쿼리 작성이 완료되면 파라매터를 ? 로 작성한다
		try {
			psmt = conn.prepareStatement(sql);	
			// 파라메터(=?) 값을 지정
			psmt.setString(1, emp.getFirstName());
			psmt.setString(2, emp.getPhoneNumber());
			psmt.setInt(3, emp.getSalary());
			psmt.setInt(4, emp.getEmployeeId());
			
			int r = psmt.executeUpdate(); // 쿼리를 실행하라는 구문
			System.out.println(r + "건 수정되었습니다.");
			if (r > 0) {
				return true; // r>0 1건이상 수정되었을 경우 true값을 리턴한다
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}	return false; //아닐경우 false 값을 리턴한다
	}

	// 삭제처리
	public void deleteEmp(int empId) { //ID 기준으로 삭제를 한다
		conn = getConnect();
		String sql = "delete from emp_java "
				+ "where employee_id = ?"; // 쿼리 작성이 완료되면 파라매터를 ? 로 작성한다
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, empId);
			// 파라메터(=?) 값을 지정

			int r = psmt.executeUpdate(); // 쿼리를 실행하라는 구문
			System.out.println(r + "건 삭제되었습니다.");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	// 다수 조회
	public List<Employee> nameList(String lastName) {
	List<Employee> employees = new ArrayList<Employee>();
	conn = getConnect();
	try {
		String sql = "select * from emp_java where last_name like ? "; // 매개값을 ? 로 설정해서 입력하는 lastName의 조건에 만족하는 사원 정보 출력
		psmt = conn.prepareStatement(sql);
		psmt.setString(1, lastName);
		rs = psmt.executeQuery(); // 조회할때만 executeQuery()
		while (rs.next()) { // 읽어올 next 값이 있을 때 반복문 시작한다
			Employee emp = new Employee();
			emp.setEmployeeId(rs.getInt("employee_id")); // employees.employee_id 칼럼에 있는 값을 int 타입으로 읽어온다
			emp.setFirstName(rs.getString("first_name"));
			emp.setLastName(rs.getString("last_name"));
			emp.setEmail(rs.getString("email"));
			emp.setSalary(rs.getInt("salary"));
			emp.setHireDate(rs.getString("hire_date").substring(0, 10)); // subString() 자릿수 끊어서 출력하기
			emp.setJobId(rs.getString("job_id"));
			
			employees.add(emp);
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally { // finally: 정상적으로 프로그램이 실행되더라도, 에러가 나더라도 반드시 실행되어야 할 구문을 넣어준다
		disconnect();
	}
	return employees;
	}
	// 다수조회2
	public List<Employee> doubleList(int salary, String jobId) {
		List<Employee> employees = new ArrayList<Employee>();
		conn = getConnect();
		Employee emp = new Employee();
		try {  																// %MAN% 에 해당하는 값을 출력하고자 한다= '%'||?||'%'
			String sql = "select * from emp_java WHERE salary >= ? OR job_id LIKE '%'||?||'%' "; // 매개값을 ? 로 설정해서 입력하는 lastName의 조건에 만족하는 사원 정보 출력
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, salary); // 설정한 매개값이 들어와야 한다
			psmt.setString(2, jobId);
			rs = psmt.executeQuery(); // 조회할때만 executeQuery()
			while (rs.next()) { // 읽어올 next 값이 있을 때 반복문 시작한다
				emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id")); // employees.employee_id 칼럼에 있는 값을 int 타입으로 읽어온다
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setSalary(rs.getInt("salary"));
				emp.setHireDate(rs.getString("hire_date").substring(0, 10)); // subString() 자릿수 끊어서 출력하기
				emp.setJobId(rs.getString("job_id"));
				
				employees.add(emp);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { // finally: 정상적으로 프로그램이 실행되더라도, 에러가 나더라도 반드시 실행되어야 할 구문을 넣어준다
			disconnect();
		}
		return employees;
}
		
	}
