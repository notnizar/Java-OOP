
package com.mycompany.final2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        CarRental rental = new CarRental();
    
    // Add 3 customers using a loop
    for (int i = 0; i < 3; i++) {
        rental.addCustomer();
    }
    
    // Search logic
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter age threshold:");
    int searchAge = scanner.nextInt();
    
    for (Customer c : rental.getCustomers()) {
        if (c.getAge() > searchAge) {
            System.out.println(c.getCustomerInfo());
        }
    }
    }
}
