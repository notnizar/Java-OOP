package com.mycompany.eventmanagement;

public class Event {

    private String title;
    private char category;
    private String city;

    public Event() {
        title = "General";
        category = 'G';
        city = "Unknown";
    }

    public Event(String title, char category, String city) {
        this.title = title;
        this.category = category;
        this.city = city;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        title = title.toLowerCase();
        this.title = title;
    }

    public char getCategory() {
        return category;
    }

    public void setCategory(char category) {
        category = Character.toUpperCase(category);
        if (category == 'A' || category == 'B' || category == 'C') {
            this.category = category;
        }

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double calcTiketPrice() {
        double price = 0;
        switch (Character.toUpperCase(this.category)) {
            case 'A' -> {
                if (this.city.equalsIgnoreCase("Amman")) {
                    price = 100;
                } else if (this.city.equalsIgnoreCase("Zarqa")) {
                    price = 80;
                } else {
                    price = 30;
                }
            }

            case 'B' -> {
                if (this.city.equalsIgnoreCase("Amman")) {
                    price = 60;
                } else if (this.city.equalsIgnoreCase("Zarqa")) {
                    price = 40;
                } else {
                    price = 30;
                }
            }

            default ->
                price = 30;
        }
        return price;
    }

    @Override
    public String toString() {
        return "Event{" + "title=" + title + ", category=" + category + ", city=" + city + '}';
    }

}
