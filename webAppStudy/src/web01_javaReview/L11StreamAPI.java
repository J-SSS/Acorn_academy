package web01_javaReview;

import java.util.stream.Stream;

public class L11StreamAPI {
    public static void main(String[] args) {

        //Stream과 Stream API는 다른 것
        //InputStreamReader -> Stream : 입출력의 흐름

        //Arrays({1,2,3,10}).stream().forEach() : Stream API

        //Stream API : 이터레이터와 유사한 자료구조로 내부반복문이 정의되어있다.
        //자바는 Stream API를 이용해서 모든 자료구조를 통일된 반복문을 사용할 수 있도록 하는 것이 목표!!
        //{}, List, Map, Set 자료구조가 다 다른 방식으로 반복문을 사용해왔다...
        //=때문에 반복문을 재사용하는 것이 어려워졌다. 반복문의 특정코드를 함수로 변형하여 재사용하는것은 가능하지만.
        //=반복문 자체는 재사용하기 힘들다....
        // 내부반복문은 코드 전체를 함수로 재정의하기때문에, 재사용성이 높고 유지보수가 용이하다
        // 내부반복문에 이름정하고 메소드 체이닝으로 연결해서 재사용성과 가독성을 더 좋게 만들었다.

        // 자바에서 이런 내부반복문에 장점을 사용하기 위해서 Array와 collection의 모든 자료를 stream이라는
        // 이터레이터와 유사한 자료형태로 변환할 수 있도록 정의하고 stream의 필드로 내부함수를 정의했다.
        // 내부함수를 크게 3개자로 나누는데, 중간연산, 최종연산, 컬렉션연산으로 나누어 서로 다른 역할을 부여했다.
        // 특히 중간연산은 연산의 결과가 Stream으로, 중간연산을 연결함으로서 반복문을 중첩하는 효과를 갖는다.

        // 람다는 많이 씀.. 스트림은 선두적인 회사에서 많이 사용됨(약간 느림)

        // db mysql(경량:대체가능) > oracle(대형(은형) -> 대체불가능)

        /*
            Stream API 중간연산(중간연산은 메소드체이닝을 위해 무조건 Stream을 반환하고, 최종연산과 같이 사용해야한다.)

            - distinict : 중복을 제거
            - map(Function) : 스트림의 각 요소를 변형하기 위한 반복문(매개변수가 현재 요소고, 변환하는 것이 바뀌는 요소)

         */
        Stream.of(1,1,2,2,3,3,4,5).distinct().forEach((n)->{
            System.out.println(n);
        }); //중복값도 제거
        Stream.of("1","1","2","2","3","3","4","5").distinct().forEach((n)->{
            System.out.println(n);
        }); //자료형도 가능
        Stream.of(new String("1"),"1","2","2","3","3","4","5").distinct().forEach((n)->{
            System.out.println(n);
        }); //equals로 비교해주기때문에 자료형도 가능한거 맞음
        // 메서드 참조 : 컴파일러가 상상할 수 있는 만큼 생략할 수 있다.
////////////////////////////////////////////////////////////////////////////////

        Stream.of(new String("1"), "1", "2", "2", "3", "3", "4", "5")
                .distinct()
                .map(Integer::parseInt)//모든 요소를 정수로 전환
                .map(i ->i*i)
                .forEach((n) -> {
            System.out.println(n);
        });


    }
}
