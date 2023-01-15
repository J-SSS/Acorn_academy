package ch04.ex03.case01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileException {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("file.txt");
			System.out.println("try 구문 실행 확인");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
	}
}
