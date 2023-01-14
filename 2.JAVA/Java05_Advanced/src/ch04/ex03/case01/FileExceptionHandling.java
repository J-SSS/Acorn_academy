package ch04.ex03.case01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("file.text");
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
			System.out.println("finally구문은 항상 수행이 됩니다");
		}
	}
}
