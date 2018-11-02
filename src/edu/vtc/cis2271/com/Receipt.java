/**
 * Receipt.java
 * Copyright 2015, Craig A. Damon
 * all rights reserved
 */
package edu.vtc.cis2271.receipt;

import java.util.ArrayList;
import java.util.List;

/**
 * Receipt - description
 * @author Craig A. Damon
 *
 */
public class Receipt
{
	 public Receipt()
	 {
		 _items = new ArrayList<>();
		 _count = new ArrayList<>();
	 }
	 
	 public void add(Item item)
	 {
		 if (_items.contains(item))
			 {
				 int index = _items.indexOf(item);
				 int count = _count.get(index).intValue();
				 _count.set(index,Integer.valueOf(count+1));
				 return;
			 }
		 _items.add(item);
		 _count.add(Integer.valueOf(1));
	 }
	 
	 public int totalPrice()
	 {
		   int total = 0;
		   for (int i = 0; i < _items.size(); i++)
		  	 {
		  		 Item item = _items.get(i);
		  		 total += item.getPrice() * _count.get(i).intValue();
		  	 }
		   return total;
	 }
	 
	 private String formatPrice(int cents)
	 {
		 String price = (cents/100)+".";
		 int pennies = cents % 100;
		 if (pennies < 10)
			 price += "0";
		 price += pennies;
		 return price;
	 }
	 
	 public void print()
	 {
		 int i = 0;
	   for (Item item : _items)
	  	 {
	  		 if (_count.get(i).intValue() > 1)
	  			 System.out.print(_count.get(i)+" ");
	  		   System.out.println(item.getName()+" : "+formatPrice(item.getPrice()));
	  		   i++;
	  	 }
	   System.out.println("Total "+formatPrice(totalPrice()));
	 }
	 
   private List<Item> _items;
   private List<Integer> _count;
   
   public static void main(String[] args)
   {
	   Item item = new Item("X",100);
	   Item itemz = new Item("Z",1000);
  	   Receipt r = new Receipt();
  	   r.add(item);
  	   r.add(itemz);
  	   r.add(item);
  	  r.print();
   }
}
