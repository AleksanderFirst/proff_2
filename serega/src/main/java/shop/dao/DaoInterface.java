package shop.dao;

import shop.entity.Entity;

public interface DaoInterface {
    void insert(Entity entity);

    Entity select(int id);

    void update(Entity entity);

    void delete(int id);
}
