package ch03.ex01;

public class C03Increment {
	public static void main(String[] args) {
		// 증감 연산자 (++): 1씩 증가
		int i = 0;
		++i;
		System.out.println(i); //1
		
		i++;
		System.out.println(i); //2
		
		// 전위연산자(++i) : 증가된 값을 저장/참조
		i = 0;
		int j = ++i;  // i:1 , j:1
		
		// 후위연산자(i++) : 증가 이전의 값을 저장/참조
		i = 0;
		j = i++; // i:1 , j:0
		
	}
}
