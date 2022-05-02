<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title> 
</head>
<body>
	<h3>반갑습니다</h3>
	<%
	//자바코드(자바의 영역),, <%: java소스를 쓸 때 사용
	 String name = "홍길동";
	 out.println("<h3>" + name + "</h3>");
	 
	 String id = request.getParameter("user_id"); //parameter의 값을 읽어와서 리턴한다(parameter의 값=input태그의 name속성값)
	 String name2 = request.getParameter("user_name");
	 out.println("<h4>입력값: " + id + ", name: " + name2 + "</h4>");
	 
	%>
	
	<!-- index.js에서 servlet페이지를 호출하고 싶다면 -->
	<a href="./student/student.do">Student Servlet</a> <!-- 현재 디렉토리(.)를 기준으로 student 밑에 student.do 파일을 찾는다 --><!-- web.xml에서 *.do를 해줬으니까 aaa.do든 bbb.do든 .do만 치면 studentServlet을 실행한다 -->
</body>
</html>