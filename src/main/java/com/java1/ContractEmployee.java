package com.java1;

public class ContractEmployee extends Employee {
    public ContractEmployee(String employeeID, String name, String position, String department,int salary){
        super(employeeID, name, position, department, salary);
    }

    @Override
    public void increaseSalary(int amount){   
        System.out.println("Salary Increase: " + "Rp." + amount);

        if(amount >= 500000){
            System.out.println("Error: Kenaikan gaji maksimal Rp500000");
        } else{
            addSalary(amount);
        }
            
        System.out.println("Current Salary: " + "Rp." + getSalary());
    }
}
