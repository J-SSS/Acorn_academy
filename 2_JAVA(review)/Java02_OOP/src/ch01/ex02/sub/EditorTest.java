package ch01.ex02.sub;

public class EditorTest {
	public static void main(String[] args) {
		
		Editor editor = new Editor();
		
		String report = editor.getReport();
		
		System.out.println(report);
	}
}
