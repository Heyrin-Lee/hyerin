package com.edu;

public class ArraySort {
	
	public static void sorting(int[] ary) { //sorting 이라는 메소드를 하나 더 선언 //배열의 변수가 어떤 것이 오든 ary라고 지정해두었다 //static이 없으면 ArrySort라는 인스턴스가 있어야 사용가능하다.
		int loopCnt = ary.length - 1; //마지막 값이 제일 처음위치로 이동하려면 배열크기 -1
		int temp = ary[0]; //첫번째 값으로 temp값을 지정
		for (int cnt=0; cnt<loopCnt; cnt++)
			for(int i=0; i<loopCnt; i++) { //배열의 값 수는 4개
			if(ary[i] > ary[i+1]) {
				// 34 25 => 25 34로 위치변경한다.
				temp = ary[i];
				ary[i] = ary[i + 1];
				ary[i + 1] = temp;
			}
		}
	}
	
	public static void main(String[] args) { //메소드 안에 메소드는 선언할 수 없다.
		// int[] intAry => {34,25,48,12}; 오름차순으로 배열
		
//		intAray[i] -> intAry[i+1]; // 34 25
//		int temp
		
		int[] intAry = { 34, 25, 48, 12}; //제일 마지막값이 최소값이라고 가정
						// 25 32 12 48 한 번만 작업하면 이렇게 출력됨.. 12가 제일 앞에 오려면 3번을 반복해야 한다.
		sorting(intAry); //12 25 34 48
		
		int[] intAry2 = { 34, 25, 48, 12};
		int[] intAry3 = { 34, 25, 48, 12};
		int loopCnt = intAry.length - 1; //(34,25) (25,48) (48,12)를 비교하는 횟수는 3번이니까 -1
		int temp = intAry[0]; //첫번째 값으로 temp값을 지정
		for (int cnt=0; cnt<loopCnt; cnt++) //12가 제일 앞에 오게 하기 위한 반복문
			for(int i=0; i<loopCnt; i++) { //배열의 값 수는 4개 //(34,25) (25,48) (48,12)를 비교해서 큰수<->작은수 위치 변경을 위한 반복문
			if(intAry[i] > intAry[i+1]) {
				// 34 25 => 25 34로 위치변경한다.
				temp = intAry[i];
				intAry[i] = intAry[i + 1];
				intAry[i + 1] = temp;
			}
		}
		//변경된 결과 출력
		for(int i=0; i<intAry.length; i++) {
			System.out.println(intAry[i]); //sorting(intAry); 와 출력값이 이어진다.
		}
		
	}
	

}
