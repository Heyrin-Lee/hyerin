package co.edu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Info extends HttpServlet{

	//Info 페이지 요청 -> HttpServlet은 init() 매소드 최초 한번만 실행 -> Service() -> Destroy(); 라는 생명주기를 가진다
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//HttpServletrequest:응답정보
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		//출력
		PrintWriter out = resp.getWriter();
		
		out.print("<h3>서블릿 페이지</h3>");
		out.print("<h3>안녕하세요</h3>");
		out.print("");
		out.print("<a href=\"../index.html\">index</a>");
		//""사이에 있는 문자는 문자 그대로 인식하도록 한다
		// <a href=../index.html">index</a>
	}
	
}
