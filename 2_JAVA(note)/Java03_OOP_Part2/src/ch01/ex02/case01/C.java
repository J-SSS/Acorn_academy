package ch01.ex02.case01;

public class C extends A{

	public void test() {
		int x = 0;
		
		//x = a; //A를 상속받아도 A에 있는 private를 가져올수는없음
		x = b;
		x = c;
		x = d;
		
		//m1();
		m2();
		m3();
		m4();
	}
}
