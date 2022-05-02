<%@page import="co.edu.Student"%>
<%@page import="java.util.List"%>
<%@page import="co.edu.StudentDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>studentList.jsp</title>
</head>
<body>
	<h3>학생목록</h3>
	<table border="1">
	<thead>
		<tr><td>학생번호</td><th>학생이름</th><th>영어</th><th>국어</th></tr>
	</thead>
	<tbody>
		<%
		//~~자바소스~~
		//import: ctrl + space
		StudentDAO dao = new StudentDAO();
		List<Student> list = dao.studentList();
		//데이터 한 건에 대한 <tr><td>
		for(Student student : list) { //반복문
			out.print("<tr><td><a href='StudentGetServlet?cmd=search&user_id="+student.getStudentNo()+"'>"+student.getStudentNo()+"</a></td><td>"+student.getStudentName()+"</td><td>"+student.getEngScore()+"</td><td>"+student.getKorScore()+"</td></tr>");
		}	
		%>	
	</tbody>
	</table>
	<a href="form.jsp">폼화면</a>
	<script>
	</script>
</body>
</html>