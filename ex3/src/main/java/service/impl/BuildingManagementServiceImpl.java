package service.impl;

import model.dto.BuildingManagementDTO;
import model.output.BuildingManagementOutput;
import model.output.BuildingSearchOutput;
import repository.BuildingManegementReposity;
import repository.entity.BuildingManegementEntity;
import repository.impl.BuildingManagementReposityImpl;
import service.BuildingManagementService;

import java.util.ArrayList;
import java.util.List;

public class BuildingManagementServiceImpl implements BuildingManagementService {
    private BuildingManegementReposity buildingManegementReposity = new BuildingManagementReposityImpl();
    @Override
    public void managerBuilding(BuildingManagementDTO buildingManagementDTO) {
        BuildingManegementEntity buildingManegementEntity = new BuildingManegementEntity();
        buildingManegementEntity.setIdEmloyee(buildingManagementDTO.getIdEmployee());
        buildingManegementEntity.setIdBuilding(buildingManagementDTO.getIdBuilding());
        buildingManegementReposity.buildingManagement(buildingManegementEntity);
    }

    @Override
    public List<BuildingManagementOutput> showManagementBuilding() {
        List<BuildingManagementOutput> results = new ArrayList<>();
        List<BuildingManegementEntity> buildingManegementEntities = buildingManegementReposity.showManagementBuilding();
        for(BuildingManegementEntity buildingManegementEntity : buildingManegementEntities){
            BuildingManagementOutput buildingManagementOutput = new BuildingManagementOutput();
            buildingManagementOutput.setIdEmployee(buildingManegementEntity.getIdEmloyee());
            buildingManagementOutput.setIdBuilding(buildingManegementEntity.getIdBuilding());
            results.add(buildingManagementOutput);
        }
        return results;
    }
}
