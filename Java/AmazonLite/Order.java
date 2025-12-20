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
            if (cart[i] != null) {
                double price = cart[i].getPrice();
                double tax = 0.0;

                if (cart[i] instanceof Electronics) {
                    Electronics elect = (Electronics) cart[i];
                    System.out.println("Item: " + elect.getName() + " (" + elect.getBrand() + ")");

                    tax = elect.getTax(price);
                } else if (cart[i] instanceof Clothing) {
                    Clothing cloth = (Clothing) cart[i];
                    System.out.println("Item: " + cloth.getName() + " (Size: " + cloth.getSize() + ")");

                    tax = cloth.getTax(price);
                }
                double itemTotal = price + tax;

                total = total + itemTotal;

                System.out.println("   Price: " + price + " | Tax: " + tax + " | Subtotal: " + itemTotal);
            }
        }
        return total;
    }
}
