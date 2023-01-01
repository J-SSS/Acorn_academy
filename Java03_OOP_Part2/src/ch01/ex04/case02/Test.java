package ch01.ex04.case02;

import java.util.ArrayList;

import ch01.ex04.case01.Animal;
import ch01.ex04.case01.Falcon;
import ch01.ex04.case01.Human;
import ch01.ex04.case01.Lion;

public class Test {
	public static void main(String[] args) {
		
//		Animal animal = new Animal();
		Animal lion = new Lion(); //업캐스팅
		Animal falcon = new Falcon(); //업캐스팅 
		Animal human = new Human(); //업캐스팅
		
		
		ArrayList<Animal> list = new ArrayList<>();
		list.add(lion);
		list.add(human);
		list.add(falcon);
		
		for(Animal animal : list) {
			animal.move();
		}
		
		
		
		
	}
}
