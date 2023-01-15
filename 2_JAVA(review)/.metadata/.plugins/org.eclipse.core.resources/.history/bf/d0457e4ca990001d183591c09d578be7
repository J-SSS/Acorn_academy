package ch04.ex04.case01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	
	public Class loadClass(String fileName, String className) 
			throws FileNotFoundException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		
		return c;
	}
}
