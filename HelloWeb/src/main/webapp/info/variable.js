// variable.js 파일이다
// 변수의 타입은 값이 들어갔을 때 정해진다
var myName = '이혜린'; //string
var yourName; //undifined
var myName = 100; //number
var myName = true; //boolean
myName = null; //object

// yourName이라는 변수를 선언하지도 않았는데 출력할 수 있다 -=>선언되어있는 변수의 이름만 위로 끌어올려서 변수의 존재유무만 파악한다 -> 그래서 페이지 새로고침을 했을 때 undified로 표시된다(console입장에서는 값이 할당되지 않았기 때문에 어떤 타입인지 모른다)
console.log(typeof yourName);
var yourName = "홍길동";
console.log(typeof yourName);

// 전역변수(:script 안에 선언되어 있는 변수) , 지역변수(:함수 안에 선언되어 있는 변수)로 구분
function checkInfo() {
  var myName = 'LeeHyerin';
  console.log(myName);
}
// 함수 안에 선언된 myName이라는 지역함수 속에는 LeeHyerin이라는 값을 담고 있으니까 LeeHyerin을 출력되고
// 함수가 끝나면 전역변수로 바뀌기 때문에 위에서 선언한 myName이라는 전역변수들 중에서 마지막으로 값을 할당한 null값이 출력된다
checkInfo();
console.log(myName);

// ES6(ES2015) => let, const : 블럭레벨의 변수를 선언하는 역할 
// let 블럭레벨 변수선언

// 중복선언을 할 수 없도록 타입을 체크한다 = let
// let myName = 'Rin';

function info() {
  let myName='Rin';
  console.log(myName);
}
info();

{
 let myName='Rin';
 console.log(myName);
}

{
  let myName = 'Lee';
  console.log(myName);
}

// 상수.. 한번 선언한 값은 바꿀 수 없다
const otherName = 'Hong';
// otherName = 'Hwang';

//var,let => 변수선언
// cost => 상수선언