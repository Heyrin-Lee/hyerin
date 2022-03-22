package com.edu.interfaces;

public interface RemoteControl { 
		// 필드 생성 불가능.(필드는 값이 인스턴스에 따라 바뀐다는 의미이기 때문에 인터페이스에서는 생성할 수 없다)
// 값이 변경되지 않는다는 조건(상수)하에 필드를 생성할 수 있다.
	 	public static final int MAX_VOLUME = 10; //값이 바뀌지 않는다는 의미=final.. 이 값(10)은 인터페이스에서 선언하면 구현클래스에서 그대로 사용해야한다.. 상수 변수를 선언할 때 이름은 대문자로 작성한다.
	 	public static final int MIN_VOLUME = 0;
	 	//		public RemoteControl() {
		// 생성자 생성이 불가능.
//		}
	 	
		public void powerOn(); // 기능은 없이 규칙만 정의했다.. 구현하는 기능이 없는 것은 추상메소드
		public void powerOff();
}
