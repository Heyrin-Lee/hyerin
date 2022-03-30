package com.edu.collect;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceOracle extends DAO implements StudentService { //DAO클래스를 상속받고, StudentSerivce 인터페이스의 기능을 구현한다

	@Override
	public void insertStudent(Student student) {
		conn = getConnect(); //연결
		String sql = "insert into student_info (student_no, student_name, eng_score, kor_score) "
				+ "values(?, ? , ? , ?)"; //쿼리문
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, student.getNumber());
			psmt.setString(2, student.getName());
			psmt.setInt(3, student.getEng());
			psmt.setInt(4, student.getKor());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 정상실행, 예외(에러)발생 상관없이 반드시 실행할 코드
			disconnect();
		}
	}

	@Override
	public Student getStudent(int sno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> studentList() { //전체학생 리스트
		List<Student> list = new ArrayList<Student>(); // 조회된 결과값을 담기위한 list 라는 변수의 컬렉션을 생성
		conn = getConnect();
		String sql = "select * from student_info order by student_no";
		try {
			psmt = conn.prepareStatement(sql);  // new Student() 처럼 인스턴스를 만들었는데 pre~는 인스턴스를 만들어주는 매소드인데, 생성자가 아닌 쿼리문을 매개값으로 psmt를 통해서 인스턴스를 만든다
			rs = psmt.executeQuery(); //실행건수만큼 반복한다
			while(rs.next()) { //Student 테이블 안에 값들이 있는데 반복문 안에서 가져올 요소가 있는지 체크해서 있으면 하나 가지고 오겠다
				Student student = new Student(); // list 컬렉션에 담아야하니까
				student.setNumber(rs.getInt("student_no")); 
				student.setName(rs.getString("student_name"));
				student.setEng(rs.getInt("eng_score"));
				student.setKor(rs.getInt("kor_score")); //칼럼값들을 읽어온다 그 값들을 student라는 변수에 담아놓는다
				
				list.add(student);
 			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	@Override
	public void modifyStudent(Student student) {
		conn = getConnect();
		String sql = "update student_info "
				+ "set eng_score = ?, "
				+ "    kor_score = ? "
				+ "where student_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, student.getEng());
			psmt.setInt(2, student.getKor());
			psmt.setInt(3, student.getNumber());
			
			int r = psmt.executeUpdate(); 
			System.out.println(r + "건 수정되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
	}

	@Override
	public void removeStudent(int sno) {
		conn = getConnect();
		String sql = "delete from student_info "
				+ "where student_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, sno);
			
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
	}

	@Override
	public List<Student> searchStudent(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveToFile() { // DB에 저장하면 필요없다(oracle)
		// TODO Auto-generated method stub
		
	}

}
