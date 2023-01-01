package ch01.ex02.case01.sub;

import ch01.ex02.case01.A;
//다른패키지에 있는 A를 끌어와서 상속받아줌
public class C extends A{

	public void test() {
		int x = 0;
		
		//x = a; //A를 상속받아도 A에 있는 private를 가져올수는없음
		//x = b; //다른 패키지라 작동불가
		x = c; //protected부터는 가능
		x = d;
		
		//m1();
		//m2(); //다른 패키지라 작동불가
		m3();
		m4();
	}
}