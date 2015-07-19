package shop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by sigen on 5/21/2015.
 */
public class OracleConnection {


    public static Connection getConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (Exception e){
            System.out.println("ouch");
        }
        Connection connection = null;

        try {

            connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr",
                    "oracle");

        } catch (SQLException e) {

            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();

        }
        return connection;

    }
}
