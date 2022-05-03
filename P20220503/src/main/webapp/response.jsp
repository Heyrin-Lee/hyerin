<%@page import="co.edu.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>response.jsp</title>
</head>
<body>
	<%
		String id = (String) request.getAttribute("id"); //request.getAttribubte("id")의 반환값이 오브젝트이기 때문에 String타입으로 반환하고 싶어서 (String)으로 캐스팅 작업을 해주었다
		String name = (String) request.getAttribute("name");
		Student student = (Student) request.getAttribute("result"); //result값에 지정한 참조변수(result=dao.searchStudent(id))를 forward를 통해서 반환가능
		//requestServlet 페이지에서 설정한 속성 result를 forward를 통해서 반환-> 단위당 사용가능하기 때문에 한번 더는 사용 불가 -> 클라이언트가 서블릿을 요청하면 request,response 객체를 만들어서 전달하고 전달이 끝나면 request,response 객체는 사라지기 때문에
	%>
	
	<h3>id: <%=id %></h3> <!-- <%=id %> 자바 영역에 있는 id의 값을 읽어오도록 한다 -->
	<h3>name: <%=name %></h3>
	<h3>no: <%=student.getStudentNo() %></h3>
	<h3>name: <%=student.getStudentName() %></h3>
</body>
</html>