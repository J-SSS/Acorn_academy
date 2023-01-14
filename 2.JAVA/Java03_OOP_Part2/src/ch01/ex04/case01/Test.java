package ch01.ex04.case01;

public class Test {
	
	public void moveAnimal(Animal animal) {
		animal.move();
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
	
		Animal lion = new Lion(); // up_casting(자동타입변환)
		Animal falcon = new Falcon(); //자식이 부모로 자동으로 맞춰짐
		Animal human = new Human();
		
		Test t = new Test();
		t.moveAnimal(lion); //사자가 네 발로 움직입니다 => ?????*
		t.moveAnimal(falcon);
		t.moveAnimal(human);
		t.moveAnimal(new Human()); //자동으로 타입이 변환돼서 부모인 Animal로 들어감
		
		//*) 업캐스팅을 하면 new Lion의 사자가 사라지는것이 아니라, Lion 속성을 가진 Animal객체가 생성되는것.
		//따라서 Lion에게 Animal로부터 오버라이딩된 메소드가 있다면, 실행됨
		//따라서 Animal매개변수로 불러올 수 있으나, 성질은 Lion에 오버라이딩된 move를 가져옴.
		//다만 어디까지나 Animal객체이기때문에 Lion이 가진 고유한 메소드는 lion에서 실행할 수 없음
	}
}
/*
 1. 오버라이딩(Override)
  - 상위 클래스에 정의된 메소드의 구현 내용이 하위 클래스에서 구현할 내용과 맞지 않는경우,
  하위클래스에서 동일한 이름의 메소드를 재정의함을 의미함
 2. 오버로딩(overload)
  - 자바의 한 클래스 내에서 이미 사용하려는 이름과 동일한 이름의 메소드/생성자가 있다고 하더라도
  매개변수의 개수 또는 타입이 다르면, 같은 이름을 사용해서 메소드/생성자를 정의함을 의미함
  
 3. 다형성(polymorphise)
  - 하나의 코드(객체)가 여러 타입으로 구현되어 실행되는 것을 의미하며,
  같은 코드에서 여러 다른 실행 결과가 나온다.
  
  - 정보은닉, 상속과 더불어 객체지향 프로그래밍의 가장 큰 큭징 중 하나이다.
 
 */


