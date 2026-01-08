package com.mycompany.hotelmangament;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelStay extends Reservation {
            Scanner scanner = new Scanner(System.in);


    private int nights;
    private String packageType;
    private ArrayList<Guest> guests = new ArrayList();

    public HotelStay() {
        nights = 1;
        packageType = "Basic";
    }

    public HotelStay(int nights, String packageType, String gustName, char roomType, String city, int nationalID, String name, int points) {
        super(gustName, roomType, city);
        setNights(nights);
        setPackageType(packageType);

        guests.add(new Guest(nationalID,name,points));
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        if (nights >= 1) {
            this.nights = nights;

        }
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        if (packageType.equalsIgnoreCase("Basic") || packageType.equalsIgnoreCase("Plus") || packageType.equalsIgnoreCase("VIP")) {
            this.packageType = packageType;
        }

    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }

    public void addGuest() {
        System.out.println("Enter Guest id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Guest name: ");
        String name = scanner.next();
        System.out.println("Enter Guest points: ");
        int points = scanner.nextInt();
        
        Guest guest = new Guest(id, name, points);
        guests.add(guest);
    }

    @Override
    public double totalPrice() {
        boolean isLate = scanner.nextBoolean();
        if (isLate == true) {
           return super.totalPrice() * nights + 20;
        }else{
            return 300;
        }
    }

}
