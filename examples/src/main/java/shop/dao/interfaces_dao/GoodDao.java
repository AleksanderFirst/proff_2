package shop.dao.interfaces_dao;

import shop.entity.Good;

/**
 * Created by randriyanov on 19.07.15.
 */
public interface GoodDao {
    void update(Good good);
    void delete(Good good);
}
