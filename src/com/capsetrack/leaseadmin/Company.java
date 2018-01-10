package com.capsetrack.leaseadmin;

import com.capsetrack.leaseadmin.models.Employee;

import java.util.ArrayList;

public class Company {

    private String name;
    private ArrayList<Employee> employees = new ArrayList<>();

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

    public Employee getEmployee(String id) throws Exception {
        for(Employee employee: employees){
            if(employee.getId().equals(id)){
                return employee;
            }
        }
        throw new Exception("This employee id is not valid");
    }
}
