package ch05.ex03.case03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest03 {
	public static void main(String[] args) throws FileNotFoundException {
		// byte[] 배열에 A-Z까지(26개) 넣고 그 배열을 한꺼번에 파일에 쓰기
		FileOutputStream fos = new FileOutputStream("output02.txt", true);		
		
		try (fos) { // 자바9부터 제공되는 기능
			byte[] bs = new byte[26];
			byte b1 = 65; // 'A'
			for (int i=0; i<bs.length; i++) { // A-Z까지 배열에 넣기
				bs[i] = b1;
				b1++;
			}
			fos.write(bs);
		} catch (IOException e) { // fos.close() 리소스 해제
			e.printStackTrace();
		}
		
		System.out.println("파일 생성과 출력이 완료되었습니다.");
	}
}
