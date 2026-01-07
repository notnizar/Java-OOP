
package com.mycompany.hotelmangament;


public class Reservation {
    private String gustName;
    private char roomType;
    private String city;

    public Reservation() {
    }

    public Reservation(String gustName, char roomType, String city) {
         setCity(city);
         setGustName(gustName);
         setRoomType(roomType);
    }

    public String getGustName() {
        return gustName;
    }

    public void setGustName(String gustName) {
        this.gustName = gustName;
    }

    public char getRoomType() {
        return roomType;
    }

    public void setRoomType(char roomType) {
        this.roomType = roomType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    public double totalPrice(){
        return 0;
    }
}
