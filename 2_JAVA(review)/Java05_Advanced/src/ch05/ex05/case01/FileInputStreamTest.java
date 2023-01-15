package ch05.ex05.case01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("reader2.txt")) {
			int i;
			while ((i=fis.read()) != -1) {
				System.out.print((char)i);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
