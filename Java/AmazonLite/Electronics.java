package com.mycompany.amazonlite;

public class Electronics extends Product implements Taxable {
    
    private String brand;
    
    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }
    
    @Override
    public double getTax(double price) {
        double currentPrice = getPrice();
        
        double takeOFF = currentPrice * (15 / 100);
        double newPrice = currentPrice - takeOFF;
        
        setPrice(newPrice);
        return newPrice;
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
    
}
