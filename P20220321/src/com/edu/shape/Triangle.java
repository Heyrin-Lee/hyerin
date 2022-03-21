package com.edu.shape;

public class Triangle extends Shape {
	private double base; //밑변,, 
	private double height; //부모 클래스에 있는 값 이외에 고유의 값 2개를 가진다.
	
	//setter만 지정하였다.
		public void setBase(double base) {
			this.base = base;
		}

		public void setHeight(double height) {
			this.height = height;
		}
	
	@Override
	public double getArea() {
		return base * height / 2;
	}

	
	
	
	
	
}
