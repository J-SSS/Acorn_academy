package ch04.ex02.case04;

public class NumberExceptionHandling {
	public static void main(String[] args) {
		
		String[] strs = {"-2","1","3.14"};
		
		try {
		for(int i=0; i<strs.length; i++) {
			int j = Integer.parseInt(strs[i]);
			System.out.println("정수로 변환된 값은 :" + j);
		}
		} catch (Exception e) {
			System.out.println(" 정수로 변환할 수 없습니다.");
		}
	}
}