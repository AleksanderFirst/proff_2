package shop.dao;

import shop.OracleConnection;
import shop.entity.Order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by sigen on 7/19/2015.
 */
public class OrderDAO {
    Connection connection = OracleConnection.getConnection();
    public void insert(Order order) throws SQLException {
        Integer goodId = order.getGood_id();
        Integer clientId = order.getClient_id();
        Integer qty = order.getQty();
        PreparedStatement ps = connection.prepareStatement("INSERT into good_order VALUES ? ,?, ? ");
        ps.setInt(1, clientId);
        ps.setInt(2, goodId);
        ps.setInt(3, qty);
        ps.executeQuery();
    }

    public void delete(Order order) throws SQLException {
        int id = order.getId();
        PreparedStatement ps = connection.prepareStatement("DELETE from good_order WHERE id = ?");
        ps.setInt(1, id);
        ps.executeQuery();
    }

    public void update() throws SQLException {
        //?
    }

    public Order select(Order order) throws SQLException {
        int id = order.getId();
        PreparedStatement ps = connection.prepareStatement("SELECT * from good_order WHERE id = ?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        Order resOrder = new Order();
        resOrder.setId(order.getId());
        resOrder.setClient_id(Integer.valueOf(rs.getString(1)));
        resOrder.setGood_id(Integer.valueOf(rs.getString(2)));
        resOrder.setQty(Integer.valueOf(rs.getString(3)));
        return resOrder;
    }
}
