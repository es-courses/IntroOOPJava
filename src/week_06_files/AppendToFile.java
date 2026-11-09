package week_06_files;

import java.io.File;
import java.io.FileWriter;

public class AppendToFile {
    public static void main(String[] args) {
        try {
            File file = new File("data.txt");


            System.out.println("Append into the file");
            FileWriter writer = new FileWriter(file, true);
            writer.write("Appending\n");
            writer.write("I'm writing more data into the file ...\n");
            writer.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
