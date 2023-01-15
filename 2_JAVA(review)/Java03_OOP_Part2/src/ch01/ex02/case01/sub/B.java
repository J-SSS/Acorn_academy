package ch01.ex02.case01.sub;

import ch01.ex02.case01.A;

public class B {
	
	public void test() {
		A obj2 = new A();
		int x = 0;
		
//		x = obj2.a; // private
//		x = obj.b;  // default
//		x = obj2.c; // protected
		x = obj2.d; // public
		
//		obj2.m1();
//		obj2.m2();
//		obj2.m3();
		obj2.m4();  // public
	}
}
