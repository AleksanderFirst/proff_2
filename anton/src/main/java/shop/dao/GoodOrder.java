package shop.dao;

import shop.DatabaseAccess;
import shop.entity.Client;
import shop.entity.Good;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Антон on 18.07.2015.
 */
public class GoodOrder {
    public void select() {

    }

    public void insert(Client client, Good good, int quantity) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = new DatabaseAccess().getConnection();
            String sql = "insert into good_order(client_id,good_id,good_qty) values(" +
                    "(select id from client where first_name = ? and second_name = ?)," +
                    "(select id from good where good_name = ?)," +
                    "?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, client.getFirst_name());
            stmt.setString(2, client.getSecond_name());
            stmt.setString(3, good.getGood_name());
            stmt.setInt(4, quantity);
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
