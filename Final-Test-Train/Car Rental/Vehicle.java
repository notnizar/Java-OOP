package com.mycompany.final2;

public class Vehicle {

    private String model;
    private char category;
    private String branch;

    public Vehicle() {
        model = "Standard";
        category = 'C';
        branch = "Main";
    }

    public Vehicle(String model, char category, String branch) {
        setBranch(branch);
        setCategory(category);
        setModel(model);
    }

    public void Vehicle() {

    }

    public void Vehicle(String model, char category, String branch) {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        model = model.toLowerCase();
        this.model = model;
    }

    public char getCategory() {
        return category;
    }

    public void setCategory(char category) {
        category = Character.toUpperCase(category);
        if (category == 'C' || category == 'S' || category == 'L') {
            this.category = category;
        } else {
            System.out.println("Invalid Category, defult to  'C' ");
            this.category = 'C';
        }

    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double calculateRent() {
        double cost;

        switch (category) {
            case 'C' -> {
                // C case
                if (branch.equalsIgnoreCase("Amman")) {
                    cost = 30;
                } else if (branch.equalsIgnoreCase("Zarqa")) {
                    cost = 20;
                }
                break;
            }

            case 'S' -> {
                if (branch.equalsIgnoreCase("Amman")) {
                    cost = 50;
                } else if (branch.equalsIgnoreCase("Zarqa")) {
                    cost = 35;
                }
                break;
            }

            case 'L' -> {
                if (branch.equalsIgnoreCase("Amman")) {
                    cost = 80;
                } else if (branch.equalsIgnoreCase("Zarqa")) {
                    cost = 60;
                }
                break; // i  should ask dose brake realy matter  here ? 
            }
            //  i should ask for  defult
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "model=" + model + ", category=" + category + ", branch=" + branch + '}';
    }
    
    
}
