package ch04.ex02.case04;

public class NumberException {
	public static void main(String[] args) {
		
		String[] strs = {"-2", "1", "3.14"}; // [0][1][2]
		
		for (int i=0; i<strs.length; i++) {
			int j = Integer.parseInt(strs[i]); // 문자열로된 정수를 int 타입으로 변환
			System.out.println("정수로 변환된 값은 " + j);
		}
	}
}
