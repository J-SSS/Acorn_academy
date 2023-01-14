package ch04.ex03.case02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling02 {
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("file.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) { // close()가 자동 실행됨 (리소스 자동 해제)
			e1.printStackTrace();
		}
		
		System.out.println("end");
	}
}

// 리소스를 사용하는 경우 close()해줘야 함
// try-with-resource문을 사용하면 close()하지 않아도 자동으로 해제되도록 함
// 자바 7부터 제공되는 기능
// 리소스를 try() 내부에서 실행해야함