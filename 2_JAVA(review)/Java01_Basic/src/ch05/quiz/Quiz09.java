package ch05.quiz;

public class Quiz09 {
	public static void main(String[] args) {
		
		int[][] scores = { 
				{90,90,90}, 
				{20,20,20}, 
				{30,30,30}, 
				{40,40,40}, 
				{50,50,50} 
		};
		
		System.out.println("번호\t국어\t영어\t수학\t합계\t평균");
		System.out.println("--------------------------------------------");
		
		for (int i=0; i<scores.length; i++) {
			System.out.print(i + 1);
			
			int sum = 0;
			for (int j=0; j<scores[i].length; j++) {
				sum += scores[i][j];
				System.out.printf("\t%d", scores[i][j]);
			}
			System.out.printf("\t%d\t%d\n", sum, sum/scores[i].length);
		}
	}
}
