package ch01.ex02.case01;

public class C extends A {

	public void test() {
		int x = 0;
		
//		x = a; // private
		x = b;
		x = c;
		x = d;
		
//		m1(); // private
		m2();
		m3();
		m4();
	}
}
