package ch04.ex03;

public class C02For {
	public static void main(String[] args) {
		
		// 초기화식 생략
		int i = 0;
		for (  ;  i<10   ; i++) {
			System.out.println("hello " + i);
		}
		
		System.out.println("\n Number that came out:" + i );
		// 조건을 만족하지 않는 수가 i에 입력된다
		
		//무한 반복
/*		
		for(int j = 0;; ) {
			System.out.println(j);
		} 
		-> 무한반복식이 존재하면 다음 코드로 못넘어가서 오류나니까 주석처리해줌
		
		int k= 0;
		for (; k<10; ) {
			System.out.println(k);
		} 
		-> 무한반복식이 존재하면 다음 코드로 못넘어가서 오류나니까 주석처리해줌
		
		int d = 0;
		for (;;d++) {
			System.out.println(d);
		}
		-> 무한반복식이 존재하면 다음 코드로 못넘어가서 오류나니까 주석처리해줌
		*/
		int e = 0;
		for (;;) {
			e++;
			System.out.println(e);
			if (e==10) break;}
		
		
		
		
		
	}
}
