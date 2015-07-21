package shop.dao;

import com.sun.org.apache.bcel.internal.generic.Select;
import shop.OracleConnection;
import shop.entity.Client;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by sigen on 7/16/2015.
 */
public class ClientDaoImpl implements GeneralDao<Long,Client>{
    public void delete(Client client) {
        //
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

    public Client select(Long k) {
        return null;
    }

    public void update(Client client) {

    }

//    public void delete(Client client) throws SQLException{
//        int id = client.getId();
//        PreparedStatement ps = OracleConnection.getConnection().prepareStatement("DELETE from Client WHERE id = ?");
//        ps.setInt(1, id);
//        ps.executeQuery();
//    }


    public Client select(Client client) throws SQLException {
        Long id = client.getId();
        PreparedStatement ps = OracleConnection.getConnection().prepareStatement("SELECT * from Client WHERE id = ?");
        ps.setLong(1, id);
        ResultSet rs = ps.executeQuery();
        Client resClient = new Client();
        resClient.setId(client.getId());
        resClient.setFirstName(rs.getString(1));
        resClient.setSecondName(rs.getString(2));
        resClient.setEmail(rs.getString(3));
        return client;
    }
}


