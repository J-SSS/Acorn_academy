package ch01.ex02.case01.sub;

import ch01.ex02.case01.A;

public class B {

	public void test() {
		A obj = new A(); //A는 다른 패키지에 있어서 import로 끌어와야함
		int x = 0;
		
		//x = obj.a; //private라 안보임
		//x = obj.b; //default 같은 패키지 내에서까지 동작
		//x = obj.c; //protected 상속받은 다른 패키지까지 가능
		x = obj.d; //public 어디서나 접근가능
		
		//obj.m1;
		//obj.m2();
		//obj.m3();
		obj.m4(); //public 어디서나 접근가능
	}
}
