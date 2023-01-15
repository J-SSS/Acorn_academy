package ch01.sub.case01;

public class Main {
	public static void main(String[] args) {
		
		Human human = new Human();
		Food ramen = new Ramen(); // 업캐스팅(자동타입변환) Ramen -> Food
		Food kimchi = new Kimchi();
		
		human.eat(ramen);
		human.eat(kimchi);
	}
}
