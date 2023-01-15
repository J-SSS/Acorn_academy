package ch01.ex01.sub.case02;

public class TimeTest {
	public static void main(String[] args) {
		
		Time time = new Time();
		time.hour = 3;
		time.minute = 38;
		time.second = 30;
		
		System.out.printf("%d시 %d분 %d초\n", time.hour, time.minute, time.second);
		
		// toString 메소드 사용
		System.out.println(time.toString());
		System.out.println(time); // toString() 생략 가능
	}
}
