
package com.mycompany.eventmanagement;

public class Event {
    private String title;
    private char category;
    private String city;

    public Event() {
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
        this.title = title;
    }

    public char getCategory() {
        return category;
    }

    public void setCategory(char category) {
        this.category = category;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    public double calcTiketPrice(){
        return 0;
    }

    @Override
    public String toString() {
        return "Event{" + "title=" + title + ", category=" + category + ", city=" + city + '}';
    }
    
    
}
