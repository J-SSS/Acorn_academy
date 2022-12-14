package ch02.ex02_input;

import java.util.Scanner;

public class C05Input05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주소 입력: ");
		String address = sc.nextLine(); //문장 형태로 받아주는 기능임. next는 공백있으면 짤림
		System.out.println("주소: " + address);
	}
}
