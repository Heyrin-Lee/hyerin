 /**
 * post.js
 */


document.addEventListener('DOMContentLoaded', init); //페이지가 로딩되면 실행되는 함수init


// 리스트
function init() {
   let xhtp = new XMLHttpRequest();
   xhtp.open('get', '../studentList.json'); //studentList.json데이터를 받아와서
   xhtp.send();
   xhtp.onload = function() {
      let data = JSON.parse(xhtp.responseText); //파싱한 결과를 가져와서 데이터라는 변수에 담았다.(배열의 형태를 가짐)
      console.log(data);
      let tbodyList = document.getElementById('list');
      data.forEach(function(elem) {
      console.log(elem);
      let newTr = makeTr(elem);
      tbodyList.appendChild(newTr);      
      
//      tbodyList.appendChild(makeTr(elem));
      
      })


   }//end of onload

	//변경 버튼
	let modBtn = document.querySelector('input[type="button"]');
	modBtn.addEventListener('click', function() {
	let no = document.querySelector('input[name="sno"]').value;
	let name = document.querySelector('input[name="sname"]').value;	
	let eScore = document.querySelector('input[name="eScore"]').value;	
	let kScore = document.querySelector('input[name="kScore"]').value;
	
	let xhtp = new XMLHttpRequest();
	xhtp.open('get', `modStudentServlet?a=${no}&b=${name}&c=${eScore}&d=${kScore}`);
	xhtp.send();
	xhtp.onload = function() {
		let result = JSON.parse(xhtp.responseText);
		if(result.retCode == 'OK') {
		//결과값으로 받은 학번,이름,영어,국어점수 값으로 새로운 newTr을 만들고
			let obj = {
			studentNo:result.studentNo, //studentNo는 key값
			studentName:result.studentName,
			engScore:result.engScore,
			korScore:result.korScore
			}
			let newTr = makeTr(obj);
			let oldTr = document.getElementById(result.studentNo);
			document.getElementById('list').replaceChild(newTr,oldTr);//부모태그('list')에 newTr -> oldTr로 대체
		} else {
		alert('변경 중 오류!');
		}
	}
	})
}//end of init()


//한건 추가
function addStudent(e) {
   e.preventDefault(); // submit 차단. 전송의 기능:페이지가 바뀐다.. 페이지가 안 바뀌게한다
   console.log(e);

   let no = document.querySelector('input[name="sno"]').value;
   let name = document.querySelector('input[name="sname"]').value;
   let eng = document.querySelector('input[name="eScore"]').value;
   let kor = document.querySelector('input[name="kScore"]').value;

   let xhtp = new XMLHttpRequest(); //비동기방식으로 서버의 파일요청 -> 처리된결과 받아옴
   xhtp.open('get', `addStudentServlet?sno=${no}&sname=${name}&eScore=${eng}&kScore=${kor}`)
   xhtp.send(); //요청
   xhtp.onload = function() {
      console.log(xhtp.responseText); //  {"retCode":"Success"}
      let result = JSON.parse(xhtp.responseText); //responseText 요청결과값 {"retCode":"Success"}
      if (result.retCode == 'Success') {
         // 리스트 새로운 값 추가.
         successCallBack2(result);
      } else if (result.retCode == 'Fail') {
         // 처리중 에러가 발생.
         failCallBack()
      }
   }// end of function
} //end addStudent(e)

function makeTr(student) {

   let tr = document.createElement('tr');
	tr.setAttribute('id', student.studentNo); //파싱한 속성의 이름이 studentNo. 라인 삭제를 위해 id값을 getElementById(id)로 불러오고 해당하는 id값을 가져오면 remove(); -->tr에 id속성을 받았기 때문에 console창에서 보면 tr에 대해 각자 가지고 있는 id값이 부여됨
   for (let e in student) {
      let td = document.createElement('td');
      td.innerHTML = student[e];
      tr.appendChild(td);

   }
   //삭제버튼 생성
   let delBtn = document.createElement('button');//<button></button>
   delBtn.innerHTML = '삭제';
   
   // 이벤트 등록.
   delBtn.addEventListener('click',function(){
   // 삭제(id파악 => ajax호출.) : this => 이벤트 대상엘리먼트(delBtn);
   let id = this.parentElement.parentElement.firstChild.innerHTML;
   console.log(id);
   let xhtp = new XMLHttpRequest();
   xhtp.open('get','delStudentServlet?delId='+id);
   xhtp.send();
   xhtp.onload = function(){
   let result = JSON.parse(xhtp.responseText);
   if(result.retCode == 'OK'){
   alert(result.retVal + '번이 삭제되었습니다'); //result.retVal = 삭제된 Id
   document.getElementById(result.retVal).remove();
   }else{
   console.log(result.retVal);
   }
   }
   
   
   
});
   
   
   
   let td = document.createElement('td');
   td.appendChild(delBtn);
   tr.appendChild(td);
   return tr
};// end makTr
function successCallBack2(retObj) {
   console.log(retObj);
   let obj = {
      studentNo: retObj.studentNo,
      studName: retObj.studName,
      engScore: retObj.engScore,
      korScore: retObj.korScore,


   }
   document.getElementById('list').appendChild(makeTr(obj));


};// end successCallBack2

function successCallBack() {
   // 사용자 입력값을 id='list' 하위 추가.
   let no = document.querySelector('input[name="sno"]').value;
   let name = document.querySelector('input[name="sname"]').value;
   let eng = document.querySelector('input[name="eScore"]').value;
   let kor = document.querySelector('input[name="kScore"]').value;


   let row =
   {
      no: no,
      na: name,
      en: eng,
      ko: kor
   };
   document.getElementById('list').appendChild(makeTr(row));
}


function failCallBack() {
   alert('처리중 에러발생.')
}