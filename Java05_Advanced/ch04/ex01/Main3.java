package ch04.ex01;

public class Main3 {
	public static void main(String[] args) { // 동적 배열 -> 프로그램 실행 값을 입력
		
		System.out.println("매개변수 2개 전달");
		
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			
			System.out.println("a =>" + a + " b =>" + b);
			System.out.println("a를 b로 나눈 몫=> " + (a/b));
		} catch (ArithmeticException e) {
			System.out.println("=========");
			System.out.println(e);
			System.out.println("어떤 수를 0으로 나눌 수가 없습니다.");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("=========");
			System.out.println(e);
			System.out.println("배열의 크기를 초과하는 인덱스 오류입니다.");
		} catch (NumberFormatException e) {
			System.out.println("=========");
			System.out.println(e);
			System.out.println("잘못된 형식(정수가 아님)입니다.");
		} catch (Exception e) {
			System.out.println("=========");
			System.out.println(e);
			System.out.println("위 exception외의 나머지에 대한 예외처리를 해줌");
			return;
		} finally {
			System.out.println("에러 발생 유무와 상관 없이 무조건 처리해줘야 할 구문");
			// close() 리소스/메모리 해제하는 실행문 옴 return의 유무와 관계없이 동작
		}

		
	}
}
