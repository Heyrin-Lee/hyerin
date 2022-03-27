package com.edu.lambda.consumer;

import java.util.function.IntBinaryOperator;

// Operator: 연산처리 결과
public class OperatorExample {
	public static void main(String[] args) {
		
//		IntBinaryOperator intBin = new IntBinaryOperator() {

//			@Override
//			public int applyAsInt(int left, int right) {
//				return left + right;
//			}
//			
//		}
			
			IntBinaryOperator intBin = (left, right) -> left + right;
			intBin.applyAsInt(10, 20); //30
			
			
			intBin = (num1, num2) -> num1>num2?num1:num2; //두 개의 매개값을 받아서 비교후 num1이 크면 num1을,, 작으면 num2를 출력
			int result = maxOrMin(intBin); //더 큰 수를 선택하는 기능을 매개변수 자리에 넣었다
			System.out.println(result);
			
	}
	
	public static int maxOrMin(IntBinaryOperator intBin) { //maxOrMin이라는 매소드는 매개변수에 값이 아니라 어떻게 처리할지에 대한 기능이 들어온다....maxOrMin이라는 매소드는 intAry가 가지고 있는 값들중에서 가장 큰 값을 리턴해주도록 한다 
		int[] intAry = {85,47,92};
		int result = intAry[0]; // 가장 작은 값을 가져온다
		for(int num : intAry) {
			result = intBin.applyAsInt(result, num); // 두 개의 수를 매개값으로 받아서 큰 수를 반환하는 매개변수(=intBin) 그리고 그 기능을 수행하는 매소드(applyAsInt)
		}
		return result;
	}
}
