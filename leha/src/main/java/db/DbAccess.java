package db;


import java.math.BigDecimal;
import java.sql.*;

/**
 * Created by AVasilenko on 13.07.2015.
 */
public class DbAccess {
    private static String DB_URL = "jdbc:mysql://otrs.banktrust.com.ua:3306/mail";
    private static String USER = "root";
    private static String PASS = "BnHe5k";

    public DbAccess() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
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

    public void execSql(String sql)
    {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            for (int i=1; i<=rs.getMetaData().getColumnCount(); i++ ){
                System.out.print(rs.getMetaData().getColumnName(i)+"\t\t\t");
            }
                System.out.println();

            while (rs.next()) {
                for (int i=1; i<=rs.getMetaData().getColumnCount(); i++ )
                    System.out.print(rs.getString(i)+"\t\t");
                System.out.println();

                /*
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
                System.out.println();*/
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
        //System.out.println("Goodbye!");
    }
}
