package com.java1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class App 
{
    public static void main( String[] args )
    {

        Employee andi = new Employee("KR001", "Andi", 7000000);
        Employee budi = new Employee("KR002", "Budi", 5000000);
        Employee citra = new Employee("KR003", "Citra", 6000000);
        
        List<Employee> employees = new ArrayList<>();

        employees.add(andi);
        employees.add(budi);
        employees.add(citra);

        System.out.println("(List) Employee List: \n");        

        for (Employee employee: employees) {
            System.out.println(employee.getEmployeeID() + " - " + employee.getName() + " - " +employee.getSalary());
        }

        LinkedHashMap<String, Employee> employees2 = new LinkedHashMap<>();

        employees2.put("Andi", andi);
        employees2.put("Budi", budi);
        employees2.put("Citra", citra);

        System.out.println("\n\n========================");
        System.out.println("(Map) Employee List: \n");        



        for(Employee employee: employees2.values()){
            System.out.println(employee.getEmployeeID() + " - " + employee.getName() + " - " +employee.getSalary());
        }


        Set<Employee> employees3 = new HashSet<>();

        employees3.add(andi);
        employees3.add(budi);
        employees3.add(citra);

        System.out.println("========================");
        System.out.println("(Set) Employee List: \n");        


        for(Employee employee: employees3){
            System.out.println(employee.getEmployeeID() + " - " + employee.getName() + " - " +employee.getSalary());
        }


        Queue<Employee> employees4 = new ArrayDeque<>();

        employees4.offer(andi);
        employees4.offer(budi);
        employees4.offer(citra);

        System.out.println("========================");
        System.out.println("(Queue) Employee List: \n");

        for(Employee employee: employees4){
            System.out.println(employee.getEmployeeID() + " - " + employee.getName() + " - " +employee.getSalary());
        }

    }
}
