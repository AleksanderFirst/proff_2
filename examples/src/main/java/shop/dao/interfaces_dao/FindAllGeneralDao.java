package shop.dao.interfaces_dao;

import shop.dao.interfaces_dao.CrudGeneralDao;

import java.util.List;

/**
 * Created by randriyanov on 19.07.15.
 */
public interface FindAllGeneralDao<T> extends CrudGeneralDao {

    List<T> findAll(T t);


}
