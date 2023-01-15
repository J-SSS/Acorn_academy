package ch03.ex02;

public class C02Logical {
	public static void main(String[] args) {
		// 논리 연산자
		// AND  &&
		// OR	||
		int a = 10;
		int b = 5;
		
		// AND  &&
		System.out.println(a==a && b==b); // T&&T->T
		System.out.println(a!=a && b==b); // F&&T->F
		System.out.println(a==a && b!=b); // T&&F->F
		System.out.println(a!=a && b!=b); // F&&F->F
		
		System.out.println();
		
		// OR ||
		System.out.println(a==a || b==b); // T||T->T
		System.out.println(a!=a || b==b); // F||T->T
		System.out.println(a==a || b!=b); // T||F->T
		System.out.println(a!=a || b!=b); // F||F->F
				
		boolean b2 = false;
		b2 = true && true; // true
		b2 = 2>1 || 2<1;
		System.out.println(b2);
	}
}
