<%@page import="co.test.vo.BookVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl/ex01.jsp</title>
</head>
<body>

<% String name = "Hong"; %>
	<c:set var="name" value="Hong"></c:set>
	<c:set var="pi" value="3.14"></c:set>
	<c:out value="${name }"></c:out>
	<c:out value="${pi }"></c:out>
	<h3>${pi }</h3>
	
	<%
	BookVO vo = new BookVO("20220501001","이것이 자바다", "오정임", "루비페이퍼", 2500);
	request.setAttribute("vo",vo);
	%>
	<h3>${vo }</h3>
	<h3>북코드: ${vo.bookCode }, 저자: ${vo.bookAuthor }</h3>
	<c:if test="${vo eq null }">
		<h3>저장내용이 없습니다!</h3>
	</c:if>
	<c:choose>
	<c:when test="${vo.bookTitle eq '이것이 자바다' }"><h3>책이름임</h3></c:when>
	<c:when test="${vo.bookPrice > 2000 }"><h3>너무 비쌉니다</h3></c:when>
	<c:when test="${vo.bookPrice > 1000 }"><h3>비쌉니다</h3></c:when>
	<c:when test="${vo eq null }"><h3>no data!</h3></c:when>
	<c:otherwise><h3>북코드: ${vo.bookCode }, 저자: ${vo.bookAuthor }</h3></c:otherwise>
	</c:choose>
	
	<!-- for(int i=1; i<10; i++) 
		int = cnt 즉, 변수의 이름
		-->
	
	
	
	<c:forEach items="${list }" var="book">
		<p>${book.bookCode }, ${book.bookTitle }</p>
	</c:forEach>
	
	<c:forEach begin="1" end="10" var="cnt">
		<p> 2 * ${cnt } = ${cnt * 2 }</p>
	</c:forEach>
	
	
	
	<!-- delims(=구분자)를 기준으로 소설, 역사, 인문, 정치값을 하나씩 반복하면서 가져온다 -->
	<c:forTokens items="소설/역사/인문/정치" delims="/" var="token">
		<p>token: ${token }</p>
	</c:forTokens>
</body>
</html>

<!-- request.getAttribute("hello"); 와 ${!empty hello} 같은 결고값이 출력되지만 jstl을 사용하여 더 간단히 표현식을 작성 가능
		controller에서 request.setAttribute("hello","홍길동")을 적어야한다. 그래야 hello에 홍길동 값을 담아서 jsp 파일로 넘겨줄 수 있기 때문!
		
		+ request.setAttribute("hello",new bookVO());와 같이 인스턴스 값을 담아서 넘길 수도 있다. 그럼 toString형식으로 화면에 출력된다
			${hello.bookCode}와 같이 적으면 bookVO()에 담긴 값 중 bookCode의 값이 화며에 출력될 것이다.*VO의 필드이름으로 적어야한다*
		+equals <-> ne null(!=와 같다 *el표현식이라고 찾아보기*
	 -->

<!-- <c:if></c:if>는 if문 하나로 끝난다.
	<c:choose><c:when><c:otherwise>는 if else if문과 같다
 -->