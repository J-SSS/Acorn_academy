package ch04.ex04.case01;

import java.io.FileNotFoundException;

public class Main {
	public static void main(String[] args) {
		
		ThrowsException test = new ThrowsException();
		
		try {
			test.loadClass("file2.txt", "java.lang.string");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
	}
}
