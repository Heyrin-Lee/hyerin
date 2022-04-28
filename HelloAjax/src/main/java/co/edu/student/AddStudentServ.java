package co.edu.student;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//ajax/post.html에 대한 servlet 생성 파일
//전송(학생추가) 버튼을 눌렀을 떄 불러오는 파일
@WebServlet("/ajax/addStudentServlet") //post.html에서 action부분에 넣은 것과 같다
public class AddStudentServ extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8"); //request: 요청한다! 한글형태로 파일을 불러오기를 요청한다!
		
		resp.setCharacterEncoding("UTF-8"); //response: 응답한다! 한글형태의 파일로 응답받는다!
		resp.setContentType("text/html;charset=UTF-8");
				
		String studentNo = req.getParameter("sno"); //post.html에서 101이라는 값이 담겨져있는 속성의 name을 sno로 설정하였던 것을 불러온다
		String studentName = req.getParameter("sname");
		String engScore = req.getParameter("eScore");
		String korScore = req.getParameter("kScore");
		
		Student stud = new Student(); //stud라는 인스턴스 생성..stud를 매개변수로 사용하기 위해
		stud.setStudentNo(Integer.parseInt(studentNo)); //getparameter가 반환해주는 값은 무조건 string타입->학생번호는 int타입이니까 에러발생 => integer.parseint(studentNo)을 통해서 타입을 맞춰준다
		stud.setStudentName(studentName);
		stud.setEngScore(Integer.parseInt(engScore));
		stud.setKorScore(Integer.parseInt(korScore));
		
		//db insert.
		StudentDAO dao = new StudentDAO(); 
		boolean success = dao.addStudent(stud);
		if(success) {
			//{"retCode":"Success", "studNo:"studentNo", "engScore":engScore, "korScore":korScore} 형식으로 값을 넘겨주도록 한다
			//성공하면 {"retCode":"Success", "studNo:"studentNo", "engScore":engScore, "korScore":korScore} 형식으로 넘겨준다 -> json 문자열로 넘겨준다(반환할 필요가 없다)
			//resp.getWriter().println("{\"retCode\":\"Success\", \"studNo\":"+studentNo+", \"engScore\":"+engScore+", \"korScore\":"+korScore+"}");
			resp.getWriter().println("{\"retCode\":\"Success\", \"studentNo\":"+ studentNo + ", \"studName\":\"" + studentName + "\", \"engScore\":"+ engScore + ", \"korScore\":"+ korScore + "}");
		}else {
			//{"retCode":"Fail"}
			resp.getWriter().println("{\"retCode\":\"Fail\"}");
		}
	}
}