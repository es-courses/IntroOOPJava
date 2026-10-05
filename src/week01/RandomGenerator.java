package week01;

import java.util.Random;

public class RandomGenerator {
    public static void main() {
        Random rand = new Random();
        int a = rand.nextInt(0, 1000);
        System.out.println(a);
    }
}
