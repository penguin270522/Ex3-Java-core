package model.dto;

import java.util.Date;

public class BuildingDTO {
    private Long id;
    private String buildingName;
    private int districtId;
    private String ward;
    private String street;
    private String structure;
    private int numberBasment;
    private int floorAreaId;
    private String direction;
    private String level;
    private String describeArea;
    private int serviceCharge;
    private int otoCharge;
    private int motoCharge;
    private int timeCharge;
    private int electricityBill;
    private int deposit;
    private Date leaseDuration;
    private Date dornmenTime;
    private int billMg;
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
