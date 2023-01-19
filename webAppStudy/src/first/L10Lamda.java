package first;

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

        BinaryOperator<Integer> operator = ( i, i2)->i+i2;
        System.out.println("130+50=" + operator.apply(130,50));

        Predicate<String> intPredicate = (s) -> {
            boolean p = false;
            try {
                int i = Integer.parseInt(s);
                p = true;
            } catch (Exception e){};

            return p;
        };


        //Function : 매개변수와 반환값이 있고 타입이 다른 것
        //Consumer : 매개변수만 존재하는 함수
        //Supplier : 리턴만 존재하는 함수 (블럭이 없으면 return 을 자동으로 한다.)
        //BinaryOperator : 매개변수가 2개고 반환하는 값이 있는 함수로 2개의 값을 연산하기 위해 재정의

    }
}
