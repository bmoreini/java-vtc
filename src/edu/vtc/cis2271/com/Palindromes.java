package edu.vtc.cis2271.com;
import java.sql.SQLOutput;
import java.util.Scanner;
/*
Write a boolean method called isPalindrome. isPalindrome should
take a string as its input and return true if the string is a palindrome and false if it is not.
Write the main routine to repeatedly ask the user for a string and test it for being a palindrome.
The program should terminate when the user enters an empty string.

ADVANCED for palindromes
Make your test function ignore case (so Racecar is considered a palindrome).
Make your test function ignore spaces and punctuation (so "Dammit I'm mad" is considered a palindrome.
Neither of these changes should destroy the original string.
*/


public class Palindromes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word=null;
        while (!" ".equals(word)){
            word = in.nextLine();
            if (" ".equals(word)) System.out.println("OK.");
            else if (isPalindrome(word)) System.out.println("true");
            else System.out.println("false");
        }
        in.close();
    }

    public static boolean isPalindrome(String word){
        boolean flag = true;
        String comparer = word.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        comparer =  comparer.replaceAll(" ", "");
        int midLine = (int) Math.floor(comparer.length() / 2);
        boolean[] matches = new boolean[midLine];
        for (int schar = 0; schar < (int) Math.floor(midLine); schar++) {
            char source = comparer.charAt(schar);
            char target = comparer.charAt((comparer.length() - 1) - schar);
            if (source == target) matches[schar] = true;
            System.out.println(source + " = " + target + ": " + matches[schar]);
        }
        if (!" ".equals(word)){
            for (int i = 0; i < matches.length; i++) {
                if (matches[i] == false) flag = false;
            }
        }
        return flag;
    }

}
