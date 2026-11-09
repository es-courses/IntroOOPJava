package week_06_files;

import java.io.*;
import java.util.Scanner;

public class FileExample {

    public static void main(String[] args) {
        try {
            File file = new File("data.txt");
            if (file.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }

            System.out.println("Write into the file");
            FileWriter writer = new FileWriter(file);
            writer.write("Hello World\n");
            writer.write("I'm writing into the file ...\n");
            writer.close();

            System.out.println("Reading from the file");
            Scanner input = new Scanner(file);
            while(input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }

            System.out.println("Reading from the file using BufferedReader");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException ioe) {
            System.out.println("Input-Output error");
        }
    }

}
