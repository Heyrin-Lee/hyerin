<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h3>등록결과페이지</h3>
    <a href="${pageContext.servletContext.contextPath }/index.jsp">첫페이지</a>

</body>
</html>
<!-- request.getAttribute("hello"); 와 ${!empty hello} 같은 결고값이 출력되지만 jstl을 사용하여 더 간단히 표현식을 작성 가능
		controller에서 request.setAttribute("hello","홍길동")을 적어야한다. 그래야 hello에 홍길동 값을 담아서 jsp 파일로 넘겨줄 수 있기 때문!
		
		+ request.setAttribute("hello",new bookVO());와 같이 인스턴스 값을 담아서 넘길 수도 있다. 그럼 toString형식으로 화면에 출력된다
			${hello.bookCode}와 같이 적으면 bookVO()에 담긴 값 중 bookCode의 값이 화며에 출력될 것이다.*VO의 필드이름으로 적어야한다*
		+equals <-> ne null(!=와 같다 *el표현식이라고 찾아보기*
	 -->
