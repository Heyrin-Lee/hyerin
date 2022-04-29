/**
 * ajax.js
 */
 
 //ajax = 비동기방식으로 처리
 
 let val = 10;
 setTimeout(function(){ //매개값 2개 (실행할 함수), 실행까지 둘 시간간격
 	val += 5;
 	console.log('hello ->' + val);
 	
  setTimeout(function(){ 
  	val += 3;
 	console.log('hello2 ->' + val);
 	
 	setTimeout(function(){ 
 	val += 4;
 	console.log('hello3 ->' + val);
 	}, 1000);
 	
 }, 1000);
 
 }, 2000); 
//비동기방식은 응답이 오는 순서대로 처리하는데 그렇게 되면 의도한 대로 순서가 안 맞을 수도 있으니까 함수(함수(함수)) 이렇게 읽기 힘든 코드가 만들어진다.
//그래서 나타난 게 fetch()
//정상실행 되면 then() 정상실행이 실패하면 catch() 로 실행시키도록 한다라는 약속을 가지고 함수(함수(함수))보다 읽기 편하고 의도한 순서대로 코드를 완성시켜서 값을 반환할 수 있다 
 
let success = true;
let promise = new Promise(function(resolve, reject) { //2개의 함수를 매개값으로 가진다->성공하면 첫번째 함수(resolve)를, 실패하면 두번째 함수(reject)를 실행한다
	if(success) {
		resolve('success'); //정상실행되면 success라는 값을 넘긴다
	}else {
		reject('error');
	}
}); 

//promise객체는 성공하면 다음으로, 또 성공하면 다음으로.. 차례대로 함수를 실행한다
promise.then(function(result) { //정상실행되면 then 매소드가,.. resolve함수의 정의구문
		console.log(result);
		})  
		.then(function(result) {
			console.log(result);
		})
		.then(function(result) {
			console.log(result);
		})
  		.catch(function(err) { //정상실행 실패하면 catch 매소드가 실행된다..reject함수의 정의구문
  		console.log(err);
  		});