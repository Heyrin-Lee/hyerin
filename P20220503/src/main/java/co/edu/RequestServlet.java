package co.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestServlet
 */
@WebServlet("/RequestServlet.do")
public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public RequestServlet() {
        super();
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() call."); //서버 최초 실행시 한 번만 init() 실행
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service() call."); //최초 실행이 아닐 시(그냥 새로고침) service()만 실행 
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8"); //출력해주는 페이지의 content type 지정
		
		PrintWriter out = response.getWriter(); //response.getWriter(); : 출력스트림 / PrintWriter out : out이라는 변수에 출력할 구문을 담는다
		out.print("<h3>홍길동</h3>"); //tag도 사용가능
		out.print("<h3>네트워크 정보</h3>");
		out.print("Request Schem: " + request.getScheme() + "<br>");
		out.print("Server Name: "+ request.getServerName() +"<br>");
		out.print("Server Address: "+ request.getLocalAddr()+ "<br>");
		out.print("Client Address: "+ request.getRemoteAddr()+"<br>");
		out.print("Client Port: " + request.getRemotePort()+ "<br>");
		
		out.print("<h3>요청 프로토콜</h3>");
		out.print("Request URI: " + request.getRequestURI()+ "<br>");
		out.print("Request URL: " + request.getRequestURL()+ "<br>");
		out.print("Context path: " + request.getContextPath()+ "<br>"); //프로젝트 이름
		out.print("Request protocol: " + request.getProtocol()+ "<br>");
		out.print("Server path: " + request.getServletPath()+ "<br>");
		
		out.print("qeuryString: " + request.getQueryString() + "<br>"); //넘어온 파라메터 정보
		out.print("id: " + request.getParameter("id") + "<br>"); //파라미터에 입력한 id의 값을 읽어오겠다(예제=>id = user1)
		out.print("passwd: " + request.getParameter("passwd") + "<br>");//(예제=>passwd = 1234)
		out.print("name: " + request.getParameter("username") + "<br>");//(예제=>username = hong)
		out.close();
	}

}
