package edu.vtc.cis2271.com;

public class Main {

    public static void main(String[] args) {
        Book b; // sets aside memory for a book pointer
        b = new Book("Java is fun","John Smith"); // create a book with constructor, and connect to pointer
        String t;
        t = b.getTitle();  // access a method inside the Book object
        System.out.println(t);
        Book c;
        c = b;
        c.setTitle("I hate Java");
        t = b.getTitle();  // access a method inside the Book object
        System.out.println(b.toString());

    }

}

// Eclipse can generate getter and setter functions