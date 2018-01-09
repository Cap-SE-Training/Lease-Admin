package com.capsetrack.leaseadmin;

import java.util.Date;
import java.util.UUID;

public class Leasecontract {
    private String id;
    private Vehicle vehicle;
    private Employee employee;
    private Date startDate;
    private Date endDate;
    private int duration;

    public Leasecontract() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
