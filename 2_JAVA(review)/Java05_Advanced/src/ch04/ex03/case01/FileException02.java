package ch04.ex03.case01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileException02 {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("file2.txt");
			
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
			
			try {
				try {
					fis.close();
				} catch (NullPointerException e2) {
					e2.printStackTrace();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		
		System.out.println("end");
	}
}

// 파일을 열고 닫거나, 네트워크를 열고 닫을 때에는 리소스 해제를 구현해야 함
// GC(Garbage Collector)