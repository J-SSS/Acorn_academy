package ch02.ex01_print;

public class C03Print03 {
	public static void main(String[] args) {
		// %자릿수d - 자릿수만큼 공간 가짐(오른쪽 정렬)
		System.out.printf("%5d", 10);
		System.out.println();
		
		// %-자릿수d - 자릿수만큼 공간 가짐(왼쪽 정렬)
		System.out.printf("%-5d%d", 10, 20);
		System.out.println();
		
		System.out.printf("%05d", 10);
		System.out.println();
		
		System.out.printf("%f\n", 1.234567);
		// %.소수점자릿수f
		System.out.printf("%.2f\n", 1.234567);
		
		System.out.printf("%10.2f", 1.234567);
	}
}
