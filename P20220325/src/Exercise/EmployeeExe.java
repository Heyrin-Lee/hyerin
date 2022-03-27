package Exercise;

public class EmployeeExe {
	// main매소드에서 실제로 실행이 되는 것이다
	public static void main(String[] args) {
		// EmployeeApp이라는 클래스를 인스턴스화해서 app이라는 실체(변수)를 하나 생성하였다.-> 이제 EmployeeApp에 작성된 기능들을 app을 통해서 호출할 수 있다.
		EmployeeApp app = new EmployeeApp();
		app.execute();
	}
}
