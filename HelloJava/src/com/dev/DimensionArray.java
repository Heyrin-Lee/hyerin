package com.dev;

//2차원 배열..
public class DimensionArray {
	public static void main(String[] args) {
		
		int[][] intRectAry = new int[5][5];
		int cntNum = 1;
		for(int i=0; i<5; i++) { //2차원 배열이니까 i,j 두개의 값이 필요하다.
			for(int j=0; j<5; j++) {
				intRectAry[i][j] = cntNum++; //총 25번 반복하면서 1씩 증가된 값을 배열에 넣는다. 
			}
			
		}
		
		
		for(int i=0; i<5; i++) { //2차원 배열이니까 i,j 두개의 값이 필요하다.
			for(int j=0; j<5; j++) {
//				System.out.println("[" + i + "," + j + "]" + ">" + intRectAry[i][j]);
				System.out.printf("%3d", intRectAry[i][j]);
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		//
		int[] intAry = {20, 38, 45}; // |20|38|45| 라는 정수가 들어있다.
		 System.out.println(intAry[0]); //20
		 
		 int[][] intDimAry = { {23, 34}, {12, 32, 45}, {37, 39} }; //첫 번째 값이 배열이다. ex. 34는 첫 번째 배열에 두 번째 요소이다.
		 int[] anotherAry = intDimAry[0]; // => int[] 정수형 배열을 가리킨다.
		 System.out.println(anotherAry[0] == intDimAry[0][0]);
		 
		 System.out.println(intDimAry[0][1]);
		 intDimAry[1][1] = 33; // 두 번째 배열에 두 번째 요소인 32를 33으로 바꾸겠다.
		 System.out.println(intDimAry[1][1]); //출력값은 33이다.
		 
		 
		 
	}
}
