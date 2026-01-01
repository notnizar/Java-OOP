package com.mycompany.amazonlite;

public class Order {

    Product[] cart = new Product[10];

    int itemCount = 0;

    public void addProduct(Product p) {
        if (itemCount < cart.length) {
            cart[itemCount] = p;
            itemCount++;
            System.out.println("Product " + p.getName() + "Added to Cart");
        } else {
            System.out.println("Cart Is full");
        }
    }

    public double checkout() {
        double total = 0.0;

        for (int i = 0; i < cart.length; i++) {
          if(cart[i] != null){
              double finalPrice = cart[i].calcilateFinalPrice();
              System.out.println("Item: " + cart[i].getName() + "Final Price: " + finalPrice);
              total += finalPrice;
          }
        }
        return total;
    }
}
 