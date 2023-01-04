package ch03.ex01.case04;

public class Main {
	public static void main(String[] args) {
		
		C c = new C();
		B b = c;
		A a = c;
		
		c = (C) a;
		c = (C) b;
	}
}
