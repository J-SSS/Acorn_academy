package ch02.ex01.case03;

public class Student {

	//필드
	String name;
	int score;
	
	//생성자
	
	public Student(String name, int score) {//오버로딩(overloading):
		this.name = name;
		this.score = score;
	}
	//생성자,메소드의 이름은 같은데, 매개변수의 개수나 타입이 다른 형태로 표현가능한 것 = 다형성(polymorphism)
	public Student(String name) {

		this.name = name;
	}

	public Student(int score) {
		
		this.score = score;
	}

	public Student() {
	}

	//메소드
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}


	
	
}
