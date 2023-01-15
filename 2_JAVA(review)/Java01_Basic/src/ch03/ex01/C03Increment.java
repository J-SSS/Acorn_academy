package ch03.ex01;

public class C03Increment {
	public static void main(String[] args) {
		// 증감연산자(++): 1씩 증가
		int i = 0;
		++i; // i = i + 1
		System.out.println(i); // 1
		i++; // i = i + 1
		System.out.println(i); // 2
		
		// 전위 연산자(++i): 증가된 값 저장/참조
		i = 0;
		int j = ++i;
		System.out.printf("i: %d, j: %d\n", i, j); // i: 1, j: 1
		
		// 후위 연산자(i++): 증가 이전의 값 저장/참조
		i = 0;
		j = i++;
		System.out.printf("i: %d, j: %d\n", i, j); // i: 1, j: 0
	}
}
