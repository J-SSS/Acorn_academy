package ch02.ex02_Generic.case01;

public class Main {
	public static void main(String[] args) {
		
		Yellow yInk = new Yellow();
		ColorPrinter printer = new ColorPrinter();
		
		printer.setInk(yInk);
		System.out.println(printer);
		
		Pink pInk = new Pink();
		ColorPrinter02 printer02 = new ColorPrinter02();
		
		printer02.setInk(pInk);
		System.out.println(printer02);
	}
}
