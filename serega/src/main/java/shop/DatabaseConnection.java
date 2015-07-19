package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static Connection connection = null;
    private static String DB_URL = "jdbc:mysql://sql4.freemysqlhosting.net/sql484252";
    private static String USER = "sql484252";
    private static String PASS = "tR3!lW4%";

    protected DatabaseConnection() {
    }

    public static Connection getConnection() {
        if (connection == null) try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
