package ch03.sub;

import java.util.ArrayList;

public class VM { // Vending Machine(자판기)
	// 필드
	protected ArrayList<String> vm;
	
	// 생성자
	public VM() {
		vm = new ArrayList<>();
	}
	
	// 메소드
	public ArrayList<String> getVm() {
		return vm;
	}
	
	public int getNumber() {
		return vm.size();
	}
}
