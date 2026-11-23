package week08_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductStockModifier {
    public static void main(String[] args) {
        try {
            // Connect to the DB
            String url = "jdbc:mysql://localhost:3306/mystore";
            String user = "test";
            String password = "test";
            Connection conn = DriverManager.getConnection(url, user, password);

            // Ask user for a new product
            Scanner input = new Scanner(System.in);
            System.out.print("Enter product id: ");
            int id = input.nextInt();
            System.out.print("Enter product new stock: ");
            int stock = input.nextInt();

            // Save product in DB
            String query = "UPDATE products SET stock=?  WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, stock);
            ps.setInt(2, id);
            ps.executeUpdate();

            System.out.println("DONE");
        }
        catch (SQLException se) {
            System.out.println(se.getMessage());
        }
    }
}
