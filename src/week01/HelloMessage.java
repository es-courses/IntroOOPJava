package week01;

public class HelloMessage {
    static void main() {
        int a = 10;
        double pi = 3.14;
        boolean b = true;
        char c = 'a';
        String str = "Hello";

        System.out.println("PI value is " + pi);

        if (a == 10 && c == 'a') {
            System.out.println("a is 10");
        }
        else if (a < 10) {
            System.out.println("a < 10");
        }
        else {
            System.out.println("a > 10");
        }
    }
}
