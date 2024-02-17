package controller;

import model.input.BuildingSearchInput;
import model.output.BuildingSearchOutput;
import service.BuildingService;
import service.impl.BuildingServiceImpl;

import java.util.List;

public class BuildingController {
    private BuildingService buildingService = new BuildingServiceImpl();

    public List<BuildingSearchOutput> searchBuilding (BuildingSearchInput buildingSearchInput){
        List<BuildingSearchOutput> results = buildingService.search(buildingSearchInput);
        return results;
    }
}
