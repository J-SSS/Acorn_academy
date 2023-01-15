package ch04.ex04.case01;

import java.io.FileNotFoundException;

public class Main02 {
	public static void main(String[] args) {
		
		ThrowsException test = new ThrowsException();
		
		try {
			test.loadClass("file.txt", "java.lang.System");
		} catch (FileNotFoundException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
	}
}
