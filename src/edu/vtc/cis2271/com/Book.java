package edu.vtc.cis2271.com;

public class Book {

    public Book (String title, String author) { // Constructor
        this._title=title;
        this._author=author;

    }

    public void setTitle(String title) { // setter
        this._title=title;
    }

    public String getTitle () {  // non-static method: getter
        return this._title;
        /* return _title; assumes this because underscore */
    }

    public String toString() {
        return this._title+" by "+this._author; // Book#7AB234E8
    }

    /* Fields / Instance Variables */
    private String _title;
    private String _author;

}
