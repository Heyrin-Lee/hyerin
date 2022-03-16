package com.prod;

public class ArrayExample5 {
	public static void main(String[] args) {
		int[] numbers = {35, 22, 17, 40, 28, 33, 36};
		// 홀수번 숫자만 더하고 그것들의 평균을 구한다.
		
		int sum = 0;
		int cnt = 0;
		for(int i=0; i<numbers.length; i++) {
			if(i % 2 == 0) { // 홀수번째 값..
				sum+= numbers[i];
				cnt++;
			}
		}
		System.out.println("홀수번 숫자의 합은 " + sum);
		System.out.println("평균: " + (sum / (double) cnt));
	}
}
