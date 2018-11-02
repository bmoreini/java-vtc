package edu.vtc.cis2271;

/*
 * C) Add an ArrayList of books to your Author class, with a method to add a book to the list.
 * The setAuthor method on book should add the Book to the list of books on the Author.
 *
 * D) Add a displayWorks method to Author which will print the Author's name and then all books written by the author,
 * one per line.  Format this list nicely, by indenting slightly.  Optionally, format this list by year of publication.
 * Assume the books are in the list in chronological order.
 */

/**
 * Book - description
 * @author Bram MOreinis
 *
 */

public class Book {

    public Book (String title, String year, String author) {
        this._title=title;
        this._year=year;
        this._author=author;
    }

    public String getTitle () {
        return this._title;
    }

    public String getAuthor() {
        return _author;
    }

    public String getYear() {
        return _year;
    }

    public void setTitle(String title) {
        this._title=title;
    }

    public void setAuthor(String _author) {
        this._author = _author;
    }

    public void setYear(String _year) {
        this._year = _year;
    }

    public String toString() {
        return this._title+" ("+this._author+" "+this._year+")";
    }

    /* Fields / Instance Variables */
    private String _title;
    private String _year;
    private String _author;

}
