package shop.dao;

import shop.OracleConnection;
import shop.entity.Good;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by sigen on 22.07.15.
 */
public class GoodDaoImpl implements GeneralDao<Long, Good> {
    @Override
    public void delete(Good good) throws SQLException {
        //
    }

    @Override
    public void insert(Good good) throws SQLException {
        String name = good.getGoodName();
        String description = good.getDescription();
        Double price = good.getPrice();
        PreparedStatement ps = OracleConnection.getConnection().prepareStatement("INSERT into good VALUES(?,?,?,0)");
        ps.setString(1, name);
        ps.setString(2, description);
        ps.setDouble(3, price);
        ps.executeUpdate();
    }

    @Override
    public Good select(Long id) throws SQLException {
        PreparedStatement ps = OracleConnection.getConnection().prepareStatement("SELECT * FROM good WHERE id = ?");
        ps.setLong(1, id);
        ResultSet rs = ps.executeQuery();
        Good good = new Good();
        good.setId(id);
        good.setGoodName(rs.getString("good_name"));
        good.setQty(rs.getLong("qty"));
        good.setDescription(rs.getString("description"));
        good.setPrice(rs.getDouble("price"));
        return good;
    }

    @Override
    public void update(Good good) throws SQLException {
        Long qty = good.getQty();
        Long id = good.getId();
        PreparedStatement ps = OracleConnection.getConnection().prepareStatement("UPDATE good set qty= qty + ? where id = ?");
        ps.setLong(1, qty);
        ps.setLong(2, id);
    }
}
