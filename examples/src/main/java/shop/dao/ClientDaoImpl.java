package shop.dao;

import jdbc.JDBCTutorialUtilities;
import shop.ConnectionFactory;
import shop.dao.interfaces_dao.CrudGeneralDao;
import shop.entity.Client;
import shop.entity.Supplier;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by randriyanov on 19.07.15.
 */
public class ClientDaoImpl implements CrudGeneralDao<String, Client> {

    @Override
    public void delete(Client client) {

    }

    @Override
    public void update(Client client) {

    }

    @Override
    public void insert(Client client) {
        try (Connection connection = ConnectionFactory.getConnection();
        ) {
            try {
                connection.setAutoCommit(false);
                String sqlGood = "INSERT INTO good(good_name,description,price) VALUES (?,?,?)";
                PreparedStatement statement = connection.prepareStatement(sqlGood);
                statement.setString(1, client.getEmail());
                statement.setString(2, client.getFirstName());
                statement.setBigDecimal(3, new BigDecimal(1000.00));
                statement.addBatch();
                String sqlSupplier = "INSERT INTO supplier(supplier_name, phone)  VALUES (?,?)";
                statement.setString(1, "Test");
                statement.setString(2, "344543245");
                statement.addBatch();
                int[] columns = statement.executeBatch();
                for(int i : columns) {
                    System.out.println(i);
                }
                connection.commit();

            } catch (SQLException e) {
                connection.rollback();
                JDBCTutorialUtilities.printSQLException(e);
            }
        } catch (Exception e) {

        }

    }

    @Override
    public List<Client> select(String key) {
        try (Connection connection = ConnectionFactory.getConnection();
        ) {
            String sql = "SELECT * FROM client WHERE first_name=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, key);
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                //System.out.println(set.get);
            }
        } catch (SQLException e) {

        }
        return new ArrayList<>();
    }
}
