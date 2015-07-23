package shop.dao;

import shop.OracleConnection;
import shop.entity.Good;
import shop.entity.Warehouse;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by sigen on 7/19/2015.
 */
public class WarehouseDaoImpl implements GeneralDao<Long,Warehouse>{

public void insert(Warehouse warehouse) throws SQLException {
    Long goodId = warehouse.getGoodId();
    Long supplierId = warehouse.getSupllierId();
    Long qty = warehouse.getQty();
    PreparedStatement ps = OracleConnection.getConnection().prepareStatement("INSERT into Warehouse VALUES ? ,? ,? ");
    ps.setLong(1, goodId);
    ps.setLong(2, supplierId);
    ps.setLong(3, qty);
    Good good = new Good();
    good.setId(goodId);
    good.setQty(qty);
    new GoodDaoImpl().update(good);
    ps.executeQuery();
}

    public Warehouse select(Long id) throws SQLException {
        PreparedStatement ps = OracleConnection.getConnection().prepareStatement("SELECT * from Warehouse WHERE id = ?");
        ps.setLong(1, id);
        ResultSet rs = ps.executeQuery();
        Warehouse resWarehouse = new Warehouse();
        resWarehouse.setId(id);
        resWarehouse.setGoodId(Long.valueOf(rs.getString(1)));
        resWarehouse.setSupllierId(Long.valueOf(rs.getString(2)));
        resWarehouse.setQty(Long.getLong(rs.getString(3)));
        return resWarehouse;

    }

    public void update(Warehouse warehouse) throws SQLException {

    }

    public void delete(Warehouse warehouse) throws SQLException{
//        Long id = warehouse.getId();
//        PreparedStatement ps = OracleConnection.getConnection().prepareStatement("DELETE from Warehouse WHERE id = ?");
//        ps.setLong(1, id);
//        ps.executeQuery();
    }

}
