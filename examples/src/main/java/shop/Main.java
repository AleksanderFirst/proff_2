package shop;

import shop.dao.ClientDaoImpl;
import shop.dao.GoodDaoImpl;
import shop.dao.interfaces_dao.CrudGeneralDao;

/**
 * Created by randriyanov on 19.07.15.
 */
public class Main {
    public static void main(String[] args) {
        CrudGeneralDao dao = new ClientDaoImpl();
        dao = new GoodDaoImpl();
    }
}
