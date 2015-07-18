package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Before;
import org.junit.Test;

public class TestDbAccess {
    private static String DB_URL = "jdbc:mysql://localhost/shop";
    private static String USER = "root";
    private static String PASS = "root";

    @Before
    public void registerDriver() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void updateWarehouse() {
        Connection conn = null;
        Statement stmt = null;
        try {
          //String supplierName = "test";
         // String goodName = "test_good";
            conn = getConnection();
            stmt = conn.createStatement();
          //String idSupplier = "SELECT id from good WHERE good_name='test_good'";
         // String idGood ="SELECT id from supplier WHERE supplier_name=" + goodName;
            String src = "INSERT INTO good(good_name,description,price) VALUES('test_good2','simple good2', 1500.00)";
            stmt.execute(src);
           /* ResultSet rsSupplier = stmt.executeQuery(idSupplier);
            while (rsSupplier.next()) {
                //Retrieve by column name
                int idSup = rsSupplier.getShort("id");;
                System.out.println(idSup);
            }*/
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
        System.out.println("Goodbye!");
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