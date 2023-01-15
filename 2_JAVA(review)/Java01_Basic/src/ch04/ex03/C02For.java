package ch04.ex03;

public class C02For {
	public static void main(String[] args) {
		
		// 초기화식 생략
		int i=0;
		for (; i<10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nNumber that came out: " + i);
		
		// 무한 반복
//		for (int j=0; ;) {
//			System.out.println(j);
//		}
		
//		int k=0;
//		for (; k<10; ) {
//			System.out.println(k);
//		}
		
//		int d=0;
//		for (; ; d++) {
//			System.out.println(d);
//		}
		
//		for (;;) {
//			System.out.println(1);
//		}
		
		int e=0;
		for (;;) {
			e++;
			System.out.println(e);
			if (e==10) break;
		}
		
		System.out.println("end");
	}
}
