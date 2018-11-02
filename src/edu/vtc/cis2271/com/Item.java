/**
 * Item.java
 * Copyright 2015, Craig A. Damon
 * all rights reserved
 */
package edu.vtc.cis2271.receipt;

/**
 * Item - a kind of item you can buy
 * @author Craig A. Damon
 *
 */
public class Item
{
	/**
	 * 
	 * @param name the name of the item
	 * @param price its initial price
	 */
    public Item(String name,int price)
    {
    	   _name = name;
    	   _price = price;
    	   _numItems++;
    	   _sku = _numItems;
    }
    
	  /**
	 * @return the price
	 */
	public int getPrice()
	{
		return _price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price)
	{
		_price = price;
	}
	/**
	 * @return the name
	 */
	public String getName()
	{
		return _name;
	}
	
	public String toString()
	{
		return getName();
	}

	private final String _name;
	  private int _price;   // in pennies
	  private final int _sku;  // unique 
	  private static int _numItems = 0;
	  
	  public static void main(String args[])
	  {
	  	  Item i = new Item("Thingamajig",40000);
	  	  System.out.print(i.getName()+" costs "+i.getPrice()*0.01);
	  }
}
