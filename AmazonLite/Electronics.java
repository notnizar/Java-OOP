package com.mycompany.amazonlite;

public class Electronics extends Product implements Taxable {
    
    private String brand;
    
    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }
    
    @Override
    public double getTax(double price) {
     return getTax(getPrice());
    }

    @Override
    public String toString() {
        return "Electronics{"+ super.toString() + "brand=" + brand + '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public double calculateFinalPrice() {
        return getPrice() * 0.15;
    }
    
}
