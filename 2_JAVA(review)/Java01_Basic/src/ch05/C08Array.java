package ch05;

public class C08Array {
	public static void main(String[] args) {
		// 요소의 개수에 대한 변수(count)를 유지
		double[] d = new double[5];
		int count = 0;
		
		d[0] = 1.1; count++;
		d[1] = 2.1; count++;
		d[2] = 3.1; count++;
		
		double mTotal = 1;
		for (int i=0; i<count; i++) {
			mTotal *= d[i];
		}
		
		System.out.println(mTotal);
	}
}
