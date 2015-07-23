package shop.dao;

import shop.entity.Entity;

public interface DaoInterface<K, T extends Entity> {
    void insert(T t);

    T select(long id);

    void update(T t);

    void delete(K key);
}
