package ch05.ex01.case03;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest03 {
	public static void main(String[] args) {
		
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요.");
		
		int i;
		try {
			InputStreamReader isr = new InputStreamReader(System.in); 
			while ((i = isr.read()) != '\n') {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
// InputStreamReader 클래스는 보조 스트림
// 기반 스트림을 보조 스트림으로 감쌈 (+한글읽을 수 있는 기능 보조)
// 기반 스트림을 decoration해서 기능을 확장시켜줌