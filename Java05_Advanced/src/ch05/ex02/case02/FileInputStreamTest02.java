package ch05.ex02.case02;

import java.io.FileInputStream;

public class FileInputStreamTest02 {
	public static void main(String[] args) {
		

		try (FileInputStream fis = new FileInputStream("input.txt")){
			int i;
			while ((i=fis.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
