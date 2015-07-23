package shop.dao;

import shop.DBconnection;
import shop.entity.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientDAO {
    private final static String INSERT_NEW = "INSERT INTO client (first_name, second_name, email) VALUES (?, ?, ?)";
    private final static String SELECT_ALL = "SELECT * FROM client";

    public static void insert(Client client) throws SQLException {
        try {
            Connection connection = DBconnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(INSERT_NEW);
            statement.setString(1, client.getFirstName());
            statement.setString(2, client.getSecondName());
            statement.setString(3, client.getEmail());
            statement.execute();
        } catch (SQLException e) {} }

    public static void deleteByFirstAndSecondNames(Client client) throws SQLException {
        String DELETE_BY_FIRST_AND_SECOND_NAMES = "DELETE FROM client WHERE first_name='" + client.getFirstName() + "'" + " AND " +
                                                                           "second_name='" + client.getSecondName() + "'";
        Connection connection = DBconnection.getConnection();
        PreparedStatement statement = connection.prepareStatement(DELETE_BY_FIRST_AND_SECOND_NAMES);
        statement.execute();
    }

    public static List selectAll() throws SQLException {
        Connection connection = DBconnection.getConnection();
        PreparedStatement statement = connection.prepareStatement(SELECT_ALL);
        ResultSet result = statement.executeQuery();
        List<Client> clients = new ArrayList<>();
        while (result.next()){
            Client client = new Client();
            client.setId(result.getInt(1));
            client.setFirstName(result.getString(2));
            client.setSecondName(result.getString(3));
            client.setEmail(result.getString(4));
            clients.add(client);
        }
        return clients;
    }

    public static void main(String[] args) throws SQLException {
        //Client eugene = new Client("Denis", "Bidnenko", "deyneko55@gmail.com");
        //ClientDAO.insert(eugene);
        ClientDAO.selectAll();

    }
}
