package week01;

import java.util.Scanner;

public class ReadUserInput {
    public static void main(String[] args) {
        String name;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = in.nextLine();

        System.out.println("Hello " + name);
    }
}
