<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberView/memberUpdate.jsp</title>
</head>
<body>
	${error }
	<h3>회원정보 수정</h3>
	<form action="${pageContext.servletContext.contextPath }/memberSearch.do" method="get">
	조회 아이디: <input type="text" name="id"><br> <!-- parameter값1 : id -->
	<input type="hidden" name="job" value="update"> <!-- parameter값2 : search *hidden타입이므로 화면에서는 보이지 않음!parameter값만 넘기기위해 만듦!* -->
	<input type="submit" value="Search">
	</form>
	
	<c:choose>
		<c:when test="${!empty result }"><h3>${result }</h3></c:when>
		<c:otherwise>
			<h3>회원정보 수정</h3>
			<form action="${pageContext.servletContext.contextPath }/memberUpdate.do" method="post">
				아이디: <input type="text" name="id" value="${member.id }"><br>
				이름: <input type="text" name="name" value="${member.name }"><br>
				비밀번호: <input type="text" name="passwd" value="${member.passwd }"><br>
				이메일: <input type="email" name="email" value="${member.email }"><br>
				<input type="submit" value="수정">
			</form> 
		</c:otherwise>
	</c:choose>
	<jsp:include page="home.jsp"></jsp:include>
</body>
<!-- member.id => memberSearchControl에서 지정한 attribute중에 한건 조회한 결과값이 있는 parameter를 member로 지정하였다. 그 member에 들어있는 id,name,pass,email을 가져온다 -->
<!-- {$error ==> MemberSearchControl에서 지정한 파라메터인 error에 '아이디를 입력하세요' 값이 담겨있다. : id값이 없으면 '아이디를 입력하세요'를 출력하라! -->
<!-- input태그에 수정할 값을 입력하면 memberUpdate.do 페이지를 실행하라 => 그럼 MemberUpdateControl로 입력한 값이 넘어가게 된다 -->
</html>