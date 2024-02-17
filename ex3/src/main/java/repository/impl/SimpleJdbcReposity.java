package repository.impl;

import annotation.Entity;
import annotation.Table;
import annotation.Column;
import mapper.ResultsetMapper;
import repository.JdbcReposity;
import repository.entity.BuildingManegementEntity;
import utils.ConnectionUntils;


import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.sql.*;
import java.util.List;

public class SimpleJdbcReposity <T> implements JdbcReposity<T> {
    private Class<T> tClass;


    public SimpleJdbcReposity(){
        tClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Override
    public List<T> findByCondition(String sql) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            conn = ConnectionUntils.getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            ResultsetMapper<T> resultsetMapper = new ResultsetMapper<>();
            return resultsetMapper.mapRow(rs,tClass);
        }catch(SQLException e){
            e.printStackTrace();
        } finally {
            try {
               if(conn != null) conn.close();
               if(stmt != null) stmt.close();
               if(rs != null) rs.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        return null;
    }

    @Override
    public List<BuildingManegementEntity> insert(Object object) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try{
            conn = ConnectionUntils.getConnection();
            StringBuilder sql = createSQLInsert();
            stmt = conn.prepareStatement(sql.toString());
            Class<?> zClass = object.getClass();
            int paramentIndex = 1;
            for(Field field : zClass.getDeclaredFields()){
                field.setAccessible(true);
                stmt.setObject(paramentIndex,field.get(object));
                paramentIndex++;
            }
            Class<?> parentClass = zClass.getSuperclass();
            while (parentClass != null && parentClass !=  Object.class){
                for(Field field : parentClass.getDeclaredFields()){
                    field.setAccessible(true);
                    stmt.setObject(paramentIndex,field.get(object));
                    paramentIndex++;
                }
                parentClass = parentClass.getSuperclass();
            }
            stmt.executeUpdate();
        }catch (SQLException |IllegalAccessException e){
            e.printStackTrace();
        }
        return null;
    }


    private StringBuilder createSQLInsert() {
        String tableName = "";
        StringBuilder fields = new StringBuilder("");
        StringBuilder value = new StringBuilder("");

        //ham lay name
        if(tClass.isAnnotationPresent(Entity.class) && tClass.isAnnotationPresent(Table.class)){
            Table table  = tClass.getAnnotation(Table.class);
            tableName = table.name();
        }
        //ham lay fields

        for(Field field : tClass.getDeclaredFields()){
            if(fields.length() > 1){
                fields.append(",");
                value.append(",");
            }
            if(field.isAnnotationPresent(Column.class)){
                Column column = field.getAnnotation(Column.class);
                fields.append(column.name());
                value.append("?");
            }
        }

        Class<?> parentClass = tClass.getSuperclass();
        while (parentClass != null && parentClass != Object.class){
            for (Field field : parentClass.getDeclaredFields()){
                if(fields.length() > 1){
                    fields.append(",");
                    value.append(",");
                }
                if(field.isAnnotationPresent(Column.class)){
                    Column column = field.getAnnotation(Column.class);
                    fields.append(column.name());
                    value.append("?");
                }
            }
            parentClass = parentClass.getSuperclass();
        }
        StringBuilder sql = new StringBuilder(
                "insert into " + tableName + "(" + fields.toString() + ") values (" + value.toString() + ")"
        );
        return sql;
    }

}
