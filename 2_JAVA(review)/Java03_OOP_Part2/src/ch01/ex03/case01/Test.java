package ch01.ex03.case01;

public class Test {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Lion lion = new Lion();
		Falcon falcon = new Falcon();
		Human human = new Human();
		
		animal.move();
		lion.move();
		falcon.move();
		human.move();
		
		lion.hunt();
		falcon.peckAt();
		human.read();
	}
}
