package co.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/queryTest")
public class QueryTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public QueryTest() {
        super();
    }
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		//요청정보에 한국어로 인코딩
//		request.setCharacterEncoding("utf-8");
//		
//		//응답정보를 한국어로 설정
//		response.setContentType("text/html;charset=utf-8");
//		response.setCharacterEncoding("utf-8");
//		
//		String id = request.getParameter("id");
//		String pass = request.getParameter("pwd");
//		String name = request.getParameter("name");
//		String[] hobbies = request.getParameterValues("hobby"); //parametervalues는 반환타입이 문자열 배열이므로 변수도 문자열 배열형태로 지정
//		String gen = request.getParameter("gender");
//		String rel = request.getParameter("religion");
//		String intro = request.getParameter("intro");
//		
//		PrintWriter out = response.getWriter();
//		out.print("<h3>id: " + id + "</h3>");
//		out.print("<h3>pass: " + pass + "</h3>");
//		out.print("<h3>name: " + name + "</h3>");
//		out.print("<ul>");
//		for(String hobby : hobbies) { //반복문으로 <ul><li> 생성
//			out.print("<li>" + hobby + "</li>");
//		}
//		out.print("</ul>");
//		out.print("<h3>성별: " + gen + "</h3>");
//		out.print("<h3>종교: " + rel + "</h3>");
//		out.print("<h3>자기소개: " + intro + "</h3>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
				//요청정보에 한국어로 인코딩
				request.setCharacterEncoding("utf-8");
				
				//응답정보를 한국어로 설정
				response.setContentType("text/html;charset=utf-8");
				response.setCharacterEncoding("utf-8");
				
				String id = request.getParameter("id");
				String pass = request.getParameter("pwd");
				String name = request.getParameter("name");
				String[] hobbies = request.getParameterValues("hobby"); //parametervalues는 반환타입이 문자열 배열이므로 변수도 문자열 배열형태로 지정
				String gen = request.getParameter("gender");
				String rel = request.getParameter("religion");
				String intro = request.getParameter("intro");
				
				PrintWriter out = response.getWriter();
				out.print("<h3>id: " + id + "</h3>");
				out.print("<h3>pass: " + pass + "</h3>");
				out.print("<h3>name: " + name + "</h3>");
				out.print("<ul>");
				for(String hobby : hobbies) { //반복문으로 <ul><li> 생성
					out.print("<li>" + hobby + "</li>");
				}
				out.print("</ul>");
				out.print("<h3>성별: " + gen + "</h3>");
				out.print("<h3>종교: " + rel + "</h3>");
				out.print("<h3>자기소개: " + intro + "</h3>");
	}

}
