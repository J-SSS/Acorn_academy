package first;


import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class L12SteamIntemediate {

    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        IntStream stream = Arrays.stream(intArr);
//        List<Integer> list = List.of(intArr); // 이런식으로 collection 변환해서 사용하지 않는 이유??
        // => 기본형을 요소로 사용할 수 없음...
        // => 기본형 스트림 : IntStream, LongStream, DoubleStream..(byte,short,float,boolean,char는 없음)

        //skip(long),limit(long) : 스트림을 잘라내는 연산
        //skip : 건너뛰는 연산 //limit : 길이만큼 잘라내는 연산
        //distinict() : 중복요소 제거(자료형도 포함)

        System.out.println("skip(3)");
        stream.skip(3).forEach(System.out::print);
        System.out.println();

        System.out.println("limit(5)");
        Arrays.stream(intArr).limit(5).forEach(System.out::print);
        System.out.println();

        System.out.println("skip(3).limit(5)");
        Arrays.stream(intArr).skip(3).limit(4).forEach(System.out::print);
        System.out.println();


        //distinct(), filter(Predicate (e)->Boolean)
        Integer[] intArr2 = {1, 2, 2, null, 3, 3, 4, null, 5, 6, null, 7, 7, 8, 9, 10};

        System.out.println("퀴즈");
        System.out.println(Arrays.stream(intArr2).distinct().filter(e -> e != null).reduce((e1, e2) -> {
            return e1 + e2;
        }));
        Arrays.stream(intArr2).distinct().filter(e -> e != null).reduce((e1, e2) -> {
            return e1 + e2;
        });
        System.out.println();

        //Optional : 결과가 null일 수 있다고 알려주는 타입

//        Optional


        //map(Function) : 요소를 다른 값으로 바꾸는 중간 연산
        //mapToInt(Int,Long,Double) : 요소를 기본형으로 바꾸고, 기본형 스트림을 반환하는 중간 연산
        //flatMapTo(...) : 몰라도 된다!!
        //IntStream, LongStream, DoubleStream등등 자료형만을 요소로 사용할 수 있는 컬렉션의 한계를 극복하기 위해 만들어짐
        //보통 기본형 스트림은 무엇을 위해 쓰이나??
        //=> 기본형(값) 스트림은 연산에 유용한 최종함수들을 제공(sum,average: reduce의 변형임)


        //기본형(값)을 정의하는 이유 :
        //수 boolean(0,1 1bit인데 byte크기임) char(유니코드 표 번호)
        //boolan에 필요한 데이터는 1bit이지만 자바의 주소체계가 바이트단위라서 1byte의 기본형으로 표현)

        //strArr2를 기본형 스트림으로 변환하기
        //js에서는 null을 0으로 보나, java에서는 아님.
        String[] strArr2 = {"1", "2", "2", null, "3", "3", "4", null, "5", "6", null, "7", "7", "8", "9", "10"};
//        List<Integer> strArr2ToInt = Arrays
//                .stream(strArr2)
//                .filter((e)->e!=null)
//                .map((e)->Integer.parseInt(e))
//                .collect(Collectors.toList());

//        System.out.println("퀴즈2 :" + strArr2ToInt);

        //기본형이 반환되는 값이 없을때 사용(OptionalInt,Long,Double)
        OptionalInt sum3 = Arrays.stream(strArr2).filter((e) -> e != null).mapToInt(Integer::parseInt) //매개변수를 함수가 실행하면서 사용할때 -> 컴파일러가 상상할 수 있을 만큼의 실행 = 매서드참조
                .reduce((i1, i2) -> {
                    return i1 + i2;
                });

        System.out.println(sum3);
        String[] strArr4 = {"1", "2", "2", null, "3", "3", "4", null, "5", "6", null, "7", "7", "8", "9", "10"};
        System.out.println("퀴즈3");
//                 Arrays.stream(strArr4)
//                .filter((e)->e!=null)
//                        .filter((e)->{e!=null)})
//                .mapToInt(Integer::parseInt)
//                        .forEach(e-> System.out.print(e));
//        System.out.println("퀴즈" + sum4);


        //자바는 객체지향 언어기때문에 함수를 매개변수로 사용 불가능
        //인터페이스를 매개변수로 사용하기 위해 바로 구현할 수 있도록 지원(이때 내부 클래스로 익명클래스가 생성됨)
        //추상클래스나 인터페이스는 객체가 될 수 없다. : 상식과 벗어나는 일!!
        // => 단, 추상클래스를 생성함과 동시에 구현하면 객체로 만들수있음 = 익명클래스가 객체가 됨


        //Array의 스트림 변환 : 무조건 Arrays.stream()으로만 변환 가능(암기!!)
        Stream<Integer> intArrStream2 = Arrays.stream(intArr2);
        List intList2 = intArrStream2.filter((e) -> e != null).collect(Collectors.toList()); //최종연산
        System.out.println("filter((n)->n!=null&&n>5)" + intList2);

//        List<Integer> listArr2 = new ArrayList<>();
//        for (Integer i : intArr2){
//            if (i != null){
//                listArr2.add(i);
//            }
//        }
//        System.out.println("ListArr2 : "+ listArr2);


        System.out.println("filter((n)->n!=null&&n>5)");

        Arrays.stream(intArr2).filter((n) -> n != null && n > 5).forEach(System.out::println);

        System.out.println("distinct()"); //null도 중복제거 가능!!
        Arrays.stream(intArr2).distinct().filter((n) -> n != null && n <= 3).forEach(System.out::println);


        //sorted() : 정렬한 Stream을 반환 (Comparator가 정의되어야 사용가능 )
        //아스키코드표상 대문자가 앞이라서 대문자 먼저 정렬됨

        String strArr[] = {"Car", "ZZ", "Cap", "zz", "ab", "Apple", "aa"};

        //1
        List<String> strArrSorted = Arrays.stream(strArr).sorted().collect(Collectors.toList());

        //2
        strArrSorted = Arrays.stream(strArr).sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList());

        //3
        strArrSorted = Arrays.stream(strArr).sorted(Comparator.comparing((s) -> ((String) s).length())).collect(Collectors.toList());

        System.out.println("sorted()" + strArrSorted);


        System.out.println("sorted()");
        Arrays.stream(strArr).sorted().forEach(System.out::println);
        System.out.println("sorted(String.CASE_INSENSITIVE_ORDER)");
        Arrays.stream(strArr).sorted(String.CASE_INSENSITIVE_ORDER).forEach(System.out::println);
        System.out.println("sorted().sorted(s.length)");
        Arrays.stream(strArr).sorted().sorted(Comparator.comparing((s) -> ((String) s).length())).forEach(System.out::println);
        System.out.println("map((n)->2*n)");
        //map() :stream의 값을 변환하는 함수
        Arrays.stream(intArr2).filter((n) -> n != null)
                //.peek(System.out::println)
                .distinct().map((n) -> (double) (2 * n)) //기존의 값을 다른 타입으로 변경 -> 변경된 스트림으로 반환됨
                .forEach(System.out::println);


    }
}