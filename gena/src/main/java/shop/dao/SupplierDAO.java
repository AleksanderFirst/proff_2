package shop.dao;

import shop.OracleConnection;
import shop.entity.Supplier;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by sigen on 7/19/2015.
 */
public class SupplierDAO {
    public void insert(Supplier supplier) throws SQLException {
        String supplierName = supplier.getName();
        String supplierPhone = supplier.getPhone();
        PreparedStatement ps = OracleConnection.getConnection().prepareStatement("INSERT into Supplier VALUES ? ,? ,? ");
        ps.setString(1, supplierName);
        ps.setString(2, supplierPhone);
        ps.executeQuery();
    }

//    public void delete(Supplier supplier) throws SQLException{
//        int id = supplier.getId();
//        PreparedStatement ps = OracleConnection.getConnection().prepareStatement("DELETE from Supplier WHERE id = ?");
//        ps.setInt(1, id);
//        ps.executeQuery();
//    }

    public void update() throws SQLException{
        //?
    }

    public Supplier select(Supplier supplier) throws SQLException {
        int id = supplier.getId();
        PreparedStatement ps = OracleConnection.getConnection().prepareStatement("SELECT * from Supplier WHERE id = ?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        Supplier resSupplier = new Supplier();
        resSupplier.setId(supplier.getId());
        resSupplier.setName(rs.getString(1));
        resSupplier.setPhone(rs.getString(2));
        return resSupplier;
    }
}
