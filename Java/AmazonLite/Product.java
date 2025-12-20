package com.mycompany.amazonlite;

public abstract class Product {

    private String name;
    private double price;
    private static int totlaSold;

    public Product(String name, double price) {
        setName(name);
        setPrice(price);
        totlaSold++;
    }

    public static int getTotlaSold() {
        return totlaSold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            this.price = price;
        } else {
            System.out.println("Inviled Numbers");
        }
    }

}
