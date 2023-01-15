package ch02.ex01.case03;

public class Student {
	// 필드
	String name;
	int score;	
	
	// 생성자(constructor)
	public Student() {}
	
	public Student(String name) { // 생성자 오버로딩(overloading)
		this.name = name;
	}
	
	public Student(int score) {
		this.score = score;
	}
	
	public Student(String name, int score) { 
		this.name = name;
		this.score = score;
	}

	// 메소드
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
}

// 오버로딩(overloading)
// 생성자/메소드(함수)의 이름은 같은데, 매개변수의 개수나 타입이 다른 형태로 표현가능 한 것 -> 다형성(polymorphism)





