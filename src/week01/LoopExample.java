package week01;

public class LoopExample {

    public static void main() {
        System.out.println("While");
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        System.out.println("Do-While");
        do {
            System.out.println(i);
            i--;
        } while (i >= 0);

        System.out.println("For");
        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }
    }

}
