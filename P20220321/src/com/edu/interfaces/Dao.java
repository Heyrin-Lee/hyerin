package com.edu.interfaces;

public interface Dao extends RemoteControl, Run { //인터페이스도 상속이 가능하다(인터페이스에서는 다중상속도 가능)..RemoteControl과 Run이 가지고 있는 기능도 함께 구현해야만한다.

	public void select(); //추상 매소드
	public void insert();
	public void update();
	public void delete(); 
}
