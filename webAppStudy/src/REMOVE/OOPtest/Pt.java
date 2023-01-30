package REMOVE.OOPtest;

import java.io.OutputStream;
import java.io.PrintStream;

public class Pt extends PrintStream{
    public Pt(OutputStream out) {
        super(out);
    }

    void ln(){
        System.out.println(Pt.class);
        System.out.println(getClass());
        System.out.println(PrintStream.class);
//        System.out.println(w);


    };

}
