<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form.jsp</title>
</head>
<body> <!-- form.jsp에서 입력한 데이터를 index.jsp으로 전송하겠다,, *form은 페이지에서 페이지로 데이터 전송할 때 사용!*-->
	   <!-- get방식은 주소창에 사용자가 입력한 parameter값이 노출된다  -->
	<form name="frm" action="StudentGetServlet" method="get">  
	 <input type="hidden" name="cmd" value="search"> <!-- cmd의 값을 studentgetservlet파일에서 조회,입력,수정,삭제 기능을 만들때 add,mod.. 등으로 넘기기 위해 필요 -->
	 ID: <input type="number" name="user_id" value="hong"><br> 
	 Name: <input type="text" name="user_name" value="홍길동"><br>
	 Eng: <input type="number" name="eng_score"><br>
	 Kor: <input type="number" name="kor_score"><br>
	 <input type="submit" value="조회">
	 <input id="addBtn" type="button" value="입력">
	 <input id="modBtn" type="button" value="수정">
	 <input id="delBtn" type="button" value="삭제">
	</form>
	<hr>
	<a href="studentList.jsp">학생목록</a>
	</hr>
	<script>
		
		//수정
		let modBtn = document.getElementById('modBtn');
		modBtn.addEventListener('click', function() {
			let frm = document.forms.frm;
			frm.method = "post"; 
			frm.cmd.value = "mod"; 
			frm.submit(); 
		});
		
		//한 건 삭제
		let delBtn = document.getElementById('delBtn'); 
		delBtn.addEventListener('click', function() {
			let frm = document.forms.frm;
			frm.method = "post"; //post방식으로 넘어가고
			frm.cmd.value = "del"; //cmd에 del이라는 값을 부여하고
			frm.submit(); //submit버튼을 클릭
		});
		
		//한 건 추가
		let btn = document.querySelector('#addBtn');
		btn.addEventListener('click', function() {
			let frm = document.forms.frm; //forms: form형식을 가져오는데 이름을 지정하면 해당 이름의 form형식을 가져온다
			
				frm.action = "StudentGetServlet";
				frm.method = "post";
				frm.cmd.value = "add"; //frm이라는 이름을 가진 form문에서 name이 cmd인 값에 add를 담는다
				//console.log(frm);
				frm.submit(); //submit은 form의 submit 버튼을 누르는 것과 같다
		});
		
		
	</script>
</body>
</html>