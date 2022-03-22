package Exercise;

public class People {
	int age; // 나이
	String name; // 이름
	String check; // 클럽 참여 여부
	int in; // 클럽 인원
	
	public void peoplePrint() { // 객체 정보 출력
		System.out.println("나이: " + age);
		System.out.println("이름 : " + name);
		System.out.println("클럽 참여 여부: " + check);
		System.out.println("클럽 인원: " + in);
	}
	
	public static void main(String[] args) {
		
		People people = new People(); // People이라는 클래스를 바탕으로 people이라는 인스턴스를 만들었다.
		
		people.age = 23;
		people.name = "이혜린";
		people.check = "No";
		people.in = 6;
		
		people.peoplePrint();
	}
}
