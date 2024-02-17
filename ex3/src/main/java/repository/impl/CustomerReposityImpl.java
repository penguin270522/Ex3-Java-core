package repository.impl;

import annotation.Entity;
import annotation.Table;
import constant.SystemConstant;
import repository.CustomerReposity;
import repository.entity.BuildingEntity;
import repository.entity.CustomerEntity;
import service.CustomerService;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Objects;

public class CustomerReposityImpl extends SimpleJdbcReposity <CustomerEntity> implements CustomerReposity {

    private Class<CustomerEntity> customerEntityClass;

    public CustomerReposityImpl (){
        customerEntityClass = (Class<CustomerEntity>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }
    @Override
    public List<CustomerEntity> searchCustomer(String name) {
        String tableName = null;
        if(customerEntityClass.isAnnotationPresent(Entity.class) && customerEntityClass.isAnnotationPresent(Table.class)){
            Table table = customerEntityClass.getAnnotation(Table.class);
            tableName = table.name();
        }
        StringBuilder sql = new StringBuilder("select * from " + tableName + " " + SystemConstant.WHERE_ONE_EQUAL_ONE);
        if(name != null && name != ""){
            sql.append(" and name_employee like '%" + name + "%'");
        }
        String sqlDebug = sql.toString();
        return findByCondition(sqlDebug);
    }

    @Override
    public void customerAdd(CustomerEntity customerEntity) {

        insert(customerEntity);
    }


}
