package ch02.ex02_input.quiz;

import java.io.IOException;

public class Quiz01 {
	public static void main(String[] args) throws IOException {
		
		System.out.print("입력: ");
		char x = (char) System.in.read();
		
		System.out.println("입력받은 값: " + x);
	}
}
