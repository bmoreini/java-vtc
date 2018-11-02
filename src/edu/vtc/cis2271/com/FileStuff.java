/**
 * FileStuff.java
 * Copyright 2016, Craig A. Damon
 * all rights reserved
 */
package edu.vtc.cis2271;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * FileStuff - description
 * @author Craig A. Damon
 *
 */
public class FileStuff
{
	public static long printFileInfo(File f)
	{
		long size = f.length();
		System.out.println(f.getName() +" has "+size+" bytes");
		return size;
	}
	
	public static int countLines(File f)
	{
		try
			{
				int numLines = 0;
				BufferedReader rdr = new BufferedReader(new FileReader(f));
		/*	  while (true)
			  	{
			  		if (rdr.readLine() == null)
			  			return numLines;
	  			  numLines++;
			  	}
			  	*/
				while (rdr.readLine() != null)
			  	{
			  		numLines++;
			  	}
				return numLines;
			}
		catch (FileNotFoundException e)
			{
				return 0;
			}
		catch (IOException e)
			{
				e.printStackTrace();
				return 0;
			}
	}
	
	public static String longestLine(File f) throws IOException
	{
		BufferedReader rdr = new BufferedReader(new FileReader(f));
		String longest = "";
		String line;
		while ((line = rdr.readLine()) != null)
			{
				if (line.length() > longest.length())
					longest = line;
			}
		return longest;
	}
	

	public static int[] lineLengths(File f) throws IOException
	{
		BufferedReader rdr = new BufferedReader(new FileReader(f));
		int[] lengths = new int[countLines(f)];
		String line;
		for (int i = 0; i < lengths.length; i++)
			{
				lengths[i] = rdr.readLine().length();
			}
		return lengths;
	}

	public static void main(String[] args)
   {
  	 File f = new File("sample.txt");
		 long size = printFileInfo(f);
  	 System.out.println("Call returned "+size);
  	 int count = countLines(f);
  	 System.out.println("File "+f+" has "+ count+" lines");
  	 try
			{
				String longest = longestLine(f);
				System.out.println("Longest line in "+f+" is \""+longest+"\"");
				int[] lineLengths = lineLengths(f);
				System.out.println("Lengths are "+Arrays.toString(lineLengths));
			}
		catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
  	 
   }

}
