package shop.dao;

import shop.OracleConnection;
import shop.entity.Warehouse;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by sigen on 7/19/2015.
 */
public class WarehouseDAO {

public void insert(Warehouse warehouse) throws SQLException {
    Integer goodId = warehouse.getGoodId();
    Integer supplierId = warehouse.getSupllierId();
    Long qty = warehouse.getQty();
    PreparedStatement ps = OracleConnection.getConnection().prepareStatement("INSERT into Warehouse VALUES ? ,? ,? ");
    ps.setInt(1, goodId);
    ps.setInt(2, supplierId);
    ps.setLong(3, qty);
    ps.executeQuery();
}

    public void delete(Warehouse warehouse) throws SQLException{
        int id = warehouse.getId();
        PreparedStatement ps = OracleConnection.getConnection().prepareStatement("DELETE from Warehouse WHERE id = ?");
        ps.setInt(1, id);
        ps.executeQuery();
    }

    public void update() throws SQLException{
        //?
    }

    public Warehouse select(Warehouse warehouse) throws SQLException {
        int id = warehouse.getId();
        PreparedStatement ps = OracleConnection.getConnection().prepareStatement("SELECT * from Warehouse WHERE id = ?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        Warehouse resWarehouse = new Warehouse();
        resWarehouse.setId(warehouse.getId());
        resWarehouse.setGoodId(Integer.valueOf(rs.getString(1)));
        resWarehouse.setSupllierId(Integer.valueOf(rs.getString(2)));
        resWarehouse.setQty(Long.getLong(rs.getString(3)));
        return resWarehouse;
    }

}
