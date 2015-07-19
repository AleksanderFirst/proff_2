package shop.dao;

import shop.OracleConnection;
import shop.entity.Good;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by sigen on 7/19/2015.
 */
public class GoodDAO {
    public void insert(Good good) throws SQLException {
        String goodName = good.getGoodName();
        Double goodPrice = good.getPrice();
        String goodDescription = good.getDescription();
        PreparedStatement ps = OracleConnection.getConnection().prepareStatement("INSERT into Good VALUES ? ,? ,? ");
        ps.setString(1, goodName);
        ps.setDouble(2, goodPrice);
        ps.setString(3, goodDescription);
        ps.executeQuery();
    }

//    public void delete(Good good) throws SQLException{
//        int id = good.getId();
//        PreparedStatement ps = OracleConnection.getConnection().prepareStatement("DELETE from Good WHERE id = ?");
//        ps.setInt(1, id);
//        ps.executeQuery();
//    }

    public void update() throws SQLException{
        //?
    }

    public Good select(Good good) throws SQLException {
        int id = good.getId();
        PreparedStatement ps = OracleConnection.getConnection().prepareStatement("SELECT * from Good WHERE id = ?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        Good resGood = new Good();
        resGood.setId(good.getId());
        resGood.setGoodName(rs.getString(1));
        resGood.setPrice(Double.valueOf(rs.getString(2)));
        resGood.setDescription(rs.getString(3));
        return resGood;
    }
}
