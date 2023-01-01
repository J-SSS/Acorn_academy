package ch01.ex03.case02;

public class Child extends Parent{
	int a = 10;
	
	@Override
	void output() {
		super.a= 20;
		System.out.println("a : " + a);
		
		System.out.println("부모 a " + super.a);
		System.out.println("자식 a " + this.a);
		
	}
	// 오버로딩(overload)
	// 메소드 이름이 같아도, 매개변수의 개수/타입을 다르게 할 수 있음(생성자/메소드)
	void output(int a) {
		System.out.println("a : " + a);
	}
	
}
