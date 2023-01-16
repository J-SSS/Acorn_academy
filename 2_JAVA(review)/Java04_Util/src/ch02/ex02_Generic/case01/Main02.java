package ch02.ex02_Generic.case01;

public class Main02 {
	public static void main(String[] args) {
		
		Yellow yInk = new Yellow();
		Pink pInk = new Pink();
		ColorPrinter03 printer = new ColorPrinter03();
		
		printer.setInk(yInk);
		printer.setInk(pInk);
		
		Pink p = (Pink) printer.getInk();
		
		System.out.println(p);
	}
}
