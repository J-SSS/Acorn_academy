package ch01.ex04.case03;

public class Starcraft {
	public static void main(String[] args) {
		
		Protoss p = new Protoss();
		Protoss dragoon = new Dragoon(); // 업케스팅
		Protoss zealot = new Zealot(); 	 // 업케스팅
		Zealot zealot2 = new Zealot();
		
		dragoon.attack();
		dragoon.depense();
		
		zealot.attack();
		zealot.depense();
//		zealot.move();
		zealot2.move();
	}
}
