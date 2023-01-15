package ch05;

public class C10TwoDArray2 {
	public static void main(String[] args) {
		
		int[][] arr = new int[3][4];
		int num = 1;
		
		System.out.println(arr.length);		
		System.out.println(arr[0].length);
		
		// 배열에 값을 저장
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				arr[i][j] = num;
				num++;
			}
		}
		
		// 배열의 값을 출력
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
