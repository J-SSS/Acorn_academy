package ch04.ex03.case04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	public Class loadClass(String FileName, String className) 
			throws FileNotFoundException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream(FileName);
		
		
		Class c = Class.forName(className);
		return c;
		
}
}
