package com.mycompany.mavenproject1;

public class Library {

    private final Book[] books;

    public Library(int size) {
        this.books = new Book[size];
    }

    public void addBook(Book newBook) {
        boolean isAdded = false;

        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                isAdded = true;
                System.out.println("Book added successfully: ");
                break;
            }
        }

        if (isAdded == false) {
            System.out.println("Sorry, Library is full!");
        }
    }

    public Book searchByTitle(String title) {
        for (Book book : books) {
            if (book != null && book.getTitle().equals(title)) {
                return book;
            }

        }
        return null;
    }
}
