package week08_database;

import java.sql.*;

public class ProductReader {
    public static void main(String[] args) {
        try {
            // Connect to the DB
            String url = "jdbc:mysql://localhost:3306/mystore";
            String user = "test";
            String password = "test";
            Connection conn = DriverManager.getConnection(url, user, password);

            // Execute a SELECT query
            String query = "SELECT * FROM products";
            Statement st =  conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            // Display the results of SELECT
            while(rs.next()) {
                System.out.println(rs.getString("name"));
            }

            System.out.println("DONE");
        }
        catch (SQLException se) {
            System.out.println(se.getMessage());
        }
    }
}
