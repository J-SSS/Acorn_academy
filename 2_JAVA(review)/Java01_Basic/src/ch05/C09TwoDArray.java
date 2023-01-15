package ch05;

public class C09TwoDArray {
	public static void main(String[] args) {
		
		int[][] arr = new int[3][4]; // 3행 4열
		int num = 1;
		
		// 배열에 값을 저장
		for (int i=0; i<3; i++) {
			for (int j=0; j<4; j++) {
				arr[i][j] = num;
				num++;
			}
		}
		
		// 배열의 값을 출력
		for (int i=0; i<3; i++) {
			for (int j=0; j<4; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
// arr[0][0] arr[0][1] arr[0][2] arr[0][3] 
// arr[1][0] arr[1][1] arr[1][2] arr[1][3]
// arr[2][0] arr[2][1] arr[2][2] arr[2][3]
