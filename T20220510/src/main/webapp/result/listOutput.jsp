<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>도서 리스트.</title>
</head>

<body>
	<c:choose>
	<c:when test="${empty list }"><h3>도서정보 없음</h3></c:when>
	<c:otherwise>
    <table border="1">
        <caption>도서목록</caption>
        <thead>
            <tr>
                <th>도서코드</th>
                <th>도서명</th>
                <th>도서저자</th>
                <th>도서출판사</th>
                <th>도서가격</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${list }" var="books">
        <tr><td>${books.bookCode }</td><td>${books.bookTitle }</td><td>${books.bookAuthor }</td><td>${books.bookPress }</td><td>${books.bookPrice }</td>
        </tr>
        </c:forEach>
        </tbody>
    </table>
    </c:otherwise>
    </c:choose>
    
    <a href="${pageContext.servletContext.contextPath }/index.jsp">첫페이지</a>
</body>

</html>