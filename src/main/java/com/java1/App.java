package com.java1;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("==================================================");
        System.out.println("\tKODA ENTERPRISE");
        System.out.println("==================================================");
        
        // Dependency Injection
        Employee andi = new PermanentEmployee("EMP001", "Andi Pratama", "Backend Developer", "IT", 5000000);
        Employee budi = new ContractEmployee("EMP002", "Budi Santoso", "Frontend Developer", "IT", 5000000);
       
        EmployeeService andiService = new EmployeeService(andi);
        EmployeeService budiService = new EmployeeService(budi);

        andiService.showEmployee();

        budiService.showEmployee();

        budiService.giveRaise(300000);

        System.out.println();
        
        budiService.giveRaise(1000000);
        
        System.out.println();

        budiService.giveRaise(-500000);

    }
}
