package ch01.ex04.case01;

public class Test {
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}	
	
	public static void main(String[] args) {
		
		Animal lion = new Lion(); // up_casting(자동타입변환)
		Animal falcon = new Falcon();
		Animal human = new Human();
		
		Test t = new Test();
		t.moveAnimal(lion);
		t.moveAnimal(falcon);
		t.moveAnimal(human);
	}
}
/*
	1. 오버라이딩(override)
	- 상위 클래스에 정의된 메소드의 구현 내용이 하위 클래스에서 구현할 내용과 맞지 않는 경우,
	하위 클래스에서 동일한 이름의 메소드를 재정의함을 의미한다.
	2. 오버로딩(overload)
	- 자바의 한 클래스 내에서 이미 사용하려는 이름과 동일한 이름의 메소드/생성자가 있다하더라도
	매개변수의 개수 또는 타입이 다르면, 같은 이름을 사용해서 메소드/생성자를 정의함을 의미한다.
	3. 다형성(polymorphism)
	- 하나의 코드(객체)가 여러 타입으로 구현되어 실행되는 것을 의미하며,
	같은 코드에서 여러 다른 실행 결과가 나온다.
	- 정보은닉, 상속과 더불어 객체지향 프로그래밍의 가장 큰 특징 중 하나이다.

 */











