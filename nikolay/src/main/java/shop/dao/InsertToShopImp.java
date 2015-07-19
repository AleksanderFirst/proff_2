package shop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import shop.domain.InsertToShop;

public class InsertToShopImp {
	    private static String DB_URL = "jdbc:mysql://localhost/shop";
	    private static String USER = "root";
	    private static String PASS = "root";
	    
	    public void insertToShopManager(InsertToShop insert) {
	    Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            String src = "INSERT INTO " + insert.getColunms() + "VALUES" + insert.toInsert();
            stmt.execute(src);
        } catch (SQLException se) {
            for (Throwable t : se.getNextException()) {
                t.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            System.out.println("ERROR: Unable to Connect to Database.");
        }
        return connection;
    }
}
