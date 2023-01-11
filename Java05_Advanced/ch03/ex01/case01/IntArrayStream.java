package ch03.ex01.case01;

import java.util.Arrays;

public class IntArrayStream {
	public static void main(String[] args) {
		int[] ints = {1,2,3,4,5};
		
		for(int num : ints)
			System.out.print(num + " ");
		
		System.out.println();
		
		Arrays.stream(ints).forEach(n -> System.out.print(n));
	}

}

//스트림
//자료의 대상과 상관없이 연산을 함
//한 번 생성하고 사용한 스트림은 재사용할 수 없음
//(다른 연산을 위해서는 재생성 필요)
//스트림 연산은 기존 자료를 변경하지 않음

//한 번 생성하고 사용한 스트림은 재사용할 수 없음
	//(다른 연산을 위해서는 재생성 필요)

//메소드 체이닝을 이용해서 여러개의 연산을 한번에 사용가능
//- 중간연산: 여러개의 연산이 적용될수있음 filter map sorted
// -최종연산: 마지막에 한번만 적용됨 foreach count sum
// -최종연산이 호출되어야 중간 연산에 대한 수행이 이루어짐
// -중간연산에 대한 최종결과를 최종연산 수행전까지는 알수없음