package first;

class A{ //A.java 문서를 만들기는 하지만 배포할 수 없다. public이 아니기 때문에...
    public void a(){
        System.out.println("A.a입니다..");
    }
}

class B extends A{
    public void b(){}

    @Override // 어노테이션 : 컴파일 시 동작하여 검사 및 자동세팅을 하는 역할.
    public void a() {
        super.a(); // 부모의 재원을 사용
        System.out.println("B.b로 재정의 합니다.");
    }
}

class C extends B{

    public void c(){}

//    pullic void c(int a){} // 오버로드 : 함수의 이름은 같은데 매개변수가 달라서(타입과 수) 다르게 동작함
//    public int c(){} // 반환타입이 달라지는 것으로는 작동하지 않음.


}

// 객체지향 문법의 상속이란? : 부모클래스의 재원을 사용하거나, 재정의하는 것(오버라이딩)


public class L01inheritance { //java 문서의 주인이면서 배포가능한 클래스다.

    public L01inheritance() {
        A a = new A(); // 내부클래스를 정의하는 이유!
    }

    class A {    } // 내부클래스(inner class) L01inheritance$A.class로 컴파일 된다.
                    // 부모클래스를 인스턴스로 생성해야 사용가능하다
                    // 자식클래스가 부모클래스의 필드를 제어할 수 있다.

    //main은 L01inheritance클래스 안에 있지만 실제로는 별개의 존재임 static이니까.
    //JVM의 구현이라고 생각하면 됨.
    public static void main(String[] args) {
        // public class : 임폴트 가능한 클래스, java 문서의 주인(발행되는)
        // L01Inherit.java를 컴파일하면 생기는 .class 문서는 몇개일까? = 3개
        // java 컴파일(JDK에 포함) : .java 문서를 .class 파일로 변환
        // JVM : class 파일을 플랫폼(OS)에 맞게 해석해서 실행하는 가상머신(자바는 플랫폼에 독립적이다.)

        L01inheritance.A a1 = new L01inheritance().new A();
        // 보통 이렇게는 사용하지 않고, 부모 내부에서 내부클래스를 생성해서 사용

        C c = new C();
        B b = c;
        first.A a = c;
        Object o = c;
        c = (C) o; //int i = (int)13.3; 같은 기본형의 형변환과는 원리가다르다.
        // 타입의 다형성 : 객체가 부모의 타입이 될 수 있는 것

        // 객체지향 문법에서 다형성은 무엇인가요?? : 상속 받은 부모의 재원을 사용하거나, 재정의(오버라이드) 하는 것.
        // 객체 재사용의 전략?? : 추상화, 모듈화, SOLID

        // [객체지향에서 다형성은 하나의 이름에 다양한 역할을 부여해서 코드 작성을 편리하게 하는 문법
        // 이중에 오버로드, 오버라읻, 타입의 다형성이 있다.]

        // 1. 오버로드는 함수의 이름은 하나인데, 매개변수를 다르게 지정해서 다른 역할이 부여된 함수
        // 2. 오버라이드는 부모의 메서드를 자식이 재정의 해서 자식 메서드가 호출되게 하는 것
        // =. 객체를 부모의 타입으로 참조할 수 있어서 변수의 타입을 복잡하게 정의할 필요가 없다.
        // =. ->> 캐스팅 형변환시 오류를 만들수있음. ->> 제네릭이 등장


//        Object iObj="13";
//        int i = (int)Iobj;

        // 다형성이란 프로그램 언어 각 요소들(상수, 변수, 식, 객체, 메소드 등)이
        // 다양한 자료형(type)에 속하는 것이 허가되는 성질을 가리킨다. - 위키피디아 중 -




        Thread t = new Thread(new Runnable() {


            @Override
            public void run() {
                System.out.println("안녕!");
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }
            }
        });
        t.start();







    }
}
