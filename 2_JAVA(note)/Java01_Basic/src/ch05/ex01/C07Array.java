package ch05.ex01;

public class C07Array {
	public static void main(String[] args) {
		
		//length: 배열의 방의 개수
		//length를 활용해 오류가 나는 경우
		
		double[] d = new double[5];
		
		d[0] = 1.1;
		d[1] = 2.1;
		d[2] = 3.1;
		
		int i =0;
		double mTotal = 1;
		for (i=0; i<d.length; i++) { //mTotal * d0 * d1 * d2 * d3 * d4까지 계산돼서 0으로 표시됨.
			mTotal *= d[i]; // mTotal = mTotal * d[i] 
		}
		System.out.println(i);
		
//		double[] e = new double[5];
//		int count = 0;
//		
//		e[0] = 1.1; count++;
//		e[1] = 2.1; count++;
//		e[2] = 3.1; count++;
//		
//		double mTotal2 = 1;
//		for (i=0; i<e.length; i++) {
//			mTotal2 *= e[i]; // mTotal = mTotal * d[i] 
//		}
	}
}
