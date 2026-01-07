package com.mycompany.final2;

public class Vehicle {
   private String model;
   private char category;
   private String branch;

    public Vehicle() {
    }

    public Vehicle(String model, char category, String branch) {
        this.model = model;
        this.category = category;
        this.branch = branch;
    }
   
   public void Vehicle(){
       
   }
   
   public void Vehicle(String model, char category, String branch){
       
   }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public char getCategory() {
        return category;
    }

    public void setCategory(char category) {
        this.category = category;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
   
   public double calculateRent(){
       return 0;
   }
}
