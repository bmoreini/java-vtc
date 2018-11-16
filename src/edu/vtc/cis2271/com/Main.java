package edu.vtc.cis2271;


import java.io.File;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter File Path:");
            String filePath= in.nextLine();
            System.out.println("Contained in "+filePath+": ");
            File f = new File(filePath);
            Path p = f.toPath();
            if (f.isFile()) {
                System.out.println(filePath+" is a file.");
            }
            else if (!f.isFile() && f.isDirectory())
            {
                System.out.println(filePath+" is a folder.");
            }
            else if (f.exists())
            {
                System.out.println(filePath+" does exist.");
            }
            else
            {
                System.out.println("Huh?"+f.getAbsolutePath());
            }
            in.close();
        }
    }
