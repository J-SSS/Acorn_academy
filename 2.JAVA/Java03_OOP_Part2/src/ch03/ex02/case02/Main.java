package ch03.ex02.case02;

public class Main {
public static void main(String[] args) {
	Worker w1 = new Worker("910221-1111111", "장동일");
	
	System.out.println(w1.COMPANY);
	System.out.println(w1.regNumber);
	System.out.println(w1.name);
	
	// w1.COMPANY="Apple"; => 상수는 재할당 할 수 없음
	
	//w1.regNumber = "111"; //regNumber를 상수로 지정할경우, 재할당 할 수 없음
	
	//그러나, regNumber는 객체생성을 통해 초기화를 시켜주었기 때문에
	//다른 객체를 생성하면  w1.regNumber와 다른 상수가 생성됨
}
	
}

