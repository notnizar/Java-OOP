package com.mycompany.hotelmangament;

public class Reservation {

    private String gustName;
    private char roomType;
    private String city;

    public Reservation() {
        gustName = "Unknown";
        roomType = 'S';
        city = "Amman";
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

        this.gustName = gustName.toLowerCase();
    }

    public char getRoomType() {

        return roomType;
    }

    public void setRoomType(char roomType) {
        roomType = Character.toUpperCase(roomType);
        if (roomType == 'S' || roomType == 'D' || roomType == 'F') {
            this.roomType = roomType;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double totalPrice() {
        double cost = 0;
        switch (roomType) {
            case 'S' -> {
                if (city.equalsIgnoreCase("Amman")) {
                    cost = 45;
                } else if (city.equalsIgnoreCase("Aqaba")) {
                    cost = 60;
                }
            }

        }
        switch (roomType) {
            case 'D' -> {
                if (city.equalsIgnoreCase("Amman")) {
                    cost = 70;
                } else if (city.equalsIgnoreCase("Aqaba")) {
                    cost = 90;
                }
            }

        }
        switch (roomType) {
            case 'F' -> {
                if (city.equalsIgnoreCase("Amman")) {
                    cost = 100;
                } else if (city.equalsIgnoreCase("Aqaba")) {
                    cost = 130;
                }
            }

        }
        return cost;
    }

    @Override
    public String toString() {
        return "Reservation{" + "gustName=" + gustName + ", roomType=" + roomType + ", city=" + city + '}';
    }
    
    
}
