package edu.vtc.cis2271;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class FileLab {

	public static void main(String[] args) {
        //C:\Users\bmoreini\Desktop\sample.txt
		Scanner in = new Scanner(System.in);
        System.out.println("Enter File Path:");
        String filePath= in.nextLine();
        System.out.println("Contained in "+filePath+": ");
        File f = new File("filePath");
        Path p = Paths.get("filePath");
        if (f.isFile()) {
        	System.out.println(filePath+" is a file.");
        }
        else if (!f.isFile() && Files.isDirectory(p))
        {
        	System.out.println(filePath+" is a folder.");
        }
        else if (!f.isFile() && !Files.isDirectory(p))
        {
        	System.out.println(filePath+" does not exist.");
        }
        else 
        {
        	System.out.println("Huh?");
        }
        in.close();
	}
	
	/** public static fileSize (f) 
	{
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
	 	 
	        in.close();
		}
		
	}*/
}
