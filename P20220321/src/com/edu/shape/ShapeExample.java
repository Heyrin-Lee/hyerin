package com.edu.shape;

public class ShapeExample {
	public static void main(String[] args) {
		Shape s1 = new Ractangle(); //s1이라는 변수가 Shape 클래스에 담겨져있다.
		Shape s2 = new Circle();
		Shape s3 = new Triangle(); 
		
		if(s1 instanceof Ractangle) {
			Ractangle r1 = (Ractangle) s1;
			r1.setWidth(12.3);
			r1.setHeight(12.8);
			System.out.println(r1.getArea()); //Ractangle에 있는 재정의한 getArea()를 이용하였다. 
		}
		
		if(s2 instanceof Circle) {
			Circle r2 = (Circle) s2;
			r2.setRadius(6.5);
			System.out.println(r2.getArea());
		}
		
		//(s3 instanceof ) {
		
		}
	}

