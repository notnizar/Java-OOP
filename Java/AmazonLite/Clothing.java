package com.mycompany.amazonlite;

public class Clothing extends Product implements Taxable {

    private String size;
    
    public Clothing(String name, double price, String size) {
        super(name, price);
        setSize(size);
    }
    
    @Override
    public double getTax(double percentage) {
        double currentPrice = getPrice();
        
        double takeOFF = currentPrice * (10 / 100);
        double newPrice = currentPrice - takeOFF;
        
        setPrice(newPrice);
        return newPrice;
        
    }
    
    public String getSize() {
        return size;
    }
    
    public void setSize(String size) {
        this.size = size.toUpperCase;
    }
    
}
