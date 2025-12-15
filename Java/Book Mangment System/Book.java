package com.mycompany.mavenproject1;

public class Book {

    private String title;
    private String author;
    private Double price;
    
    
    public Book(String title, String author,Double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", price=" + price + '}';
    }
}


