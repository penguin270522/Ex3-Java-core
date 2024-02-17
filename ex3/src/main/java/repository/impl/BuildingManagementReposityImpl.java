package repository.impl;

import annotation.Entity;
import annotation.Table;
import repository.BuildingManegementReposity;
import repository.entity.BuildingManegementEntity;

import java.lang.reflect.ParameterizedType;
import java.util.List;

public class BuildingManagementReposityImpl extends SimpleJdbcReposity<BuildingManegementEntity> implements BuildingManegementReposity {
    private Class<BuildingManegementEntity> buildingManegementEntityClass;

    public BuildingManagementReposityImpl(){
        buildingManegementEntityClass = (Class<BuildingManegementEntity>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }
    @Override
    public void buildingManagement(BuildingManegementEntity buildingManegementEntity) {
        insert((Object) buildingManegementEntity);
    }

    @Override
    public List<BuildingManegementEntity> showManagementBuilding() {
        String tableName = null;
        if(buildingManegementEntityClass.isAnnotationPresent(Entity.class) && buildingManegementEntityClass.isAnnotationPresent(Table.class)){
            Table table = buildingManegementEntityClass.getAnnotation(Table.class);
            tableName = table.name();
        }
        String sql = "select * from " + tableName;
        return findByCondition(sql);
    }
}
