package co.edu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestServ
 */
@WebServlet("/request1.do")
public class RequestServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public RequestServ() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		
		StudentDAO dao = new StudentDAO();
		Student result = dao.searchStudent(id);
		request.setAttribute("result", result); //결과값(result)에 result라는 이름으로 속성을 하나 지정
		
		request.setAttribute("id", id); //요청정보에 id라는 키값으로 파라메터값인 id를 지정
		request.setAttribute("name", name);
		
		//response.jsp
		request.getRequestDispatcher("response.jsp").forward(request,response); //위에서 가져오는 파라메터 id,name값을 response.jsp로 넘겨주는 매소드 *포워딩forward*
		//response.jsp로 페이지를 이동할것이다 *forward*가 위에서 지정한 파라메터값(request)이랑 결과값(response)을 다 들고! => servlet 파일과 jsp파일간의 파라메터값 공유를 가능하게 해준다
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
