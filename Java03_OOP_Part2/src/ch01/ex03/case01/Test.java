package ch01.ex03.case01;

public class Test {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Lion lion = new Lion();
		Falcon falcon = new Falcon();
		Human human = new Human();
		
		animal.move();
		lion.move(); //오버라이딩해서 같은 이름으 메소드를 만들었기때문에 라이언의 move만 선택가능
	}
}
