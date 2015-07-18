package shop.dao;

import shop.DatabaseAccess;
import shop.entity.Good;
import shop.entity.Supplier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Антон on 18.07.2015.
 */
public class SupplierDao {

    public void select() {

    }

    public void insert(Supplier supplier) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = new DatabaseAccess().getConnection();
            String sql = "insert into supplier(supplier_name,phone) values(?,?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, supplier.getSupplier_name());
            stmt.setString(2, supplier.getPhone());
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
