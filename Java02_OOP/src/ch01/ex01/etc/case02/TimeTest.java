package ch01.ex01.etc.case02;

public class TimeTest {
	public static void main(String[] args) {
		Time time = new Time();
		time.hour = 3;
		time.minute = 38;
		time.second = 30;
		
		System.out.printf("%d시 %d분 %d초",time.hour, time.minute, time.second); //이런식으로 복잡하게 써줘야됨
		System.out.println();
		//toString을 사용하는경우
		
		System.out.println(time.toString());
		System.out.println(time); //toString 생략해도 출력됨
	}
}
