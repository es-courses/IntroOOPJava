package week02;

import java.util.Scanner;

public class Decimal2Binary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value;

        System.out.print("Give a number: ");
        value = in.nextInt();

        int temp = value;
        String binary = "";

        while (temp > 0) {
            int rem = temp % 2;
            binary = rem + binary;
            temp = temp / 2;
        }

        System.out.println(binary);
    }
}
