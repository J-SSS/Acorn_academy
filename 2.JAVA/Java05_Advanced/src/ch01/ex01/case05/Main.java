package ch01.ex01.case05;

public class Main {
	public static void main(String[] args) {
		String s1 = "hello ";
		String s2 = "world"	;
	
	StringConcat concat = new StringConcatImpl();
	System.out.println(concat.concatString(s1, s2));
				
	}
	

}
