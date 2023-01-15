package ch01.ex04.case04;

import java.util.ArrayList;

class Animal {	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	public void hunt() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	public void pectAt() {
		System.out.println("독수리가 모이를 쫍니다.");
	}
}

public class AnimalTest {
	
	public static void main(String[] args) {
		
		Animal hAnimal = new Human(); // 업케스팅
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		ArrayList<Animal> list = new ArrayList<>();
		list.add(hAnimal); // [0]
		list.add(tAnimal); // [1]
		list.add(eAnimal); // [2]
		
		Eagle eagle = (Eagle) eAnimal; // 다운캐스팅(down_casting)  Animal->Eagle
		eagle.pectAt();
//		Human human = (Human) eAnimal; // 업케스팅/다운케스팅은 상속 관계에서 가능
		
		AnimalTest test = new AnimalTest();
		test.testDownCasting(list);
	}
	
	public void testDownCasting(ArrayList<Animal> list) {
		for (int i=0; i<list.size(); i++) {
			Animal animal = list.get(i);
			
			if (animal instanceof Human) { // animal의 타입(Animal)이 Human 타입으로 타입변환이 가능한지 확인(true/false)
				Human human = (Human) animal; // down_casting
				human.readBooks();
			}
			else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.hunt();
			}
			else if (animal instanceof Eagle) {
				Eagle eagle = (Eagle) animal;
				eagle.pectAt();
			}
			else {
				System.out.println("ERROR");
			}
		}
	}
}
