package ch04.ex03;

public class C05GuGuDan {
	public static void main(String[] args) {
		// 중첩 for문을 이용한 구구단
		int dan = 2;
		int unit = 1;
		
		for (; dan<=9; dan++) {
			for (unit=1; unit<=9; unit++) {
				System.out.printf("%d * %d = %d\n", dan, unit, dan*unit);
			}
			System.out.println();
		}
	}
}

/*
	2 * 1 = 2
	2 * 2 = 4
	2 * 3 = 6
	
	...
	
	9 * 1 = 9
	9 * 2 = 18
	...
	9 * 9 = 81
*/