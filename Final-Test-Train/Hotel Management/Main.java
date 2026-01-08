
package com.mycompany.hotelmangament;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HotelStay stay1 = new HotelStay();
        
        fillGuestData(stay1);
        
        searchGuestsByPoints(stay1, scanner);
    }

    public static void fillGuestData(HotelStay stay1) {
        for (int i = 0; i < 3; i++) {
            stay1.addGuest();
        }
    }
    
    public static void searchGuestsByPoints(HotelStay stay1, Scanner scanner) {
        System.out.print("Enter points threshold: ");
        int threshold = scanner.nextInt();

        System.out.println("Guests with points greater than " + threshold + ":");
        boolean found = false;

        for (Guest g : stay1.getGuests()) {
            if (g.getPoints() > threshold) {
                System.out.println(g.getGuestInfo());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No guests found with points higher than " + threshold);
        }
    }
}
