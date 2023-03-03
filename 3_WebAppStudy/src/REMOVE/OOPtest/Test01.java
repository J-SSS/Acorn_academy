package REMOVE.OOPtest;

public class Test01 {

    Test02 test02 = new Test02(this);

    int a = 10;

    void t01 (){
        test02.b = 15;
        System.out.println(test02.b);
    }

}
