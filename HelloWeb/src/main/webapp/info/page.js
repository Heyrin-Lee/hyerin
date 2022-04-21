// page.js
// main.html에 object.html과 page.html이 같이 있으니까 전역변수를 두 html파일이 같이 쓰고 있다
console.log(member1);

let field = 'fullName';
// 같은 결과값이 출력된다
console.log(member1.fullName)
console.log(member2['fullName'])
// ****이 방식 기억**** => 간단하게 표현 가능
console.log(member3[field]);

// 배열요소를 반복적으로 읽어올 때(반복문) for...of를 사용하세요
for(let member of members) {
  console.log(`이름은 ${member['fullName']}이고 나이는 ${member['age']} 이고 점수는 ${member['score']}입니다`);
}

// 오브젝트의 속성(필드)을 반복적으로 읽어올 때 for...in을 사용하세요
for(let field in member1) {
  // ${field}는 member1,2,3의 fullname,age,score을 가져오고, ${member1[field]}는 member1의 field값(member1만의 fullname,age,score)을 가져온다
  console.log(`${field} => ${member1[field]}`);
}
console.log(`--------`)

// 각 배열요소의 각 필드를 출력한다
// member는 object타입(fullname,age,score의 값을 가져오는)
for(let member of members) {
  for(let field in member) {
    console.log(`${field} => ${member[field]}`);
  }
  console.log(`--------`)
}



// let fields = ['fullName','age','score'];
// for(let member of members) {
//   for(let prop of fields) {
//     console.log(`${prop} => ${member[prop]}`);
//   }
//   console.log(`===========`)
// }

document.write('<table border=1>');
let fields = ['fullName','score','age'];
for(let member of members) {
  document.write('<tr>');
  for(let prop of fields) {
    console.log(`${prop} => ${member[prop]}`);
    document.write(`<td>${member[prop]}</td>`);
  }
  document.write('<td><button>클릭</button></td>');
  document.write('</tr>')
  console.log(`----------`)
}
document.write('</table>');