package ch03.ex01;

public class C02Assignment {
	public static void main(String[] args) {
		// 대입 연산자(=)
		// 오른쪽에 있는 식/값을 왼쪽의 변수에 저장
		int a=1, b=2;
		System.out.printf("a: %d, b: %d\n", a, b);
		
		a = b;
		System.out.printf("a: %d, b: %d\n", a, b);
		
		a = a + 1;
		System.out.println(a);
		
		// 복합 대입 연산자
		int i = 3;
		
		i = i + 2;  // 5
		i += 2;		// 7  i = i + 2
		i -= 2;		// 5  i = i - 2
		i *= 2;		// 10 i = i * 2
		i /= 2;		// 5  i = i / 2
		i %= 2;		// 1  i = i % 2
		
		System.out.println(i);
	}
}
