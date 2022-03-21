package com.edu;


public class DriverExample {
	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle();
		v1 = new Taxi();
		
		
		Driver driver = new Driver();
		driver.drive(v1); //매개변수의 다형성. 똑같은 v1이라는 호출신호인데 인스턴스에 따라 출력값이 달라진다. 이것은 부모-자식 클래스 사이에서만 가능
	
		Vehicle vehicle = new Vehicle();
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		System.out.println("Vehicle의 최고속력: " + vehicle.getMaxSpeed());
		System.out.println("Taxi의 최고속력: " + taxi.getMaxSpeed());
		System.out.println("Bus의 최고속력: " + bus.getMaxSpeed());
		
		Vehicle[] vehicles = new Vehicle[3];
		vehicles[0] = vehicle;
		vehicles[1] = taxi;
		vehicles[2] = bus;
		// 속도가 제일 빠른 타는 것의 정렬해서 vehicles[0]=taxi, vehicles[1]=bus, vehicles[2]=vehicle이 들어가도록한다.
		//if(vehicles[i].getMaxSpeed()) 를 사용해서 크다 작다 비교.. 위치를 변경..
		
		int veh = vehicles.length -1;
		Vehicle temp = vehicles[0]; // vehicles 배열 속 값들은 class의 값들을 비교하는 것이니까 Vehicle 이라는 클래스에서 변수 temp를 선언해준다.
//		for(int cnt=0; cnt<veh; cnt++) // 
			for(int i=0; i<veh; i++) { //vehicles 배열 속 값 (vehicle taxi), (taxi bus) 를 비교
			if(vehicles[i].getMaxSpeed()<vehicles[i+1].getMaxSpeed()) { //배열 자체를 비교할 수 없다(크다작다의 개념이 없으니까 배열 속 값을 불려와서 비교해야한다)
				temp = vehicles[i];
				vehicles[i] = vehicles[i+1];
				vehicles[i+1] = temp;
			}
		}
		for(int i=0; i<vehicles.length; i++) {
		System.out.println(vehicles[i].getMaxSpeed());
		}
		
		System.out.println(vehicles[0].toString());
		System.out.println(vehicles[2].toString());
	}
}
