package com.mycompany.hotelmangament;

import java.util.ArrayList;

public class HotelStay extends Reservation {

    private int nights;
    private String packageType;
    private ArrayList<Guest> guests = new ArrayList();

    public HotelStay() {
    }

    public HotelStay(int nights, String packageType, String gustName, char roomType, String city, int nationalID, String name, int points) {
        super(gustName, roomType, city);
        setNights(nights);
        setPackageType(packageType);
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }
    
    public void addGuest(){
        
    }
    
    @Override
    public double totalPrice(){
        return 0;
    }

}
