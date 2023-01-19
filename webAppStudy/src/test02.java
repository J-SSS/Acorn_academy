import java.sql.SQLOutput;
import java.util.SortedMap;

class SubCounter{
    int sOne =22;
    Counter counter;

    void set(){
        Counter.one = 33;
        System.out.println(Counter.one);
    }

}

class Counter{
   static int one = 1;

    public Counter(){
        System.out.println("하이");
        System.out.println(one);

        SubCounter subCounter = new SubCounter();
        System.out.println(subCounter.sOne);

        subCounter.set();
        System.out.println(one);

    }
}



public class test02 {
    public static void main(String[] args) {

    new Counter();



    }
}
