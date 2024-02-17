package repository;

import repository.entity.BuildingEntity;

import java.util.List;

public interface BuildingReposity {
    List<BuildingEntity> findBuiling(String name);

}
