package repository.entity;

import annotation.Column;
import annotation.Entity;
import annotation.Table;

import java.util.Date;

@Entity
@Table(name = "building")
public class BuildingEntity extends BaseEntity {
    @Column(name = "building_name")
    private String buildingName;
    @Column(name = "district_id")
    private int districtId;
    @Column(name = "ward")
    private String ward;
    @Column(name = "street")
    private String street;
    @Column(name = "structure")
    private String structure;
    @Column(name = "number_basment")

    private int numberBasment;
    @Column(name = "floor_area_id")

    private int floorAreaId;
    @Column(name = "direction")

    private String direction;
    @Column(name = "level")

    private String level;
    @Column(name = "describe_area")

    private String describeArea;
    @Column(name = "service_charge")

    private int serviceCharge;
    @Column(name = "oto_charge")

    private int otoCharge;
    @Column(name = "moto_charge")

    private int motoCharge;
    @Column(name = "time_charge")

    private int timeCharge;
    @Column(name = "electricity_bill")

    private int electricityBill;
    @Column(name = "deposit")

    private int deposit;
    @Column(name = "lease_duration")

    private Date leaseDuration;
    @Column(name = "dornmen_time")

    private Date dornmenTime;
    @Column(name = "bill_mg")

    private int billMg;
    @Column(name = "note")

    private String note;

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public int getNumberBasment() {
        return numberBasment;
    }

    public void setNumberBasment(int numberBasment) {
        this.numberBasment = numberBasment;
    }

    public int getFloorAreaId() {
        return floorAreaId;
    }

    public void setFloorAreaId(int floorAreaId) {
        this.floorAreaId = floorAreaId;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDescribeArea() {
        return describeArea;
    }

    public void setDescribeArea(String describeArea) {
        this.describeArea = describeArea;
    }

    public int getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(int serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public int getOtoCharge() {
        return otoCharge;
    }

    public void setOtoCharge(int otoCharge) {
        this.otoCharge = otoCharge;
    }

    public int getMotoCharge() {
        return motoCharge;
    }

    public void setMotoCharge(int motoCharge) {
        this.motoCharge = motoCharge;
    }

    public int getTimeCharge() {
        return timeCharge;
    }

    public void setTimeCharge(int timeCharge) {
        this.timeCharge = timeCharge;
    }

    public int getElectricityBill() {
        return electricityBill;
    }

    public void setElectricityBill(int electricityBill) {
        this.electricityBill = electricityBill;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public Date getLeaseDuration() {
        return leaseDuration;
    }

    public void setLeaseDuration(Date leaseDuration) {
        this.leaseDuration = leaseDuration;
    }

    public Date getDornmenTime() {
        return dornmenTime;
    }

    public void setDornmenTime(Date dornmenTime) {
        this.dornmenTime = dornmenTime;
    }

    public int getBillMg() {
        return billMg;
    }

    public void setBillMg(int billMg) {
        this.billMg = billMg;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
