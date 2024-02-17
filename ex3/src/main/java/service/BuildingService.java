package service;

import model.input.BuildingSearchInput;
import model.output.BuildingSearchOutput;

import java.util.List;

public interface BuildingService {

    List<BuildingSearchOutput> search(BuildingSearchInput buildingSearchInput);

}
