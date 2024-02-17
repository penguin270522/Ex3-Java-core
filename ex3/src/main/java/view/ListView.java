package view;

import controller.BuildingController;
import controller.BuildingManagementController;
import controller.CustomerController;
import model.dto.BuildingManagementDTO;
import model.dto.EmployeeDTO;
import model.input.BuildingSearchInput;
import model.input.CustomerSearchInput;
import model.output.BuildingManagementOutput;
import model.output.BuildingSearchOutput;
import model.output.CustomerSearchOutput;

import java.util.List;
import java.util.Scanner;

public class ListView {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       /* String name = null;

        BuildingSearchInput buildingSearchInput = new BuildingSearchInput();
        buildingSearchInput.setName(name);

        BuildingController buildingController = new BuildingController();
        List<BuildingSearchOutput> buildingSearchOutputs = buildingController.searchBuilding(buildingSearchInput);
        for(BuildingSearchOutput building : buildingSearchOutputs ){
            System.out.print("Building ID: " + building.getId());
            System.out.println(" Building Name: " + building.getName());
        }

        String employeeName = null;
        CustomerSearchInput customerSearchInput = new CustomerSearchInput();
        customerSearchInput.setName(employeeName);

        CustomerController customerController = new CustomerController();
        List<CustomerSearchOutput> customerSearchOutputs = customerController.searchCustomer(customerSearchInput);
        for(CustomerSearchOutput customerSearchInput1 : customerSearchOutputs){
            System.out.print("customer ID: " + customerSearchInput1.getId());
            System.out.println(" customer Name: " + customerSearchInput1.getName());
        }
*/
      /*  String employeeAddName = "penguin";
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setName(employeeAddName);

        CustomerController customerController = new CustomerController();
        customerController.customerAdd(employeeDTO);*/

        System.out.println("Chọn tòa nhà mà bạn muốn quản lí: ");
        long idBuilding = input.nextInt();
        System.out.println("Chọn nhân viên bạn muốn quản lí tòa nhà với ID là: " + idBuilding);
        long idEmployee = input.nextInt();
        BuildingManagementDTO buildingManagementDTO = new BuildingManagementDTO();
        buildingManagementDTO.setIdBuilding(idBuilding);
        buildingManagementDTO.setIdEmployee(idEmployee);

        BuildingManagementController buildingManagementController = new BuildingManagementController();
        buildingManagementController.managementBuilding(buildingManagementDTO);
        System.out.println("ID nhân viên--------ID tòa nhà");
        List<BuildingManagementOutput> result = buildingManagementController.showManagementBuilding();
        for(BuildingManagementOutput buildingManagementOutput : result){
            System.out.print("    " +buildingManagementOutput.getIdEmployee() + "                    ");
            System.out.println(buildingManagementOutput.getIdBuilding());
        }

    }
}
