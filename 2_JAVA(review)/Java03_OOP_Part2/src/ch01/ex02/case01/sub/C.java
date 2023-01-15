package ch01.ex02.case01.sub;

import ch01.ex02.case01.A;

public class C extends A {
	
	public void test() {
		int x = 0;
		
//		x = a;
//		x = b;
		x = c; // protected
		x = d; // public
		
//		m1();
//		m2();
		m3(); // protected
		m4(); // public
	}
}
