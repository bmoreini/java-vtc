/**
 * Author.java
 * Copyright 2016, Craig A. Damon
 * all rights reserved
 */
package edu.vtc.cis2271;

import java.util.ArrayList;
import java.util.List;

/**
 * Author - description
 * @author Craig A. Damon
 *
 */
public class Author
{
	/**
	 * 
	 */
	private static final int STILL_ALIVE = -1000000;

	public Author(String name,int born)
	{
		_name = name;
		_books = new ArrayList<>();
		_yearBorn = born;
		_yearDied = STILL_ALIVE;
	}
	
	public String getName()
	{
		return _name;
	}
	
	public void addBook(Book book)
	{
		_books.add(book);
	}
	
	public void displayBooks()
	{
		System.out.println(this);
		int year = -1;
		for (int i = 0; i < _books.size(); i++)
			{
				Book b = _books.get(i);
				if (b.getYear() != year)
					{
						System.out.println("  "+b.getYear());
						year = b.getYear();
					}
				System.out.println("     "+b.getTitle());
			}
	}
	
	public String toString()
	{
		if (_yearDied == STILL_ALIVE)
			return _name + " ("+_yearBorn+" - )";
		else
			return _name + " ("+_yearBorn+" - "+_yearDied+")";
	}
	
	private String _name;
 private List<Book> _books;
 private int _yearBorn;
 private int _yearDied;   // STILL_ALIVE if still alive
 
	/** description
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
