package first;

public class L06Casting {
    public static void main(String[] args) {

        byte b = 127; //0이 있어서 128에서 하나 빠짐
        System.out.println(b);
        System.out.println(Byte.MAX_VALUE);
        // b=128; //컴파일오류(해당 타입은 byte보다 큰 값을 참조할 수 없다.)
        b=(byte) 128; //기본형은 수를 값으로 저장하기 때문에 더 큰수를 더 작은 타입이 참조할 수 없다.
        System.out.println(b); //loss of data(값의 손실이 발생함)
        //byte < short < int < long간의 형변환

        long l = 2147483648L; //컴파일오류
        //수를 리터럴하게 선언하면 무조건 int가 정의된다
        //수 끝에 l을 붙여서 리터럴하게 선언해야 long이 정의된다.


        //왜 실수를 리터럴하게 선언하면 float가 아니라 double인가?
        float f=13.3f;
        double d ;
        d = 1.7976931348623157E308;
        System.out.println(d);
        System.out.println(Double.MAX_VALUE); //E308 = 0이 308개 붙어있음
        // 실수는 참조할 수 있는 수보다 큰 수를 무한대라 한다.

        //정수가 -> 실수 : 실수의 가수부가 정수로 정의하고 가수부로 표현할 수 있는 수보다 크면 지수부가 정의된다.(x)
        //정수가 -> 실수 : 해당 정수를 지수표기법(부동소수점)으로 변경하고 가수가 표현할 수 있는 수만 가수부에 정의
        //2147483647 -> 2.147483647 지수부에 9, 가수가 21474(대충)를 저장
        int i=Integer.MAX_VALUE;
       f = 1.7976931348623157E30F;
        System.out.println(f);
        System.out.println(f+1);


        //실수에서 정수로
        d = 12345678901234567890.0;
        System.out.println(d);
        i = (int) d;
        System.out.println("(큰)실수를 정수로 변환" + i);
    }
}
