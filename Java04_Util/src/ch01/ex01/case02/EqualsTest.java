package ch01.ex01.case02;

public class EqualsTest {
	public static void main(String[] args) {
		
		Worker w1 = new Worker(1001,"John");
		Worker w2 = new Worker(1001,"John");
		
		
		System.out.println(w1==w2); //false
		System.out.println(w1.equals(w2)); //true
	
		
	}
}
