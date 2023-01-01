package ch01.ex04.case04;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("사자가 네 발로 걷습니다.");
	}
	public void hunt() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}
class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 두 날개로 날아갑니다.");
	}
	public void pectAt() {
		System.out.println("독수리가 먹이를 쫍니다.");
	}
	
}

public class AnimalTest {
	public static void main(String[] args) {
		
		Animal hAnimal = new Human(); //업캐스팅
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		ArrayList<Animal> list = new ArrayList<>();
		list.add(hAnimal);
		list.add(tAnimal);
		list.add(eAnimal);
		
		Eagle eagle = (Eagle) eAnimal; //다운캐스팅(down_casting)
		eagle.pectAt();
//		Human human = (Human) eAnimal; //eAnimal은 애니멀객체이지만 이글의 속성을 따르므로, 휴먼으로 다운캐스팅 불가함
		// 업캐스팅/다운캐스팅은 상속관계예서만 가능하다
		
		AnimalTest test1 = new AnimalTest();
		test1.testDownCasting(list);
	}
	

	
	public void testDownCasting(ArrayList<Animal> list) {
		for (int i=0; i<list.size(); i++) {
			Animal animal = list.get(i);
			
			if(animal instanceof Human) { //animal의 타입(Animal)이 Human타입으로 변환 가능한지를 확인
				Human human = (Human) animal;
				human.readBook();
			}
			else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.hunt();
			}
			else if(animal instanceof Eagle) {
				Eagle eagls = (Eagle) animal;
				eagls.pectAt();}
			else {
				System.out.println("ERROR");
			}
		}
	}
	

	
}
