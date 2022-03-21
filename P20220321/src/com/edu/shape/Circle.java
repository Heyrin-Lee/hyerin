package com.edu.shape;

public class Circle extends Shape {
	private double radius; //부모 클래스에 있는 x,y값 이외에 고유의 값 1개를 가진다.

	//setter만 지정하였다.
		public void setRadius(double radius) {
			this.radius = radius;
		}
	
	@Override
	public double getArea() {
		return radius * 3.14; //부모 클래스에 있는 getArea의 매소드에 대해 Circle 클래스에서 재정의하였다.
	}

	
	
	
}
