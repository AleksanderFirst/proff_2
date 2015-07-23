package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {

    private static String URL = "jdbc:mysql://localhost:3306/shop";
    private static String USERNAME = "root";
    private static String PASSWORD = "root";

        public static Connection getConnection() {
            Connection connection = null;
            try {
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } catch (SQLException e) {
                System.out.println("ERROR: Connection failed");
            }
            return connection;
        }
    }
