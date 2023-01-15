package ch03.ex01.case06;

public class Main {
	public static void main(String[] args) {
		
		Calculator calc = new CalculatorImpl();
		int num1 = 10;
		int num2 = 0;
		
		System.out.println(num1 + " * " + num2 + " = " + calc.multiply(num1, num2));
		System.out.println(num1 + " / " + num2 + " = " + calc.divide(num1, num2));
	}
}
