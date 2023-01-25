package first.REMOVE.OOPtest;

interface LamdaTest{
    void run();
}


public class blog {
    public static void main(String[] args) {
        LamdaTest lamdaTest1 = new LamdaTest() {
            @Override
            public void run() {
                System.out.println("익명객체");
            }
        };

        LamdaTest lamdaTest2 = () -> {
            System.out.println("객체인가?");
        };

        lamdaTest1.run();
        lamdaTest2.run();

        new Thread(()->{
            System.out.println("쓰레드");
        }).start();

//        Object obj = ()->{
//            System.out.println("쓰레드");
//        }

    }
}
