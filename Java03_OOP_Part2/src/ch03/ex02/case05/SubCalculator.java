package ch03.ex02.case05;

public class SubCalculator extends CalculatorImpl {

	@Override
	public int multifly(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if( num2 ==0)
			return ERROR;
		else
		return num1/num2;
	}

}
