package ch01.ex02.case01;

public class StringConcatImpl implements StringConcat {

	@Override
	public void concatString(String s1, String s2) {
		System.out.println(s1 + s2);
	}
}
