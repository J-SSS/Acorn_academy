package ch05.ex01.case01;

import java.io.IOException;

public class SystemInTest {
	public static void main(String[] args) {
		
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요.");
		
		int i;
		try {
			i = System.in.read();  // read()의 반환값은 int
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
