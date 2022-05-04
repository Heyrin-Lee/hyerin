<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberView/memberDelete.jsp</title>
</head>
<body>
	${error }
	<h3>회원정보 삭제</h3>
	<form action="${pageContext.servletContext.contextPath }/memberSearch.do" method="get">
	조회 아이디: <input type="text" name="id"><br> 
	<input type="hidden" name="job" value="delete"> 
	<input type="submit" value="조회">
	</form>
	
	<c:choose>
		<c:when test="${!empty result }"><h3>${result }</h3></c:when>
		<c:otherwise>
			
			<form action="${pageContext.servletContext.contextPath }/memberDelete.do" method="post">
				<input type="hidden" name="id" value="${member.id }">
				<input type="hidden" name="name" value="${member.name }">
				<input type="hidden" name="passwd" value="${member.passwd }">
				<input type="hidden" name="email" value="${member.email }">
				<input type="submit" value="삭제">
			</form>
		</c:otherwise>
	</c:choose>
	<jsp:include page="home.jsp"></jsp:include>
</body>
</html>