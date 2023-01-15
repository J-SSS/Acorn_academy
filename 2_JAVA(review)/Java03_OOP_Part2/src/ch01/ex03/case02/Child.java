package ch01.ex03.case02;

public class Child extends Parent {
	
	int a = 10;
	
	@Override
	void output() {
		super.a = 20;
		System.out.println("a: " + a);
		
		System.out.println("부모 a: " + super.a);
		System.out.println("자식 a: " + this.a);
	}
	
	// 오버로딩(overload)
	// 같은 메소드 이름이지만, 매개변수의 개수/타입을 다르게 사용하는 기술(생성자/메소드)
	void output(int a) {
		System.out.println("a: " + a);
	}
	void output(String a) {		
	}
	void output(int a, int b) {}
}
