<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main.jsp</title>
</head>
<body>
	<%
		String id = (String) session.getAttribute("id");
	
	if(id == null) {
		//out.print("<button onclick='location.href=\"session.jsp\"'>로그인</button>"); //on~ :이벤트 속성
	%>
	
	<button onclick='location.href="session.jsp"'>로그인</button> <!-- 자바영역 외에 태그를 사용하는 방법! out.print~와 같다 -->
	
	<%
	} else {
//		out.print("<h3>로그인한 아이디는 " + id + "</h3><button onclick='location.href=\"logout.do\"'>로그아웃</button>");
	%>
	
	<h3>로그인한 아이디는  <%=id %></h3>
	<button onclick='location.href="logout.do"'>로그아웃</button> <!-- logout.do로 이동하면 이전에 만든 세션을 삭제하고 login페이지로 이동해서 새로 로그인을 입력하면 새로 입력한 값으로 다시 새롭게 세션 생성 -->
	
	<% 
	}
	%>
	<!-- <script>
		location.href='logout.do';
	</script> -->
</body>
</html>