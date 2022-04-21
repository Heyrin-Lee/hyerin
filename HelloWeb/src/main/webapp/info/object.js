//object.js

// 자바에서의 key와 value를 쌍으로 가지고 있는 와 비슷하다
// {key:value}, {key: value}

// 자바에서의 class와 비슷하다..(복합적인 요소의 정보를 담고싶을 때 object에서 선언한다)
let member1 = {
  fullName: 'Hong',
  age:20,
  score:80
};
let member2 = {
  fullName: 'Hwang',
  age:22,
  score:88
};
let member3 = {
  fullName: 'Park',
  age:25,
  score:92
};
// 값 변경
member1.fullName = '홍';

console.log(member1.fullName);
console.log(member2.age);
console.log(member2.age+member3.age);

//member들을 members라는 변수(배열)에 담는다
const members = [member1, member2, member3];
// 홍의 나이는 20이고 점수는 80입니다 형식으로 member의 결과 출력
// let=자바에서의 int와 같은 의미.. i가 변수이기 때문에 붙여줘야한다
for(let i=0; i<members.length; i++) {
  console.log(members[i].fullName+"의 나이는"+members[i].age+"이고 점수는"+members[i].score+"입니다.");
};

// ()안 내용을 document영역에 쓰겠다
document.write('<h3>Hong</h3>');

document.write('<ul>');
for(let i=0; i<members.length; i++) {
  document.write('<li>'+members[i].fullName+'나이는 '+members[i].age+'이고 점수는 '+members[i].score+'점입니다.'+'</li>')
// document.write(`<li>${members[i].fullName},나이는,$members[i].age$이고 점수는$members[i].score$입니다.$</li`>
};
document.write('</ul>');

// `(백틱)사용 = 줄바꿈도 가능
let welcome = `안녕하세요.
반갑습니다!`;
console.log(welcome);