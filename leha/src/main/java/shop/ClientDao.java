package shop;

import java.sql.*;

/**
 * Created by oleksii on 18.07.2015.
 */
public class ClientDao {
    private static String DB_URL = "jdbc:mysql://localhost:3306/shop";
    private static String USER = "root";
    private static String PASS = "";

    public ClientDao() {
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

    public void select(Client client){
        //Check for null in first_name and second_name
        if (client.getFirstName() == null || client.getLastName() == null)
        {
            System.out.println("Client first name or last name is NULL!");
            return;
        }

        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = getConnection();
            String sql = "SELECT c.id, c.email FROM client c WHERE c.first_name = ? AND c.second_name = ?";

            stmt = conn.prepareStatement(sql);
            stmt.setString(1, client.getFirstName());
            stmt.setString(2, client.getLastName());

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                //Retrieve by column name
                client.setId(rs.getInt("id"));
                client.setEmail(rs.getString("email"));
            }

        } catch (SQLException se) {
            System.out.println(se.getMessage());
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

    public void insert(Client client) {
        //Check for null in first_name and second_name
        if (client.getFirstName() == null || client.getLastName() == null || client.getEmail() == null) {
            System.out.println("Client first name, last name or email is NULL!");
            return;
        }

        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = getConnection();
            String sql = "INSERT INTO client(first_name, second_name, email) VALUES (?,?,?)";

            stmt = conn.prepareStatement(sql);
            stmt.setString(1, client.getFirstName());
            stmt.setString(2, client.getLastName());
            stmt.setString(3, client.getEmail());

            stmt.executeUpdate();

            sql = "SELECT c.id FROM client c WHERE c.first_name = ? AND c.second_name = ? AND c.email = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, client.getFirstName());
            stmt.setString(2, client.getLastName());
            stmt.setString(3, client.getEmail());

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                //Retrieve by column name
                client.setId(rs.getInt("id"));
            }

        } catch (SQLException se) {
            System.out.println(se.getMessage());
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
    }

    public void delete(Client client)
    {
        //Check for null in first_name and second_name
        if (client.getFirstName() == null || client.getLastName() == null)
        {
            System.out.println("Client first name, last name or email is NULL!");
            return;
        }

        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = getConnection();
            String sql = "DELETE t FROM client t WHERE t.first_name = ? and t.second_name = ?";

            stmt = conn.prepareStatement(sql);
            stmt.setString(1, client.getFirstName());
            stmt.setString(2, client.getLastName());

            stmt.executeUpdate();

            client.setId(0);
            client.setFirstName(null);
            client.setLastName(null);
            client.setEmail(null);

        } catch (SQLException se) {
            System.out.println(se.getMessage());
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

}
