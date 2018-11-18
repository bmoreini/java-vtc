package edu.vtc.cis2271;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.ZoneId;

public class Filefind {

        public static void main(String[] args) {
            // C:\Users\Bram\Desktop\sample.txt
        	Scanner in = new Scanner(System.in);
            System.out.println("Enter File Path:");
            String filePath= in.nextLine();
            in.close();
            File f = new File(filePath);
            System.out.println("Contained in "+f.getParent()+": ");
            if (f.isFile()) {
            	System.out.print(fileInfo(f));
                
            }
            else if (!f.isFile() && f.isDirectory())
            {
                System.out.println(f.getName()+" is a folder containing ");
                folderFiles(f);
            }
            else
            {
                System.out.println(f.getAbsolutePath()+" does not exist.");
            }
            // Process Path
        }
        
        public static String fileInfo(File f) {
        	String message;
            String fileName = f.getName();
            String extension = "none";
            if(fileName.lastIndexOf(".") > 0)
            extension = fileName.substring(fileName.lastIndexOf(".")+1);
            String fileType="is an unknown file type.";
            if (numLines(f)==0) {
            	message=f.getName()+ "is empty or unreadable";
            }
            else {
            switch (extension) 
	            {
	            	case "txt": message = f.getName()+ " is a text file with "+f.length()+ " bytes last modified "+ fileLastModified(f);
	            	break;
	            	case "java": message = f.getName()+ " is a java source file with "+numLines(f)+" lines.";
	            	break;
	            	case "class": message  = f.getName()+ " is a java class file with "+numLines(f)+" lines.";
	            	break;
	            	default: message = f.getName()+" is an unknown file type.";
	            	break;
	            }
            }
            return message;
        }
	
	        
    	public static int numLines(File f)
    	{
    		try
    			{
    				int numLines = 0;
    				BufferedReader rdr = new BufferedReader(new FileReader(f));
    				while (rdr.readLine() != null)
    			  	{
    			  		numLines++;
    			  	}
    				return numLines;
    			}
    		catch (IOException e)
    			{
    				e.printStackTrace();
    				return 0;
    			}
    	}
    	
    	public static String fileLastModified(File f)
    	{
    		String message="";
    		SimpleDateFormat sdf = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy");
    		message=(sdf.format(f.lastModified()));
    	    return message;
    	}
    	
    	public static void folderFiles(File f)
    	{
    		File[] filesList = f.listFiles();
    		for (int i = 0; i < filesList.length; i++) {
    			  if (filesList[i].isFile()) {
    				  System.out.println("    " + filesList[i] + fileInfo(filesList[i]));
    			  } 
    			  else if (filesList[i].isDirectory()) 
    			  {
    				  System.out.println("    " + filesList[i].getName()+" is a folder containing ");
    				  folderFiles(filesList[i]);
    			  }
    			}
    	}
    	
}