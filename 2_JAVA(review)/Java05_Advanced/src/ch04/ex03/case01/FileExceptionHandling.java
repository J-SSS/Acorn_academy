package ch04.ex03.case01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// try-catch-finally
public class FileExceptionHandling {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("file2.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
//			return;
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("finally 구문은 항상 수행이 됩니다.");
		}
		
		System.out.println("end");
	}
}
