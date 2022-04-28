package co.edu.student;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/studentList.json")
public class StudentListServ extends HttpServlet{
//서버를 새로고침 했을 때 가져오는 list 목록
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//[{"studentNo":?,"studentName":?,"engScore":?,"korScore":?},{}]
		StudentDAO dao = new StudentDAO();
		List<Student> list = dao.studentList();
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain;charset=UTF-8");
		
		String jsonString = "[";
		for(int i=0; i<list.size(); i++) { //배열처럼 결과를 넘기게 json 문자열을 만들었다
			jsonString += "{\"studentNo\":"+list.get(i).getStudentNo()
					   +",\"studentName\": \""+list.get(i).getStudentName()
					   +"\",\"engScore\":"+list.get(i).getEngScore()
					   +",\"korScore\":"+list.get(i).getKorScore()+"}";
			if(i != list.size()-1) { //마지막index값
				jsonString += ","; //이외에만 , 붙이기
			}
		}
		jsonString += "]"; //누적
		resp.getWriter().print(jsonString);
	}
}
