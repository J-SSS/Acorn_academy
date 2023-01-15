package ch03.ex02;

public class C01Rational {
	public static void main(String[] args) {
		// 비교/관계 연산자
		// 같다 ==  다르다 !=
		// 크다/작다 < >
		// 크거나/작거나 같다 >= <=
		int a = 10;
		int b = 5;
		
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		
		System.out.println();
		
		// 유니코드 비교
		boolean b1 = 'A' < 'B'; // 65 < 66
		boolean b2 = '0' == 0;  // 48 == 0
		boolean b3 = 'A' != 65; // 65 != 65
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}
}
