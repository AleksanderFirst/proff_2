package shop.dao;

import shop.DatabaseConnection;
import shop.entity.Client;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientDaoImpl implements DaoInterface<Long, Client> {

    @Override
    public void insert(Client client) {
        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement()) {

            String query = "SELECT * FROM client WHERE id=" + client.getId();
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.first()) {
                System.out.println("Client exist!");
                return;
            }
            query = String.format("INSERT INTO client(id, first_name, second_name, email) " +
                            "VALUES (%d, '%s', '%s', '%s')",
                    client.getId(), client.getFirstName(), client.getSecondName(), client.getEmail());


            statement.execute(query);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public Client select(long id) {
        Client client = new Client();
        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement()) {
            String query = "SELECT * FROM client WHERE id=" + id;
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                client.setId(resultSet.getLong("id"));
                client.setFirstName(resultSet.getString("first_name"));
                client.setSecondName(resultSet.getString("second_name"));
                client.setEmail(resultSet.getString("email"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return client;
    }


    @Override
    public void update(Client client) {
        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement()) {

            String query = "SELECT * FROM client WHERE id=" + client.getId();
            ResultSet resultSet = statement.executeQuery(query);
            if (!resultSet.first()) {
                System.out.println("Client doesn't exist!");
                return;
            }

            query = String.format("UPDATE client SET first_name='%s', second_name='%s', email='%s' WHERE id=%d",
                    client.getFirstName(), client.getSecondName(), client.getEmail(), client.getId());


            statement.execute(query);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    @Override
    public void delete(Long id) {
        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement()) {
            String query = "SELECT * FROM client WHERE id=" + id;
            ResultSet resultSet = statement.executeQuery(query);
            if (!resultSet.first()) {
                System.out.println("Client doesn't exist");
                return;
            }
            query = "DELETE FROM client WHERE id=" + id;
            statement.execute(query);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ClientDaoImpl clientDao = new ClientDaoImpl();
        Client client = new Client();
        client.setFirstName("Second");
        client.setSecondName("Client");
        client.setEmail("2@gmail.com");
        clientDao.insert(client);
    }

}
