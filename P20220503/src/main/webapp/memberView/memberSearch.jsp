<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberView/memberSearch.jsp</title>
</head>
<body>
	${error }
	<h3>회원정보 검색</h3>
	<form action="${pageContext.servletContext.contextPath }/memberSearch.do" method="get">
	조회 아이디: <input type="text" name="id"><br> <!-- parameter값1 : id -->
	<input type="hidden" name="job" value="search"> <!-- parameter값2 : search *hidden타입이므로 화면에서는 보이지 않음!parameter값만 넘기기위해 만듦!* -->
	<input type="submit" value="Search">
	</form>
	<jsp:include page="home.jsp"></jsp:include>
</body>
</html>