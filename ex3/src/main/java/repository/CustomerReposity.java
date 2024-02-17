package repository;

import repository.entity.CustomerEntity;
import service.BuildingService;

import java.util.List;

public interface CustomerReposity {

    List<CustomerEntity> searchCustomer(String name);
    void customerAdd(CustomerEntity customerEntity);
}
