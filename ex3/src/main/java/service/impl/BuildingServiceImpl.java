package service.impl;

import model.input.BuildingSearchInput;
import model.output.BuildingSearchOutput;
import repository.BuildingReposity;
import repository.JdbcReposity;
import repository.entity.BuildingEntity;
import repository.impl.BuildingReposityImpl;
import repository.impl.SimpleJdbcReposity;
import service.BuildingService;

import java.util.ArrayList;
import java.util.List;

public class BuildingServiceImpl implements BuildingService {

    private BuildingReposity buildingReposity = new BuildingReposityImpl();

    @Override
    public List<BuildingSearchOutput> search(BuildingSearchInput buildingSearchInput) {
        List<BuildingSearchOutput> results = new ArrayList<>();
        List<BuildingEntity> buildingEntities = buildingReposity.findBuiling(buildingSearchInput.getName());
        for(BuildingEntity buildingEntity : buildingEntities){
            BuildingSearchOutput buildingSearchOutput = new BuildingSearchOutput();
            buildingSearchOutput.setId(buildingEntity.getId());
            buildingSearchOutput.setName(buildingEntity.getBuildingName());
            buildingSearchOutput.setStreet(buildingEntity.getStreet() + " - " + buildingEntity.getWard());
            buildingSearchOutput.setNote(buildingEntity.getNote());
            results.add(buildingSearchOutput);
        }
        return results;
    }
}
