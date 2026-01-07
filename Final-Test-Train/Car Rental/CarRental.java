package com.mycompany.final2;

import java.util.ArrayList;
import java.util.Scanner;

public class CarRental extends Vehicle {

    Scanner scanner = new Scanner(System.in);

    private String insuranceType;
    private int rentalDays;
    private ArrayList<Customer> customers = new ArrayList<>();

    public CarRental() {
        super();
        insuranceType = "Basic";
        rentalDays = 1;
    }

    public CarRental(String insuranceType, int rentalDays, String model, char category, String branch, int id, String name, int age) {
        super(model, category, branch);
        setInsuranceType(insuranceType);
        setRentalDays(rentalDays);

        addCustomer();
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        if (insuranceType.equalsIgnoreCase("Basic") || insuranceType.equalsIgnoreCase("Gold") || insuranceType.equalsIgnoreCase("Premium")) {
            this.insuranceType = insuranceType;
        }

    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        if (rentalDays >= 1) {
            this.rentalDays = rentalDays;
        } else {
            System.out.println("Invalid rentalDays, Defult to 1");
            this.rentalDays = 1;
        }

    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public void addCustomer() {

        System.out.println("Enter Customer ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // to not skip  name
        System.out.println("Enter Customer name: ");
        String name = scanner.next();
        System.out.println("Enter Customer age; ");
        int age = scanner.nextInt();

        Customer newCastomer = new Customer(id, name, age);
        customers.add(newCastomer);
        
    }

    @Override
    public double calculateRent() {
        System.out.println("Do You Have Loyalty Card ?");
        boolean isLoyalty = scanner.nextBoolean();
        
        if (isLoyalty) {
            return super.calculateRent() * rentalDays - 15;
        }else{
            return 200;
        }
    }

}
