package com.edu;

public class Driver {
	public void drive(Vehicle vehicle) { //()안은 매개값이다. Vehicle 클래스의 인스턴스가 오면 되겠습니다.
		vehicle.run();
		vehicle.stop();
	}
}
