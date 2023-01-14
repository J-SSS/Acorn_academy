package ch01.ex01.etc.case07;
import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		
		// ArrayList 사용 - 추가, 수정, 삭제, 조회
		// ArrayList 객체 생성 <제네릭 사용>
		
		ArrayList<String> s = new ArrayList<String>();
		
		// 추가 - add();
		s.add("장동일");
		s.add("장동이");
		s.add("장동삼");
		
		// 조회 - get()
		s.get(0);
		s.get(1);
		s.get(2);
		
		// 수정 - set(인덱스, 수정값)
		s.set(1, "장동팔");
		
	
		// 삭제 - remove(인덱스)
		s.remove(0);
		
		// 전체삭제 - removeAll(인스턴스명) : 한꺼번에 삭제기능
		
		
		// 조회1 ->length가 아닌 size사용
		for(int i=0; i<s.size();i++) {
			
		// 조회2 ->enhanced for문도 사용가능
		for (String p : s) {
		}
		
		}
	}
}
