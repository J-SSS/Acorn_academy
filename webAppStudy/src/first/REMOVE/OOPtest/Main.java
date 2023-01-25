package first.REMOVE.OOPtest;

public class Main {
    public static void main(String[] args) {
       Test01 test01 = new Test01();
        System.out.println(test01.a);

        Test02 test02 = new Test02(test01);
        test02.t02();

        System.out.println(test01.a);

        System.out.println(test02.b);
        test01.t01();


    }
}
