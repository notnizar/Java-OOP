package com.mycompany.amazonlite;

public class Clothing extends Product implements Taxable {

    private String size;

    public Clothing(String name, double price, String size) {
        super(name, price);
        setSize(size);
    }

    @Override
    public double getTax(double price) {
          return price * 0.10;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size.toUpperCase();
    }

    @Override
    public double calcilateFinalPrice() {
        return getPrice() * getTax(getPrice());
    }

}
