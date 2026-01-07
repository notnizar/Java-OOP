package com.mycompany.final2;

import java.util.ArrayList;


public class CarRental extends Vehicle{
    private String insuranceType;
    private int rentalDays;
    private ArrayList<Customer> customers = new ArrayList<>();
    

    public CarRental(String insuranceType, int rentalDays) {
        this.insuranceType = insuranceType;
        this.rentalDays = rentalDays;
    }

    public CarRental(String insuranceType, int rentalDays, String model, char category, String branch, int id, String name, int age) {
        super(model, category, branch);
        this.insuranceType = insuranceType;
        this.rentalDays = rentalDays;
    }
    
    public void addCustomer(){
        
    }
    
    public double calculateRent(){
        return 0;
    }
    
    
}
