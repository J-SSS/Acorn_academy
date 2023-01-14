package ch03.ex01.case07;

public abstract class Baby implements Person{

//	@Override
//	public void breat() {
//		// TODO Auto-generated method stub
//		
//	} 
	//구현하기 싫으면 안해도 되는데, 그러려면 내가 추상클래스가 되어야함.
	// breat()를 받아왔는데 구현을 안한상태니깐?

	@Override
	public void eat() {
		System.out.println("아기가 이유식을 먹습니다.");
		
	}

}
