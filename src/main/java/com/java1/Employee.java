package com.java1;

// class
public class Employee {
    private String employeeID;
    private String name;
    private int salary;
    
    // Constructor
    public Employee(String employeeID, String name, int salary){
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
    }

    public String getEmployeeID(){
        return employeeID;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }

}
