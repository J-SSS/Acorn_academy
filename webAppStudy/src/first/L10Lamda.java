package first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.*;

public class L10Lamda {
    public static void main(String[] args) {
        //람다식이란? : 추상메서드가 1개 있는 인터페이스를 화살표함수를 이용해 객체로 생성하는 것
        //타입 생성 없이 실행 가능한 함수
        //익명 함수를 표현하는 간단한 방법
        //객체지향 문법에서 함수를 매개변수로 사용하기 위한 문법적 설탕!
        //1. 객체지향 문법에서 함수를 매개변수로 사용할 수 없나요?
        //= 함수는 타입이 아니기 때문에 매개변수로 전달할 수 없다.
        //2. 람다식을 사용한다는 것은 자바가 함수형언어의 특징을 갖는것이 아닌가??
        //= 코드의 간소화를 위해서 함수를 매개변수에 넣는 척하는것.
        //3. 함수형 언어가 무엇인가요?
        //= 함수가 타입이 되는 언어입니다. 대표적으로 자바스크립트가 있고, 프로토타입의 함수형 언어입니다.

        //자바는 타입이 명확한 언어기 때문에 람다식으로 사용하는 인터페이스를 미리 정의해두었다.
        Function function=(p)->{return p + "";};
        Function<Integer, String> function2=(p)->{return p + "";}; //매개변수와 반환값이 있고, 타입이 다른 것

        Consumer<Integer> consumer = (p) -> {}; //매개변수만 존재하는 함수
        BiConsumer<Integer,Integer> biConsumer = (p,p1) -> {};

        Supplier<String> supplier = ()->{return "";}; //리턴만 존재하는 함수
        Supplier<String> supplier2 = ()->""; //블럭이 없으면 return을 자동으로 수행

        BinaryOperator<Integer> operator = ( i, i2)->i+i2; // 매개변수가 하나
        UnaryOperator<Integer> operator2 = (i) -> i; //매개변수가 둘
        System.out.println("130+50=" + operator.apply(130,50));

        Predicate<String> intPredicate = (s) -> {
            boolean p = false;
            try {
                int i = Integer.parseInt(s);
                p = true;
            } catch (Exception e){};

            return p;
        };


        //java lib 개발자는 아주아주 게으르다...?


        //Runnable(run) : 매개변수와 반환값이 둘 다 없는 함수(멀티스레드를 만들때 사용...)
        //Function(apply) : 매개변수와 반환값이 있고 타입이 다른 것
        //Consumer(accpet) : 매개변수만 존재하는 함수
        //Supplier(get) : 리턴만 존재하는 함수 (블럭이 없으면 return 을 자동으로 한다.)
        //BinaryOperator(apply) : 매개변수가 2개고 반환하는 값이 있는 함수로 2개의 값을 연산하기 위해 재정의
        //(Double,int,Long)BinaryOperator : 기본형을 연산의 매개로 사용하는 함수 정의(제네릭은 자료형만 정의가능하니까)
        //(Double,int,Long)
        //Predicate(test) : 매개변수를 검사한 결과(boolean)를 반환하는 함수
        //매개변수가 있는 것들은 Bi를 사용하면 매개변수가 2개인 함수 정의
        //filter(Predicate) : 중간연산으로 검사식을 만족하지 않는 요소를 제외하는 내부 반복문
        //forEach(Consumer) : 최종연산으로 스트림을 소비하는 내부 반복문, 보통 검사할 때 많이 사용

        String[] strArr={"1","23","삼","101"};

        //Stream API : 내부반복문을 작성해서 반복문을 유지보수하기 유리하도록 하기위해 만들어짐
        Arrays.stream(strArr)
                .filter((s) -> {
                    try {
                        Integer.parseInt(s);
                        return true;
                    } catch (Exception e) {
                        return false;
                    }

                }).forEach(System.out::println);

        // .계속 이어져있기때에 중간을 주석처리하거나 떼었다 붙였다 하는것도 가능하여 유지보수용이함




        // 함수와 메서드 : 함수는 메서드의 한국말이다. 함수는 수학에서 유래되었고 프로그래밍에서는 정의할 수 있는 연산의 단위가 된다
        // (XX)함수형 언어의 메서드를 함수라고 하고, 객체지향의 메서드를 메서드라고 구분해서 사용...?
        // 함수형 언어의 메서드는 그 자체가 단위(유닛)이고, 객체지향언어에서는 객체가 단위이며, 함수는 그 단위의 필드이다.
        // 람다식은 함수가 객체가 되는 척! 하는것임...



        //Collection(List,Map,Set)의 메소드를 람다로 재정의 가능


        List<Integer> numList = new ArrayList<Integer>();

        numList.add(7);
        numList.add(77);
        numList.add(777);
        numList.add(7777);
        numList.add(77777);

        int sum = 0;
        for(int i=0; i<numList.size(); i++){
            sum+=numList.get(i);
        }
        System.out.println(sum);
        sum =0;

        for(int num : numList){
            sum+=num; //num.intValue(); 랩퍼클래스는 연산시 자동으로 기본형을 반환
        }
        System.out.println(sum);
        sum =1;

        //람다식은 중첩클래스로 정의된 타입으로 지역변수를 참조할 수 없다
        //하지만 java가 참조할 수 있도록 도와준다..
        //근데 도움을 어설프게 줘서 상수로 지역변수를 상수로 정의한경우만 참조해올수있음...
//
//        numList.forEach(s -> );

        //js 같은 생산성이 높은 언어들은  내부반복문을 사용한다
        //-> 자바에서도 내부반복문 도입..!

    }
}
