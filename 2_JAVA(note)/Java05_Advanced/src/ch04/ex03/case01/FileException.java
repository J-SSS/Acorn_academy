package ch04.ex03.case01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileException {
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream fis;
		
		try {
			fis = new FileInputStream("file.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
	}
}
