package co.edu;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Servlet implementation class StudentGetServlet
 */
@WebServlet("/StudentGetServlet") //<-서블릿 주소,, 주소창에 /StudentGetServlet 치면 실행(/:로컬호스트 밑에서 studentGetServlet을 찾는다)
public class StudentGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public StudentGetServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//GET: cmd=search, cmd=null -> JSON으로 반환하도록 한다
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
	    String cmd = request.getParameter("cmd");
	    
	    if(cmd != null && cmd.equals("search")) {
	    	String id = request.getParameter("user_id"); //id한건을 조회해와서
	    	StudentDAO dao = new StudentDAO();
	    	Student student = dao.searchStudent(id); //studentDAO에서 한건 조회 기능 추가해서 여기서 사용
	    	
	    	response.setContentType("text/html;charset=utf-8");
	    	if(student != null) {
	    	response.getWriter().println("<form action='StudentGetServlet' method='post'>");
	    	response.getWriter().println("<h3>학생번호: "+ student.getStudentNo() + "</h3>"); //student가 가지고있는 studentNo
	    	response.getWriter().println("<h3>이름: "+ student.getStudentName() + "</h3>");
	    	response.getWriter().println("<h3>영어: "+"<input type='number' name='eng_score' value='"+student.getEngScore()+"'></h3>");
	    	response.getWriter().println("<h3>국어: "+"<input type='number' name='kor_score' value='"+student.getKorScore()+"'></h3>");
	    	response.getWriter().println("<input type='hidden' name='user_id' value='"+student.getStudentNo()+"'>");
	    	response.getWriter().println("<input type='hidden' name='user_name' value='"+student.getStudentName()+"'>");
	    	response.getWriter().println("<input type='submit' value='수정'><br>");
	    	response.getWriter().println("<input type='hidden' name='cmd' value='mod'>");
	    	response.getWriter().println("</form>");
	    	response.getWriter().println("<a href='studentList.jsp'>학생목록</a>");
	    	} else {
	    		response.getWriter().println("<h3>조회된 데이터가 없습니다</h3>");
	    	}
	    }else if (cmd != null && cmd.equals("list")) {
	    	StudentDAO dao = new StudentDAO();
	    	Student stud = new Student();
	    	String id = request.getParameter("user_id");
	    	String name = request.getParameter("user_name");
	    	
	    	stud.setStudentNo(Integer.parseInt(id));
	    	stud.setStudentName(name);
	    	
	    	dao.addStudent(stud);
	    	
	    	response.getWriter().print("입력성공");
	    
	    }else {
	    	
	    response.setContentType("text/json;charset=utf-8");
		StudentDAO dao = new StudentDAO();
		List<Student> list = dao.studentList();
		//[{},{},{}]
		Gson gson = new GsonBuilder().create();
		response.getWriter().print(gson.toJson(list));
	    }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//한글 처리
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		//한 건 입력
		String cmd = request.getParameter("cmd"); //parameter로 cmd의 값을 요청했을 때
		if(cmd != null && cmd.equals("add")) { //add일 때 아래의 구문 실행
			StudentDAO dao = new StudentDAO();
	    	Student stud = new Student();
	    	String id = request.getParameter("user_id");
	    	String name = request.getParameter("user_name");
	    	String eng = request.getParameter("eng_score");
	    	String kor = request.getParameter("kor_score");
	    	
	    	//stud 안에 id,name,eng,kor의 값들을 담아준다
	    	stud.setStudentNo(Integer.parseInt(id));
	    	stud.setStudentName(name);
	    	stud.setEngScore(Integer.parseInt(eng));
	    	stud.setKorScore(Integer.parseInt(kor));
	    	
	    	dao.addStudent(stud);
	    	
	    	response.getWriter().print("입력성공");
	    	
	    	//한 건 삭제
		} else if(cmd != null && cmd.equals("del")) {
			String id = request.getParameter("user_id");
			
			StudentDAO dao = new StudentDAO(); //studentDAO 활용
			if(dao.removeStudent(id)) { //removeStudent(): boolean타입
				response.getWriter().print("<script>alert('삭제성공')</script>");
			}else {
				response.getWriter().print("<script>alert('삭제실패')</script>");
			}
			//수정
		} else if(cmd != null && cmd.equals("mod")) {
			//사용자 입력 parameter를 읽어온다
			String id = request.getParameter("user_id");
	    	String name = request.getParameter("user_name");
	    	String eng = request.getParameter("eng_score");
	    	String kor = request.getParameter("kor_score");
	    	
	    	Student stud = new Student();
	    	
	    	stud.setStudentNo(Integer.parseInt(id));
	    	stud.setStudentName(name);
	    	stud.setEngScore(Integer.parseInt(eng));
	    	stud.setKorScore(Integer.parseInt(kor));
	    	
	    	StudentDAO dao = new StudentDAO();
	    	dao.modifyStudent(stud);
			
		response.sendRedirect("studentList.jsp"); //studentList.jsp로 위치 재지정-->입력/삭제한 뒤에 학생목록 페이지로 넘어가고 입력/삭제된 값도 표시된다
	} //end of doPost()

}
}