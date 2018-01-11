package com.capsetrack.leaseadmin.models;

import com.capsetrack.leaseadmin.models.vehicle.Vehicle;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class LeaseContract {
    private String id;
    private Vehicle vehicle;
    private Employee employee;
    private Date startDate;
    private long duration;
    private Date endDate;

    public LeaseContract(Vehicle vehicle, Employee employee, long duration){
        this.id = UUID.randomUUID().toString();
        this.vehicle = vehicle;
        this.employee = employee;
        this.duration = duration;
        createDates();
    }

    private void createDates(){
        Long startDateInMillis = System.currentTimeMillis();
        this.startDate = new Date(startDateInMillis);
        this.endDate = new Date(startDateInMillis + duration);
    }

    public long calculateProgress(){
        long diff = endDate.getTime() - startDate.getTime();
        long diffSeconds = diff / 1000 % 60;
        long diffMinutes = diff / (60 * 1000) % 60;
        long diffHours = diff / (60 * 60 * 1000);
        System.out.println(diffSeconds + " seconds since start.");
        System.out.println(diffMinutes + " minutes since start.");
        System.out.println(diffHours + " hours since start.");

        return diffMinutes;
    }

    public boolean hasContractExpired(){
        if(endDate.getTime() < System.currentTimeMillis()){
            System.out.println("Contract has expired!");
            return true;
        }
        else{
            System.out.println("Contract has not expired!");
            return false;
        }
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

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}

