package repository.entity;

import annotation.Column;
import annotation.Entity;
import annotation.Table;

@Entity
@Table(name = "employee")
public class CustomerEntity extends BaseEntity{
    @Column(name = "name_employee")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
