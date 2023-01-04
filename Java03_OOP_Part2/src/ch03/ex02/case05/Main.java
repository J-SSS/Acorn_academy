package ch03.ex02.case05;

public class Main {
	public static void main(String[] args) {
		
		Calculator calc = new SubCalculator();
		int num1 = 10;
		int num2 = 2;
		
		System.out.println(num1 + "+" + num2 + "=" + calc.add(num1, num2) );
		System.out.println(num1 + "-" + num2 + "=" + calc.substract(num1, num2) );
		System.out.println(num1 + "*" + num2 + "=" + calc.multifly(num1, num2) );
		System.out.println(num1 + "/" + num2 + "=" + calc.divide(num1, num2) );
		
	}
}
