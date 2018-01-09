package com.capsetrack.leaseadmin;

import com.capsetrack.leaseadmin.models.Employee;

import java.util.ArrayList;

public class Company {

    private String name;
    private ArrayList<Employee> employees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }
}
