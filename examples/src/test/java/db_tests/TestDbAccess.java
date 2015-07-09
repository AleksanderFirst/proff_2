package db_tests;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.sql.*;

/**
 * Created by randriyanov on 09.07.15.
 */
public class TestDbAccess {
    private static String DB_URL = "jdbc:mysql://localhost/mydb";
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
    public void readEmployees() {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            String sql = "SELECT id,name_employee, second_name,age,salary FROM employee";
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println(rs.getClass());
            //STEP 5: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                int id = rs.getShort("id");
                String nameEmployee = rs.getString("name_employee");
                String secondName = rs.getString("second_name");
                BigDecimal salary = rs.getBigDecimal("salary");
                short age = rs.getShort("age");
                //Display values
                System.out.print("ID: " + id);
                System.out.print(", Name: " + nameEmployee);
                System.out.print(", SecondName: " + secondName);
                System.out.print(", Salary " + salary);
                System.out.print(", Age " + age);
                System.out.println();
            }
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
