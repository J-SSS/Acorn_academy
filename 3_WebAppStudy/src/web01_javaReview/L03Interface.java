package web01_javaReview;
interface InterTest1{
    void a();
}

@FunctionalInterface //추상메서드가 오직 한 개 있는 인터페이스에서 사용가능
    //람다식으로 구현을 대신할 수 있다. 익명클래스 생성이 안된다..!
interface InterTest2{
    void a();
}


class InterTestImpl implements InterTest1,InterTest2{

    @Override
    public void a() {

    }
}

public class L03Interface {
    public static void main(String[] args) {
        // 인터페이스 : 아주 추상화된(바디가없음) 설계도 (이렇게 이렇게 하세요...) ???
        // 설계도를 추상화하는 이유? : 모든 부분이 구체적이라면 파악하기 어렵다.
        // 추상화된 설계도는 재사용하기 용이하다. => 유지보수에 용이하다.
        //

        InterTestImpl interTest = new InterTestImpl();

        // 인터페이스는 객체로 생성할 수 없으나, 생성과 동시에 구현하는 경우엔 가능
        // 별개의 클래스를 만들어서 추상메서드를 구현하는 과정하는 생략해도 jvm이 자동으로 익명클래스를 만듦.


        // JVM이 하는 일 : L03Interface의 내부클래스로 1을 생성(익명 클래스)
        //-----------------------------------------------------------
        // class 1 implements InterTest1{
        //        @Override
        //        public void a() {
        //        }ㄴ
        //      }
        //-----------------------------------------------------------

        InterTest1 interTest1 = new InterTest1() {
            @Override
            public void a() {

            }
        };
        //람다식 (문법적 설탕 : 문법만 존재하고 실존하지 않는다.)
        //추상메서드가 1개 있는 인터페이스에 @FunctionalInterface를 적어주면 람다식으로 구현가능
        InterTest2 interTest2=()->{}; //a함수
    }}

