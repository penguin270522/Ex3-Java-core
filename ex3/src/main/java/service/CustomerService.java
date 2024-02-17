package service;

import model.dto.EmployeeDTO;
import model.input.CustomerSearchInput;
import model.output.CustomerSearchOutput;

import java.util.List;

public interface CustomerService {
    List<CustomerSearchOutput> searchCustomer(CustomerSearchInput customerSearchInput);
    void customerAdd(EmployeeDTO employeeDTO);
}
