import java.util.Scanner;

/*
 *  A. Write a class with a simple main that reads a string from the user.  Once the string has been read,
 *  attempt to convert it to an integer, using Integer.parseInt().  Use the single argument form of parseInt
 *  to convert the String to a decimal.  
 *  
 *  If the string represents a valid decimal integer, compare to a test value called solution. 
 *  
 *  If the string does not represent a valid decimal integer, check if the string is equal to "stop". 
 *  
 *  If the string is not equal to "stop", your code should tell the user to try again. 
 *  
 *  For information about parseInt, see: http://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html
 *  To solve this problem, you will need to catch the appropriate exception if the conversion fails.
 */

public class ParseInput
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("4 * 3 = ?  Enter \"stop\" to stop.");
        String input = in.nextLine();
        in.close();
        try {
        	convertInt(input);
        }
        catch (NumberFormatException e)
        {
            if(input.equals("stop")) {
            	System.out.print("They want to stop");
            }
            else {
            	throw new NumberFormatException("This isn't a number.");
            }
        } 
        
    }

    public static void convertInt(String s) throws NumberFormatException
    {
            int n = Integer.parseInt(s);
            System.out.println("Your integer is " + n);
    }

}
