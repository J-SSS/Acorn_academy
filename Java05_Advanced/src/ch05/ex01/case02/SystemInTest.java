package ch05.ex01.case02;

import java.io.IOException;

public class SystemInTest {
	public static void main(String[] args) {
		
		System.out.println("알파벳 하나를 쓰고 [enter]를 누르세요.");
		
		int i;
		try {
			while((i = System.in.read()) != '\n') {
				System.out.println((char)i);
			}
			; // read()의 반환값은 int
	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
