package com.capsetrack.leaseadmin.models;

import java.util.UUID;

public class Employee {
    private String id;
    private String name;
    private LeaseContract contract;

    public Employee(String name) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
    }

    public Employee(String id, String name) {
        this.name = name;
        this.id = id;
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
