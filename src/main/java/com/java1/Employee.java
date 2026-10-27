package com.java1;

// class
public abstract class Employee {
    private String employeeID;
    private String name;
    private String position;
    private String department;
    private int salary;
    
    // Constructor
    public Employee(String employeeID, String name, String position, String department, int salary){
        this.employeeID = employeeID;
        this.name = name;
        this.position = position;
        this.department = department;
        this.salary = salary;
    }

    public String getEmployeeID(){
        return employeeID;
    }
    public String getName(){
        return name;
    }
    public String getPosition(){
        return position;
    }
    public String getDepartment(){
        return department;
    }
    public int getSalary(){
        return salary;
    }

    // method abstract
    public abstract void increaseSalary(int amount);

    public void addSalary(int amount){
        if(amount <= 0){
            // System.out.println("Error: Kenaikan gaji harus lebih dari 0");
            throw new IllegalArgumentException("Kenaikan gaji harus lebih dari 0");
        } else {
            salary+=amount;
        }
    }
}
