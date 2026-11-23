package week08_database;

import java.sql.*;
import java.util.Scanner;

public class ProductAdder {
    public static void main(String[] args) {
        try {
            // Connect to the DB
            String url = "jdbc:mysql://localhost:3306/mystore";
            String user = "test";
            String password = "test";
            Connection conn = DriverManager.getConnection(url, user, password);

            // Ask user for a new product
            Scanner input = new Scanner(System.in);
            System.out.print("Enter product name: ");
            String name = input.nextLine();
            System.out.print("Enter product price: ");
            double price = input.nextDouble();
            System.out.print("Enter product stock: ");
            int stock = input.nextInt();

            // Save product in DB
            String query = "INSERT INTO products" +
                    "(name, price, stock) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setDouble(2, price);
            ps.setInt(3, stock);
            ps.executeUpdate();

            System.out.println("DONE");
        }
        catch (SQLException se) {
            System.out.println(se.getMessage());
        }
    }
}
