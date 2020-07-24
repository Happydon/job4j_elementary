package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book sherlock = new Book("Sherlock Holmes", 726);
        Book potter = new Book("Harry Potter", 437);
        Book eragon = new Book("Eragon", 574);
        Book clean = new Book("Clean code", 420);
        Book[] books = new Book[4];
        books[0] = sherlock;
        books[1] = potter;
        books[2] = eragon;
        books[3] = clean;
        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            System.out.println(b.getName() + " - " + b.getPageAmount());
        }
        System.out.println("Exchange clean and sherlock.");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            System.out.println(b.getName() + " - " + b.getPageAmount());
        }
        System.out.println("Show books named clean.");
        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            if (b.getName().equals("Clean code")) {
                System.out.println(b.getName() + " - " + b.getPageAmount());
            }
        }
    }
}
