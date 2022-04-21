// reference.js 파일

// 배열을 초기값으로 할당
const names = ['조수연','황진주','권가희','이유빈'];
for(let i=0; i<names.length; i++) {
  console.log((i+1) + '번째 이름: ' + names[i]);
}

// 확장코드(enhanced) for(String name:names) {} = 자바에서
// for(String name of names) {} = 자바스크립트
for(let name of names) {
  console.log(name);
}

const numbers = [23, 44, 38, 12, 56];
for(let num of numbers) {
  if(num>40) {
    console.log(num);
  }
}

const inputs = [];
for(let i=0; i<numbers.length; i++) {
var inputVal = prompt('값을 입력하세요');
console.log(typeof inputVal, inputVal);
// inputs이라는 배열에 입력한 값을 담는다
// parseInt = 문자열을 숫자로 바꾼다
inputs[i] = parseInt(inputVal);
}

// 합계, 평균을 구한다
// 변수선언 let, var로 가능하다 const는 상수의 고정값일 경우 사용한다
let = sum= 0 , avg;
for(let i=0; i<inputs.length; i++) {
  sum += inputs[i];
}
avg = sum / inputs.length;

console.log(sum, avg);


