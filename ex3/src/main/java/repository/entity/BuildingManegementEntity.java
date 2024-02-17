package repository.entity;

import annotation.Column;
import annotation.Entity;
import annotation.Table;

@Entity
@Table(name = "building_management")
public class BuildingManegementEntity extends BaseEntity{
    @Column(name = "employee_id")
    private Long idEmloyee;
    @Column(name ="product_building_id")
    private Long idBuilding;

    public Long getIdEmloyee() {
        return idEmloyee;
    }

    public void setIdEmloyee(Long idEmloyee) {
        this.idEmloyee = idEmloyee;
    }

    public Long getIdBuilding() {
        return idBuilding;
    }

    public void setIdBuilding(Long idBuilding) {
        this.idBuilding = idBuilding;
    }
}
