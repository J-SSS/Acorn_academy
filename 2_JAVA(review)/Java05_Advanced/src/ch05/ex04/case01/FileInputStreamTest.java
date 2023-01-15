package ch05.ex04.case01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("reader.txt")) {
			int i;
			while ((i=fis.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e1) { // fis.close()  +  FileNotFoundException  예외처리 동시에
			e1.printStackTrace();
		}
		
		System.out.println("end");
	}
}
