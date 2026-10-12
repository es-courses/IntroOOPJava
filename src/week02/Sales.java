package week02;

public class Sales {
    public static void main() {

        /*
            Sales array.
            First column is the year,
            and next 4 columns, sales per quarter
        */
        int [][] sales = new int[][]{
                {2021, 3, 2, 4, 4},
                {2022, 2, 3, 3, 1},
                {2023, 2, 2, 2, 4},
                {2024, 2, 1, 1, 1},
                {2025, 1, 3, 4, 4}
        };

        System.out.println("YEAR Avg-Sales");
        System.out.println("==============");
        // Loop for each row
        for(int [] row : sales) {
            // Get first value as year
            int year = row[0];

            // Add next 4 values into total
            int total = row[1]+row[2]+row[3]+row[4];

            // Divide total by 4 as average
            double average = total/4.0;

            // Print year and average
            System.out.println(year + " " + average);
        }
    }
}
