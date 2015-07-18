package shop.dao;

import shop.DatabaseAccess;
import shop.entity.Good;

import java.sql.*;

/**
 * Created by Антон on 18.07.2015.
 */
public class GoodDao {

    public void select() {

    }

    public void insert(Good good) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = new DatabaseAccess().getConnection();
            String sql = "insert into good(good_name,description,price) values(?,?,?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, good.getGood_name());
            stmt.setString(2, good.getDescription());
            stmt.setBigDecimal(3, good.getPrice());
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
