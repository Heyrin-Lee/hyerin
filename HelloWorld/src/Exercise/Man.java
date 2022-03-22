package Exercise;

public class Man {
	int age;
	String name;
	String marry;
	int children;
	
	public void manInfo() {
		System.out.println("나이: " + age);
		System.out.println("이름: " + name);
		System.out.println("결혼 여부: " + marry);
		System.out.println("아이의 수: " + children);
	}
	
	public static void main(String[] args) {
		Man m1 = new Man();
		m1.age = 30;
		m1.name = "James";
		m1.marry = "Yes";
		m1.children = 2;
		
		m1.manInfo();
	}
	
	
	
}
