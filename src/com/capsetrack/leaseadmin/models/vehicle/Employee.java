package com.capsetrack.leaseadmin.models.vehicle;

import java.util.UUID;

public class Employee {
    private String id;
    private String name;
    private LeaseContract contract;

    public Employee(String name, LeaseContract contract) {
        this.name = name;
        this.contract = contract;
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LeaseContract getContract() {
        return contract;
    }

    public void setContract(LeaseContract contract) {
        this.contract = contract;
    }
}
