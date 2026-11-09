package week_06_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CsvExample {
    public static void main(String[] args) {
        try {
            String [] labels = {"n/a", "n/a", "n/a"};
            String [] values;
            File studentFile = new File("data.csv");
            Scanner input = new Scanner(studentFile);
            int counter = 0;
            while(input.hasNextLine()) {
                String line = input.nextLine();
                if(counter == 0){
                    labels = line.split(",");
                }
                else {
                    values = line.split(",");
                    for(int i = 0; i < values.length; i++){
                        System.out.println(labels[i] + ": " + values[i]);
                    }
                }
                counter++;
            }
        }
        catch (FileNotFoundException fnfe) {
            System.out.println("File not found");
        }
    }
}
