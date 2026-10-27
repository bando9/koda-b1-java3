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
        
        List<Account> accounts = new ArrayList<>();

        accounts.add(new Account("KR001", "Andi", 7000000));
        accounts.add(new Account("KR002", "Budi", 5000000));
        accounts.add(new Account("KR003", "Citra", 6000000));

        System.out.println("(List) Employee List: \n");        

        for (Account account: accounts) {
            System.out.println(account.getAccountNumber() + " - " + account.getOwner() + " - " +account.getBalance());
        }

        LinkedHashMap<String, Account> accounts2 = new LinkedHashMap<>();

        accounts2.put("Andi", new Account("KR001", "Andi", 7000000));
        accounts2.put("Budi", new Account("KR002", "Budi", 5000000));
        accounts2.put("Citra", new Account("KR003", "Citra", 6000000));

        System.out.println("\n\n========================");
        System.out.println("(Map) Employee List: \n");        



        for(Account account: accounts2.values()){
            System.out.println(account.getAccountNumber() + " - " + account.getOwner() + " - " +account.getBalance());
        }


        Set<Account> accounts3 = new HashSet<>();

        accounts3.add(new Account("KR001", "Andi", 7000000));
        accounts3.add(new Account("KR002", "Budi", 5000000));
        accounts3.add(new Account("KR003", "Citra", 6000000));

        System.out.println("========================");
        System.out.println("(Set) Employee List: \n");        


        for(Account account: accounts3){
            System.out.println(account.getAccountNumber() + " - " + account.getOwner() + " - " +account.getBalance());
        }


        Queue<Account> accounts4 = new ArrayDeque<>();

        accounts4.offer(new Account("KR001", "Andi", 7000000));
        accounts4.offer(new Account("KR002", "Budi", 5000000));
        accounts4.offer(new Account("KR003", "Citra", 6000000));

        System.out.println("========================");
        System.out.println("(Queue) Employee List: \n");

        for(Account account: accounts3){
            System.out.println(account.getAccountNumber() + " - " + account.getOwner() + " - " +account.getBalance());
        }

    }
}
