package edu.vtc.cis2271;
import java.util.Scanner;

/*
 *  A. Write a class with a simple main that reads a string from the user.  Once the string has been read,
 *  attempt to convert it to an integer, using Integer.parseInt().  Use the single argument form of parseInt
 *  to convert the String to a decimal.  If the string represents a valid decimal integer, print the value.
 *  If the string does not represent a valid decimal integer, your code should tell the user this.
 *  For information about parseInt, see: http://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html
 *  To solve this problem, you will need to catch the appropriate exception if the conversion fails.
 *
 *  B. Extend your class, and attempt to print the string as a binary and hexadecimal value.
 *  Again, if the string can not be converted to the appropriate base, catch the exception and report an
 *  appropriate error to the user.
 */

public class String2Int
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Choose i (integer), b (binary) or h (hexadecimal):");
        String sFormat = in.nextLine();
        System.out.print("Enter string for conversion:");
        String s = in.nextLine();
        // switch statement with int data type
        try {
            switch (sFormat) {
                case "i":
                    convertInt(s);
                    break;
                case "b":
                    convertBin(s);
                    break;
                case "h":
                    convertHex(s);
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        }

        catch (NumberFormatException e)
        {
            throw new NumberFormatException("The characters you entered did not match the conversion format.");
        }

         catch (IllegalArgumentException e)
        {
            throw new IllegalArgumentException("Conversion format not one of i, b or h.");
        }

    }

    public static void convertInt(String s) throws NumberFormatException
        {
            int n = Integer.parseInt(s);
            System.out.println("Your integer is " + n);
        }

    public static void convertBin(String s) throws NumberFormatException
        {
            int n = Integer.parseInt(s,2);
            System.out.println("Your binary value is " + n);
        }

    public static void convertHex(String s) throws NumberFormatException
        {
            int n = Integer.parseInt(s, 16);
            System.out.println("Your hexadecimal value is " + n);
        }

}

