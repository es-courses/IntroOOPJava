package week02;

public class Array2D {
    public static void main() {
        int [][] data = new int[5][3];
        int [][] values;

        values = data;

        values[0][0] = 11;

        System.out.println(data[0][0]);

        data = new int[3][4];
        System.out.println(data[0][0]);
        System.out.println(values[0][0]);

        values = data;
    }
}
