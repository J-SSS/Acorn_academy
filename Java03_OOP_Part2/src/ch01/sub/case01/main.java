package ch01.sub.case01;

public class main {
	public main() {

		Human human = new Human();
		Food ramen = new Ramen();
		Food kimchi = new Kimchi();
		
		human.eat(kimchi);
		human.eat(ramen);
	}
}
