package shop.dao;

import shop.OracleConnection;
import shop.entity.Client;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by sigen on 7/16/2015.
 */
public class ClientDaoImpl implements GeneralDao<Long,Client>{
    public void delete(Client client) throws SQLException{
        String firstName = client.getFitstName();
        String secondName = client.getSecondName();
        PreparedStatement ps = OracleConnection.getConnection().prepareStatement("SELECT * FROM client c, good_order o WHERE c.first_name = ? and c.second_name =? join on (c.id=o.client_id)");
        ps.setString(1, firstName);
        ps.setString(2, secondName);
        ResultSet rs = ps.executeQuery();
        if(rs.first()){
            System.out.println("This client has an order, can`t be deleted");
        } else {
            ps = OracleConnection.getConnection().prepareStatement("DELETE FROM client WHERE first_name = ? and secind_name = ?");
            ps.setString(1, firstName);
            ps.setString(2, secondName);
            ps.executeUpdate();
        }
    }

    public void insert(Client client) throws SQLException {
        String firstName = client.getFitstName();
        String secondName = client.getSecondName();
        String email = client.getEmail();
        PreparedStatement ps = OracleConnection.getConnection().prepareStatement("INSERT into Client VALUES ? ,? ,? ");
        ps.setString(1, firstName);
        ps.setString(2, secondName);
        ps.setString(3, email);
        ps.executeQuery();
    }

    public Client select(Long id) throws SQLException{
        PreparedStatement ps = OracleConnection.getConnection().prepareStatement("SELECT * from Client WHERE id = ?");
        ps.setLong(1, id);
        ResultSet rs = ps.executeQuery();
        Client resClient = new Client();
        resClient.setId(id);
        resClient.setFirstName(rs.getString(1));
        resClient.setSecondName(rs.getString(2));
        resClient.setEmail(rs.getString(3));
        return resClient;

    }

    public void update(Client client) {
        //
    }

}


