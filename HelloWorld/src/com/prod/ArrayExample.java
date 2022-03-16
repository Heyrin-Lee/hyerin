package com.prod;

public class ArrayExample {
	public static void main(String[] args) {
		long l1 = 123456543341234L; // 8byte (L이 없으면 int 값으로 인식하므로 L을 붙여서 long 타입이라는 것을 알려줘야 한다.)
		int i1 = 100; // 4byte
		byte b1 = 127; // 1byte (-128~-1 / 0~127까지의 데이터 사용하여 표현 가능, +-반틈씩 사용하기 때문에 사용 범위가 이렇게 된다). int 와 byte 는 값을 담을 수 있는 크기가 다르다.
		b1++;
		b1++;
		short s1 = 100; // 2byte (-32768 ~ -1 / 0~32767까지의 데이터 사용하여 표현 가능)
		
		int sum = 0;
		int score1 = 80;
		int score2 = 90;
		int score3 = 85;
		int score4 = 95;
		int score5 = 88;
		
		sum += score1;
		sum += score2;
		sum += score3;
		sum += score4;
		sum += score5;
		
		double avg = sum / (double) 5;
		
		//배열
		int[] scores = new int[5]; // (변수 이름)scores라는 배열을 만들고 배열 속에 들어가는 int형 데이터의 수는 5이다.
		
		scores[0] = 80; // 첫 번째 데이터 값은 80이다. 
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 95;
		scores[4] = 88;
		
		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);
		
	//	System.out.println(scores[0] + scores[1]); //170
		
		//배열을 활용해서 sum => avg
		sum = 0;
		for(int i =0; i<5; i++) {
			sum += scores[i];
		}
		avg = sum / (double) 5;
		System.out.println("평균값은 " + avg);
		
		
	//	for(int i=0; i<5; i++) {
	//		System.out.println(scores[i]); // scores[0]이 첫 번째로 출력되고 scores[1,2,3,4] 까지 출력된다.
	//	}
		
		
	}
}
