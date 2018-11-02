/**
 * Book.java
 * Copyright 2016, Craig A. Damon
 * all rights reserved
 */
package edu.vtc.cis2271;

/**
 * Book - description
 * @author Craig A. Damon
 *
 */
public class Book
{
	
	public Book(String title,int year)
	{
		_title = title;
		_year = year;
	}

	
	/**
	 * @return the year
	 */
	public int getYear()
	{
		return _year;
	}
	/**
	 * @return the title
	 */
	public String getTitle()
	{
		return _title;
	}
	
	public Author getAuthor()
	{
		return _author;
	}
	
	public void setAuthor(Author author)
	{
		_author = author;
		author.addBook(this);
	}

	public String toString()
	{
		return _title+" ("+_year+") by "+_author;
	}

	private int _year;
	private String _title;
	private Author _author;
	
	/** description
	 * @param args
	 */
	public static void main(String[] args)
	{
		Author a = new Author("Simple Simon",1999);
    Book b = new Book("ABC",2015);
		b.setAuthor(a);
		b = new Book("DEF",2015);
		b.setAuthor(a);
		b = new Book("XYZ",2016);
		b.setAuthor(a);
		System.out.println(b);
    a.displayBooks();
	}

}
