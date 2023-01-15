package ch04.ex02.case04;

public class NumberExceptionHandling {
	public static void main(String[] args) {
		
		String[] strs = {"-2", "1", "3.14"}; 
		
		int i=0;
		try {
			for (; i<strs.length; i++) {
				int j = Integer.parseInt(strs[i]); 
				System.out.println("정수로 변환된 값은 " + j);
			}
		} catch (NumberFormatException e) {
			System.out.println(strs[i] + "은(는) 정수로 변환할 수 없습니다.");
		}
		
		System.out.println("end");
	}
}
