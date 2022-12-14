package ch02.ex01_print;

public class C03Print03 {
	public static void main(String[] args) {
		
		//%자릿수d - 자릿수만큼 공간 가짐(=오른쪽 정렬)
		
		System.out.printf("%5d", 10);
		System.out.println();
		
		//%-자릿수d - 자릿수만큼 빈공간 가짐(=왼쪽 정렬)
		System.out.printf("%-5d%d", 10,20);
		System.out.println();
		
		//%0자리수 - 자리수만큼 빈공간에 0표시하는 형식
		System.out.printf("%05d", 10);
		System.out.println();
		
		//%.자릿수 - 자릿수만큼 소수점 표시 , \n을 줄바꿈 역할
		System.out.printf("%.2f\n", 1.234567);
		System.out.printf("%.2f", 1.234567);
		
		
	}
}
