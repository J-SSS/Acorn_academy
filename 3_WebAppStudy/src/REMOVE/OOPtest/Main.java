package REMOVE.OOPtest;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Main  {
    public static void main(String[] args) throws FileNotFoundException {
        OutputStream oo = new OutputStream() {
            @Override
            public void write(int b) throws IOException {

            }
        };
    Pt pt = new Pt(oo);
    pt.ln();

        System.out.println(Pt.class);

        PrintStream ppp = new PrintStream(oo);
//        System.out.println(ppp.class);

    }
}
