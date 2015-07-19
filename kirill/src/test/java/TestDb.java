import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.sql.*;

public class TestDb {
    private static String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static String USER = "system";
    private static String PASS = "system";

    @Before
    public void registerDriver() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void readEmployees() {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            String sql = "SELECT EmployeeID,EmployeeName, secondname, salary,company FROM employee";
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println(rs.getClass());
            while (rs.next()) {
                int id = rs.getShort("EmployeeID");
                String nameEmployee = rs.getString("EmployeeName");
                String secondName = rs.getString("secondname");
                BigDecimal salary = rs.getBigDecimal("salary");
                String company = rs.getString("company");
                System.out.print("ID: " + id);
                System.out.print(", Name: " + nameEmployee);
                System.out.print(", SecondName: " + secondName);
                System.out.print(", Salary " + salary);
                System.out.print(", company " + company);
                System.out.println();
            }
        } catch (SQLException se) {
            for (Throwable t : se.getNextException()) {
                t.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
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

