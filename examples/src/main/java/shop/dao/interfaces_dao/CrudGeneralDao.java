package shop.dao.interfaces_dao;

import shop.entity.SuperEntity;

import java.util.List;

/**
 * Created by randriyanov on 19.07.15.
 */
public interface CrudGeneralDao<K, T extends SuperEntity> {
    void delete(T t);

    void update(T t);

    void insert(T t);

    List<T> select(K key);

}
