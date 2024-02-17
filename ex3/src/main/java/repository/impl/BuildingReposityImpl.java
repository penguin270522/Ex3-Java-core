package repository.impl;

import annotation.Entity;
import annotation.Table;
import constant.SystemConstant;
import repository.BuildingReposity;
import repository.JdbcReposity;
import repository.entity.BuildingEntity;

import java.lang.reflect.ParameterizedType;
import java.util.List;

public class BuildingReposityImpl extends SimpleJdbcReposity<BuildingEntity> implements BuildingReposity {
    private Class<BuildingEntity> buildingEntityClass;
    public BuildingReposityImpl (){
        buildingEntityClass = (Class<BuildingEntity>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }
    @Override
    public List<BuildingEntity> findBuiling(String name) {
       String tableName = null;
       if(buildingEntityClass.isAnnotationPresent(Table.class) && buildingEntityClass.isAnnotationPresent(Entity.class)){
           Table table = buildingEntityClass.getAnnotation(Table.class);
           tableName = table.name();
       }
        StringBuilder sql = new StringBuilder("select * from " + tableName + " " + SystemConstant.WHERE_ONE_EQUAL_ONE);
        if(name != null && name != "") {
            sql.append(" and building_name like '%" + name + "%' ");
        }
        String debugsql = sql.toString();
       return findByCondition(debugsql);
    }
}
