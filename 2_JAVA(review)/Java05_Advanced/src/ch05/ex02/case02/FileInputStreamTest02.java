package ch05.ex02.case02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest02 {
	public static void main(String[] args) {
		// 파일의 내용 끝까지 한 바이트씩 data 읽기
		
		try (FileInputStream fis = new FileInputStream("input.txt")) {
			int i;
			while ((i = fis.read()) != -1) {
				System.out.println((char)i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
