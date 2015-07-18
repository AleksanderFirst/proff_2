package shop.dao;

import shop.DatabaseAccess;
import shop.entity.Client;

import java.sql.*;

/**
 * Created by Антон on 18.07.2015.
 */
public class ClientDao {

    public void select() {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = new DatabaseAccess().getConnection();
            stmt = conn.createStatement();
            String sql = "SELECT id FROM client";
            ResultSet rs = stmt.executeQuery(sql);
//            while (rs.next()) {
//                int id = rs.getInt("id");
//                String first_name = rs.getString("first_name");
//                String second_name = rs.getString("second_name");
//                System.out.println(id + " " + first_name + " " + second_name);
//            }
        } catch (SQLException e) {
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

    public void insert(Client client) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = new DatabaseAccess().getConnection();
            String sql = "insert into client(first_name,second_name,email) values(?,?,?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, client.getFirst_name());
            stmt.setString(2, client.getSecond_name());
            stmt.setString(3, client.getEmail());
            stmt.executeQuery();
        } catch (SQLException e) {
            System.out.println("Some problems with insert query.");
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
}
