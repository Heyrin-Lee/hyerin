package com.edu.lambda.consumer;

import java.util.function.IntSupplier;
// Supplier인터페이스(타입): 매개값이 없고 반환값은 있다
public class SupplierExample {
	public static void main(String[] args) {
		
		IntSupplier intSup = new IntSupplier() {

			@Override
			public int getAsInt() {
				return (int) (Math.random()*10);
			}
			
		};
//		IntSupplier intSup = () -> (int) (Math.random()*10);
		
		int result = intSup.getAsInt();
		System.out.println("결과값은 " + result);

		}
}
