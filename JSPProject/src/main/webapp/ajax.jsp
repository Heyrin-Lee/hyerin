<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax.jsp</title>
</head>
<body>
	<script>
		//Asynchronous Javascript and Xml..ajax는 비동기방식으로 처리
		let url = 'StudentGetServlet';
		fetch(url)
			.then(result => { //정상실행
				console.log(result);
				return result.json(); //(첫번째 then()이 끝난 상태에서는 rock상태여서)그냥 두면 팬딩되어 있어서 반환값이 나오지 못한다 그래서 json형태로 변환하여 값을 반환한다 *json형태: {"id":23, "name":"hong"}*
			}) 
			.then(result => {
				console.log(result);//위에서 json형태로 변환한 오브젝트를 받아와서 사용
			})
			.catch(error => { //정상실행 실패
				console.log(error);
			}) 
	</script>
</body>
</html>