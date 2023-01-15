package ch05.ex03.case01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
	public static void main(String[] args) {
		// 파일에다가 한 바이트씩 쓰기
		
		try (FileOutputStream fos = new FileOutputStream("output.txt")) { 
			fos.write(65); // A
			fos.write(66); // B
			fos.write(67); // C
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { // fos.close() 리소스 해제
			e.printStackTrace();
		}
		
		System.out.println("파일 생성과 출력이 완료되었습니다.");
	}
}

// try-with-resources
// close() 메소드 자동 실행. 그래서 IOException 처리를 finally로 번거롭게 안 해줘도 됨