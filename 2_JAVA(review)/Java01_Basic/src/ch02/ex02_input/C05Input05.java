package ch02.ex02_input;

import java.util.Scanner;

public class C05Input05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주소 입력: ");
		String address = sc.next(); // 공백문자(space) 전까지 입력받은 문자열 반환
		System.out.println("주소: " + address);
		
		sc.nextLine();
		
		System.out.print("주소 입력: ");
		String address2 = sc.nextLine(); // Enter를 치기 전까지 입력받은 문자열 반환
		System.out.println("주소: " + address2);
	}
}

