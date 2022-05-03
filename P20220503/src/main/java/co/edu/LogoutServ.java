package co.edu;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutServ
 */
@WebServlet("/logout.do")
public class LogoutServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public LogoutServ() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(); //세션값이 있으면
		session.invalidate(); // 만들어진 세션을 삭제.. 세션에 지정되어진 값들을 모두 지운다
		response.sendRedirect("session.jsp"); //그리고 session.jsp로 이동한다
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
