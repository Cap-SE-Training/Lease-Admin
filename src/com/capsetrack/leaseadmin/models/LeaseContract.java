package com.capsetrack.leaseadmin.models;

import com.capsetrack.leaseadmin.models.vehicle.Vehicle;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.UUID;

public class LeaseContract {
    private String id;
    private Vehicle vehicle;
    private Employee employee;
    private Date startDate;
    private long duration;
    private Date endDate;
    private LocalDateTime newStartDate;
    private LocalDateTime newEndDate;


    public LeaseContract(Vehicle vehicle, Employee employee, long duration){
        this.id = UUID.randomUUID().toString();
        this.vehicle = vehicle;
        this.employee = employee;
        this.duration = duration;
        
        createNewDates();
    }

    private void createNewDates(){
        this.newStartDate = LocalDateTime.now();
        this.newEndDate = newStartDate.plusSeconds(duration);

        System.out.println("Start date: " + newStartDate.toString());
        System.out.println("End date: " + newEndDate.toString());
    }

    public long calculateNewProgress(){
        LocalDateTime currentTime = LocalDateTime.now();
        long progress = 0;
        if(!currentTime.isBefore(newEndDate)){
            System.out.println("Contract has expired.");
            //vehicle.setIsFree(false);
        } else{

            progress = currentTime.until(newEndDate, ChronoUnit.SECONDS);

            System.out.println("Progress: " + progress + " seconds until contract expires.");
        }

        return progress;
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

