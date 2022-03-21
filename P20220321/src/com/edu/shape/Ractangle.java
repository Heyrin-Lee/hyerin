package com.edu.shape;

public class Ractangle extends Shape { // 부모 클래스 Shape에 상속된다.
	private double width; 
	private double height; //부모 클래스가 가지고 있는 x,y 값 이외에 고유의 값 두개를 가진다.
	
	//setter만 지정하였다.
		public void setWidth(double width) {
			this.width = width;
		}


		public void setHeight(double height) {
			this.height = height;
		}
	
	@Override
	public double getArea() {
		return width + height; //부모 클래스에 있는 getArea의 매소드에 대해 재정의 하였다.
	}

	
	
	
}
