package ch02.ex02_input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C03Input03 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("국어 점수 입력: ");
		int kor = Integer.parseInt(in.readLine());

		System.out.println("국어 점수: " + kor);
	}
}
