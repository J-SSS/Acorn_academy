package ch01.ex04.case02;

import java.util.ArrayList;

import ch01.ex04.case01.Animal;
import ch01.ex04.case01.Falcon;
import ch01.ex04.case01.Human;
import ch01.ex04.case01.Lion;

public class Test {
	public static void main(String[] args) {
		
		Animal lion = new Lion(); // up_casting(업케스팅_자동타입변환)
		Animal falcon = new Falcon();
		Animal human = new Human();
		
		ArrayList<Animal> list = new ArrayList<>();
		list.add(lion);
		list.add(falcon);
		list.add(human);
		
		for (Animal animal : list) {
			animal.move();
		}
	}
}
