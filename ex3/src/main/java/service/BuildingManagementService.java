package service;

import model.dto.BuildingManagementDTO;
import model.output.BuildingManagementOutput;
import model.output.BuildingSearchOutput;

import java.util.List;

public interface BuildingManagementService {
    void managerBuilding(BuildingManagementDTO buildingManagementDTO);
    List<BuildingManagementOutput> showManagementBuilding();
}
