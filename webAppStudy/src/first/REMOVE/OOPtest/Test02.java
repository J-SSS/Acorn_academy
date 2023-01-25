package first.REMOVE.OOPtest;

public class Test02 {

    Test01 test01;

    public Test02(Test01 test01) {
        this.test01 = test01;
    }

    int b  = 20;

    void t02 (){
        test01.a = 5;
        System.out.println(test01.a);
    }
}
