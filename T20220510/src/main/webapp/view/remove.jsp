<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>

<body>

	<h3>${error }</h3>

    <h3>도서삭제조회</h3>
    <form action="${pageContext.servletContext.contextPath }/searchBook.do" method="get">
        <input type="text" name="bookCode" id=""><br>
        <input type="hidden" name="job" value="remove">
        <input type="submit" value="조회">
    </form>

    <!-- 도서삭제를 위한 화면 작성코드를 입력하세요. -->
	<form action="${pageContext.servletContext.contextPath }/RemoveBook.do" method="post">
		<input type="hidden" name="code" value="${book.bookCode }">
		<input type="hidden" name="title" value="${book.bookTitle }">
		<input type="hidden" name="author" value="${book.bookAuthor }">
		<input type="hidden" name="press" value="${book.Press }">
		<input type="hidden" name="price" value="${book.Price }">
		<input type="submit" value="삭제">
	</form>
    <a href="${pageContext.servletContext.contextPath }/index.jsp">첫페이지</a>

</body>

</html>