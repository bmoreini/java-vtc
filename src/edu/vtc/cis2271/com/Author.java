package edu.vtc.cis2271;

import java.util.ArrayList;

/**
 * Author - description
 * @author Bram MOreinis
 *
 */

public class Author {

    public Author (String name, ArrayList books) {
        this._name=name;
        this._books=books;
    }

    public String getName () {
        return this._name;
    }

    public String toString() {
        return this._name;
    }

    public void addBook (Book title) {
        [add book title to author's books ArrayList']
    }

    private String _name;
    private ArrayList<edu.vtc.cis2271.Book> _books;

}
