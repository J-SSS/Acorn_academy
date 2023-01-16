package ch02.ex02_Generic.case03;

public class Main {
	public static void main(String[] args) {
		
		YellowInk y = new YellowInk();
		GenericPrinter<YellowInk> yPrinter = new GenericPrinter<>();
		yPrinter.setInk(y);
		
		YellowInk y2 = yPrinter.getInk();
		System.out.println(yPrinter);
		
//		GenericPrinter<Water> wPrinter = new GenericPrinter<>();
	}
}
