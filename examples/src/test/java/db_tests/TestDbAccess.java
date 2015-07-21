package db_tests;

import org.junit.Before;
import org.junit.Test;
import shop.dao.ClientDaoImpl;
import shop.dao.interfaces_dao.CrudGeneralDao;
import shop.entity.Client;

import java.math.BigDecimal;
import java.sql.*;

/**
 * Created by randriyanov on 09.07.15.
 */
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
            ResultSetMetaData metaData = rs.getMetaData();
            System.out.println(metaData.getColumnCount());
            System.out.println(metaData.getColumnClassName(1));
            System.out.println(metaData.getColumnLabel(1));
            System.out.println(metaData.getColumnName(1));
            System.out.println(metaData.getColumnType(1));
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

    @Test
    public void updateWarehouse() {
        Connection conn = null;
        Statement stmt = null;
        try {
            String supplierName = "test";
            String goodName = "test_good";
            conn = getConnection();
            stmt = conn.createStatement();
            String idSupplier = "SELECT id from good WHERE good_name='test_good'";
            String idGood ="SELECT id from supplier WHERE supplier_name=" + goodName;
            ResultSet rsSupplier = stmt.executeQuery(idSupplier);
            while (rsSupplier.next()) {
                //Retrieve by column name
                int idSup = rsSupplier.getShort("id");;
                System.out.println(idSup);
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

    @Test
    public void testInsertClient() throws Exception {
        CrudGeneralDao<String, Client> dao = new ClientDaoImpl();
        Client client = new Client();
        client.setSecondName("Ivan");
        client.setEmail("Ivan@com.ua");
        client.setFirstName("1=1");
        dao.insert(client);
        dao.select("1 OR 1=1");
    }
}
