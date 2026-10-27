package com.java1;

public class EmployeeService {
    private Employee employee;

    public EmployeeService(Employee employee) {
        this.employee = employee;
    }

    public void showEmployee(){
        System.out.println("Employee ID: " + employee.getEmployeeID());
        System.out.println("Name: " + employee.getName());
        System.out.println("Position: " + employee.getPosition());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Salary: " + "Rp. " + employee.getSalary() + "\n");
        
        System.out.println("====================");
        System.out.println();
    }

    public void giveRaise(int amount){
        employee.increaseSalary(amount);
    }

    public Employee getEmployee() {
        return employee;
    }
}
