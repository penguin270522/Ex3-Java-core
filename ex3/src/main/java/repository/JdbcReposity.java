package repository;

import repository.entity.BuildingManegementEntity;

import java.util.List;

public interface JdbcReposity <T>{

    List<T> findByCondition(String name);
    List<BuildingManegementEntity> insert(Object object);

}
