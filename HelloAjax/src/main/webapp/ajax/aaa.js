
//문제의 코드!!!!!!!!!! 왜 안됐던거야!!!!
 
 /**
 * 
 */
 
 document.addEventListener('DOMContetLoaded', init);
 
 //리스트
 function init() {
 	let xhtp = new XMLHttpRequest(); //페이지의 결과를 받아오는 기능(XMLHttpRequest)
 	xhtp.open('get','../studentList.json'); //상위 폴더로 올라가서 studentList.json 주소를 찾아온다
 	xhtp.send();
 	xhtp.onload = function() {
 		let data = JSON.parse(xhtp.responseText);
 		console.log(data);
 		
 		let tbodyList = document.getElementById('list');
 		data.forEach(function(elem) { //elem은 student의 한건(오브젝트) 
 		let aaa = makeTr(elem);
 			tbodyList.appendChild(aaa);	
 		})
 	}
 }
 
 //한건 추가
 function addStudent(e) {
 	e.preventDefault(); //submit -> 차단
 	console.log(e);
 	
 	let no = document.querySelector('input[name="sno"]').value; 
 	let sname = document.querySelector('input[name="sname"]').value;
 	let eng = document.querySelector('input[name="eScore"]').value;
 	let kor = document.querySelector('input[name="kScore"]').value;
 	
 	let xhtp = new XMLHttpRequest(); //비동기방식으로 서버의 파일요청(XMLHttpRequest)
 	xhtp.open('get',`addStudentServlet?sno=${no}&sname=${sname}&eScore=${eng}&kScore=${kor}`); //요청하는 방법,요청하는 주소 ?(물음표 뒤에는 파라미터가 들어간다)
 	xhtp.send(); //요청시작은 send()매소드가 실행돼야 시작한다
 	xhtp.onload = function(){ //파일을 요청해서 실행할 때 사용할 함수
 		console.log(xhtp.responseText); //{"retCode":"Success"}
 		let result = JSON.parse(xhtp.responseText); //parse를 통해서{retCode:"Success"} 타입으로 가져온다
 		if (result.retCode == 'Success') {
 			//성공하면 tbody(list)에 새로운 값 추가(화면에 추가한다)
 			//successCallBack();
 			successCallBack2(result); //result의 값 = {retCode:?, studNo:?, studName:?, escore:?, kscore:?} <-이런 형식으로 값을 넘기기로 했으니까
 			
 		} else if(result.retCode == 'Fail') {
 			//처리중 에러가 발생 메시지 출력
 			failCallBack();
 		}
 	 } // end of function()
 } // end of addStudent(e)
 
 function makeTr(student) { //오브젝트 타입의 매개변수
 	let tr = document.createElement('tr');
 	for(let obj in student) {
 		let td = document.createElement('td');
 		tr.appendChild(td);
 		td.innerHTML = student[obj];
 	}//end of makeTr(student)
 	
 	//삭제버튼 생성
 	let delBtn = document.createElemnet('button');
 	delBtn.innerHTML = '삭제';
 	
 	//이벤트 등록
 	delBtn.addEventListener('click', function() {
 		//삭제(id를 기준으로 파악 -> ajax 호출) : this(=이벤트 대상이 되는 엘리먼트) = button
 		let id = this.parentElement.parentElement.firstChild.innerHTML; //첫번째 자식태그에 firstChild라는 속성 부여
 		console.log(id);
 		let xhtp = new XMLHttpRequest();
 		xhtp.open('get', 'delStudentServlet?delId='+id); //?뒤에 파라미터 시작 delId가 Id와 같다
 		xhtp.send();
 		xhtp.onload = function() {
 			let result = JSON.parse(xhtp.responseText);
 			if(result.retCode == 'OK') {
 				console.log(result.retVal);
 			} else {
 				console.log(result.retVal);
 			}
 		}
 	})
 	let td = document.createElement('td');
 	tr.appendChild(td);
 	td.appendChild(delBtn);
 	return tr;
 }
 
function successCallBack2(retObj) {
   console.log(retObj);
   let obj = {
      studNo: retObj.studNo,
      studName: retObj.studName,
      engScore: retObj.engScore,
      korScore: retObj.korScore,


   }
   document.getElementById('list').appendChild(makeTr(obj));


};// end successCallBack2
 
 
 function successCallBack() { //성공하면 실행할 함수
 	//사용자가 입력한 값을 Id='list' 하위에 추가하도록 한다
 	let no = document.querySelector('input[name="sno"]').value; //input태그 아래에 name이 sno의 value 속성을 no라는 변수에 담는다
 	let sname = document.querySelector('input[name="sname"]').value;
 	let eng = document.querySelector('input[name="eScore"]').value;
 	let kor = document.querySelector('input[name="kScore"]').value;
	
	let obj = {}; 
	obj.sno = no;
	obj.sname = sname;
	obj.eScore = eng;
	obj.kScore = kor;
	
	let row = makeTr(obj);
	document.getElementById('list').appendChild(row);
 }
 
 function failCallBack() { //실패하면 실행할 함수
 	alert('처리중 에러발생');
 }