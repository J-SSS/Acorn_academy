package ch01.ex02.case01;

public class B {
	
	public void test() {
		A obj = new A();
		int x = 0;
		
//		x = obj.a; // private
		x = obj.b;
		x = obj.c;
		x = obj.d;
		
//		obj.m1(); // private
		obj.m2();
		obj.m3();
		obj.m4();
	}
}
