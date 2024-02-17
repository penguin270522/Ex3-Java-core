package repository;

import model.output.BuildingManagementOutput;
import repository.entity.BuildingManegementEntity;

import java.util.List;

public interface BuildingManegementReposity {
    void buildingManagement(BuildingManegementEntity buildingManegementEntity);
    List<BuildingManegementEntity> showManagementBuilding ();
}
