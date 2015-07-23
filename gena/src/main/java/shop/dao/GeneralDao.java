package shop.dao;

import shop.entity.AbstractEntity;

import java.sql.SQLException;

/**
 * Created by sigen on 7/19/2015.
 */
public interface GeneralDao<Key, T extends AbstractEntity> {
    void delete(T t) throws SQLException;
    void insert(T t) throws SQLException;
    T select(Key k) throws SQLException;
    void update (T t) throws SQLException;
}
