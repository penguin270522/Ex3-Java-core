package controller;

import model.dto.BuildingManagementDTO;
import model.output.BuildingManagementOutput;
import service.BuildingManagementService;
import service.impl.BuildingManagementServiceImpl;

import java.util.List;

public class BuildingManagementController {
    private BuildingManagementService buildingManagementService = new BuildingManagementServiceImpl();

    public void managementBuilding(BuildingManagementDTO buildingManagementDTO){
        buildingManagementService.managerBuilding(buildingManagementDTO);
    }

    public List<BuildingManagementOutput> showManagementBuilding(){
        List<BuildingManagementOutput> results = buildingManagementService.showManagementBuilding();
        return results;
    }


}
