package co.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//IOC : Introversion of control
public class StudentServlet extends HttpServlet{ //직접 servlet파일을 만들어보기
	@Override
	public void init() throws ServletException { //init()는 제일 처음에 한 번만 실행된다. 한 번 실행된 후에는 service가 실행된다
		System.out.println("init() 호출.");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8"); //출력 타입을 지정할 수 있다(여기에서는 text형식으로 출력되도록 하였다)
		
		
		String method = req.getMethod(); //요청방식을 읽어오는 매소드: req.get
		PrintWriter out = resp.getWriter(); //출력스트림 생성(여기서는 web페이지에 출력되도록 해본다).. out 이라는 변수에 담았다
		out.print("<h3>Student Sample page.</h3>");
		
		if(method.equals("GET")) {//요청방식(get/post)에 따라서 화면에 출력되는 메시지를 다르게 해보았다
			out.print("<h3>Get방식 호출</h3>");
			doGet(req,resp); //service()가 있기 때문에 service가 먼저 실행된다
			
		} else if (method.equals("POST")) {
			out.print("<h3>Post방식 호출</h3>");
			
		}
		out.print("<a href='../index.jsp?user_name=kildong&user_id=hong'>index page</a>"); //index.jsp파일을 실행하는데 parameter를 넘기겠다(?(->파라미터 시작합니다)parameter) 어떤 값을 넘기냐면 user_name&user_id의 값을 index.jsp파일로 넘겨주겠다
	}
	
	
	private void destory() {
		System.out.println("destroy() 호출.");

	}
}
