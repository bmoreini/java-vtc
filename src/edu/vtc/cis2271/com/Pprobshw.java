package edu.vtc.cis2271.com;
import java.lang.Math;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Pprobshw {

    /**
     * Public Assignment 2 P Problems
     *
     * @param none
     * @return
     */
    public static void p4p4() {
        // Write a program that asks the user for an integer and then prints out all its PRIME factors.
        int myFactors;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter integer to find factors: ");
        myFactors = in.nextInt();
        // Pull factors of 2
        while (myFactors % 2 == 0) {
            System.out.println(2);
            myFactors = myFactors / 2;
        }
        // Find odd factors
        for (int i = 3; i <= Math.sqrt(myFactors); i = i + 2) {
            while (myFactors % i == 0) {
                System.out.println(i);
                myFactors = myFactors / i;
            }
        }
        // List last factor
        if (myFactors > 2) {
            System.out.print(myFactors);
        }

    }

    public static void p6p2() {
        // Write a program that generates a sequence of 20 random die tosses
        // in an array and that prints the die values, marking only the longest run, like this:
        // 1 2 5 5 3 1 2 4 3 (2 2 2 2) 3 6 5 5 6 3 1
        // If there is more than one run of maximum length, mark the first one.
        int rolls = 20; // array length
        int[] a = new int[rolls]; //array
        int run=1; // longest run
        // populate array
        for (var roll = 0; roll < rolls; roll++) {
            a[roll] = (int) (Math.floor(Math.random() * 6) + 1);
        }
        // print array for testing
        for (var roll = 0; roll < rolls; roll++) {
            if (roll==rolls-1) {
                System.out.print(a[roll]);
            }
            else {System.out.print(a[roll] + " ");}
        }
        System.out.println("");
        // put longest run in parentheses
        for (var roll = 0; roll < rolls; roll++) {
            // check if start of longest roll and return run if so
            run=checkRunStart(roll, a, run);
            // check if last element
            if (roll==rolls-1) System.out.print(a[roll]);
            else System.out.print(a[roll] + " ");
            // check if last element of run
            checkRunEnd(roll, a, run);
        }
    }

    public static int checkRunStart(int roll,int [] a, int run) {
        int runstart = run;
        boolean runover = false;
        if (roll < 19) {
            while (runover == false) {
                if (a[roll] == a[roll + run]) {
                    if (a[roll] == a[roll + run + 1]) {
                        run++;
                    } else {
                        runover = true;
                    }
                }
                if (run > runstart) {
                    System.out.print("( ");
                }
            }
        }
        return run;
    }

    public static void checkRunEnd(int roll, int [] a, int run){
        if (a[roll-run+1]==a[roll]) {
            System.out.print(") ");
        }
    }
}
