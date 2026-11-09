package week_06_files;

import java.util.Scanner;

public class ExplainStatic {
    public static int a;
    public int b;

    public ExplainStatic() {
    }

    public static void  main(String args[]) {



        ExplainStatic es1 =  new ExplainStatic();
        ExplainStatic es2 = new ExplainStatic();

        es1.a = 10;
        es1.b = 20;

        es2.a = 30;
        es2.b = 40;

        ExplainStatic.a = 100;

        System.out.println(es1.a + ", " + es1.b);
        System.out.println(es2.a + ", " + es2.b);

        System.out.println(Math.sqrt(81));
    }
}
