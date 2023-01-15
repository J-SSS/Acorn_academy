package ch02.ex02_input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C02Input02 {
	public static void main(String[] args) throws IOException {
		// 문자열 입력: BufferedReader, Scanner 클래스
		// 자바에서 주로 입력받을 때 사용하는 건 Scanner
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자열 입력: ");
		String str = in.readLine();
		
		System.out.println("문자열: " + str);
	}
}

/*
 * BufferedReader는 InputStreamReader에 버퍼링 기능이 추가된 class
 * 사용자의 요청이 있을 때 버퍼에서 보관후, 데이터를 한번에 읽어오는 방식
 * 
 */