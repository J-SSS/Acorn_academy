package ch02.ex02.case02;

public class LocalInnerMain {
	public static void main(String[] args) {
		
		OuterClass out = new OuterClass();
		
		Runnable runner = out.getRuannable(10);
		runner.run();
	}
}
