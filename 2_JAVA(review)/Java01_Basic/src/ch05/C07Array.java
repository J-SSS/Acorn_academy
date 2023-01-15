package ch05;

public class C07Array {
	public static void main(String[] args) {
		// length: 배열의 방의 개수
		// length를 활용해 오류가 나는 경우
		double[] d = new double[5];
		
		d[0] = 1.1;
		d[1] = 2.1;
		d[2] = 3.1;  // d[3]=0.0, d[4]=0.0
		
		double mTotal = 1;
		for (int i=0; i<d.length; i++) {
			mTotal *= d[i]; // mTotal = mTotal * d[i]  1*d[0]*d[1]*d[2]*d[3]*d[4]
		}
		
		System.out.println(mTotal); // 0.0
	}
}
