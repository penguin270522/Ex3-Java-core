package controller;

import model.dto.EmployeeDTO;
import model.input.CustomerSearchInput;
import model.output.CustomerSearchOutput;
import service.CustomerService;
import service.impl.CustomerServiceImpl;

import java.util.List;

public class CustomerController {
    private CustomerService customerService = new CustomerServiceImpl();

    public List<CustomerSearchOutput> searchCustomer(CustomerSearchInput customerSearchOutput){
        List<CustomerSearchOutput> results = customerService.searchCustomer(customerSearchOutput);
        return results;
    }

    public void customerAdd(EmployeeDTO employeeDTO){
        customerService.customerAdd(employeeDTO);
    }
}
