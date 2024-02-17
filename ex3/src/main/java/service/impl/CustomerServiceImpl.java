package service.impl;

import model.dto.EmployeeDTO;
import model.input.CustomerSearchInput;
import model.output.CustomerSearchOutput;
import repository.CustomerReposity;
import repository.entity.CustomerEntity;
import repository.impl.CustomerReposityImpl;
import service.CustomerService;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl  implements CustomerService {

    private CustomerReposity customerReposity = new CustomerReposityImpl();
    @Override
    public List<CustomerSearchOutput> searchCustomer(CustomerSearchInput customerSearchInput) {
        List<CustomerSearchOutput> results = new ArrayList<>();
        List<CustomerEntity> customerEntities = customerReposity.searchCustomer(customerSearchInput.getName());
        for(CustomerEntity customerEntity : customerEntities){
            CustomerSearchOutput customerSearchOutput = new CustomerSearchOutput();
            customerSearchOutput.setId(customerEntity.getId());
            customerSearchOutput.setName(customerEntity.getName());
            results.add(customerSearchOutput);
        }
        return results;
    }

    @Override
    public void customerAdd(EmployeeDTO employeeDTO) {
        CustomerEntity customerEntity   = new CustomerEntity();
        customerEntity.setName(employeeDTO.getName());
        customerReposity.customerAdd(customerEntity);
    }
}
