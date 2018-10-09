package edu.vtc.cis2271.com;
import java.util.Scanner;

public class pProbs {
    /**
     * Public Assignment 2 P Problems
     *
     * @param
     * @return
     */

    public static void main(String[] args) {
        // CRAIG: Uncomment to test.
        // pp4p4();
        // p6p2();
        p6p14();
    }

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

    public static void p6p2() {  // p 6.2
        // Write a program that generates a sequence of 20 random die tosses
        // in an array and that prints the die values, marking only the longest run, like this:
        // 1 2 5 5 3 1 2 4 3 (2 2 2 2) 3 6 5 5 6 3 1
        // If there is more than one run of maximum length, mark the first one.
        // NOTE: Many methods used here!  This was a BEAR for me. ((0 0))
        int rolls = 20; // array length
        int[] a = new int[rolls]; //array
        int[] longRun = new int[2]; //array
        // populate array
        for (var roll = 0; roll < rolls; roll++) {
            a[roll] = (int) (Math.floor(Math.random() * 6) + 1);
        }
        // print array for testing
        printArray(a);

        // find longest run and start point, store in longRun
        System.arraycopy(findRun(a), 0, longRun, 0, 2);

        // print longRun values for testing
        printArray(longRun);

        // put longest run in parentheses
        for (var roll = 0; roll < rolls; roll++) {
            // check if first in run
            if ((longRun[0]>1)&&(roll == longRun[1])) {
                System.out.print("(");
            }
            // print roll value
            System.out.print(a[roll]);
            // check if last in run
            if ((longRun[0]>1)&&(roll == longRun[1] + longRun[0] - 1)) {
                System.out.print(")");
            }
        }
    } // end p6.2

    public static void printArray(int[] a) {
        for (var roll = 0; roll < a.length; roll++) {
            if (roll == a.length - 1) {
                System.out.print(a[roll]);
            } else {
                System.out.print(a[roll] + " ");
            }
        }
        System.out.println();
    }

    public static int[] findRun(int[] a) {
        int[] longRun = new int[2]; //create array of run, start place
        longRun[0] = 1; // longest run is stored as 1 to start
        for (int i = 1; i < a.length; i++) { // iterate over array indices to find matches
            for (int run = 1; run < i+1; run++) { // check for longer runs than stored value up to index
                if (a[i]!= a[i-run+1]) {
                    break; // no greater run
                }
                //else if ((run>longRun[0]) && (a[i] == a[i-run+1])) {
                else if (run>longRun[0]) {
                    longRun[1] = i-run+1; // where start
                    longRun[0]=run; // how long
                    //System.out.println("Longest run now is " + longRun[0] + " starting at " + longRun[1]);
                }
            } // end run counting
        } // end loop iterations
        return longRun;
    }

    public static void p6p14() {
    /*P6.14
    You are given a two-dimensional array of values that give the height of a terrain at different points
    in a square. Write a method public static void floodMap(double[][] heights, double waterLevel) that prints
    out a flood map, showing which of the points in the terrain would be flooded if the water level was the given
    value. In the flood map, print a *for each flooded point and a space for each point that is not flooded.
    */
        System.out.println("Starting... ");
        // define array
        int side=10;
        double[][] heights = new double [side][side];
        double waterLevel=1.0;
        // populate array from method
        for (int i = 0; i < makeMap().length; i++) {
            System.arraycopy(makeMap()[i], 0, heights[i], 0, makeMap()[0].length);
        }
        // print flood map
        floodMap(heights,side,waterLevel);

        // read one hundred terrain height values and shows how the terrain gets flooded
        // when the water level increases in ten steps from the lowest point in the terrain to the highest.
        noYouDoIt();
    }

    public static double[][] makeMap() {
        int side = 10;
        double[][] heights = {
                {1, 1, 1, 1, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 0, 0, 0, 1, 1},
                {1, 1, 1, 1, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 0, 0, 0, 0, 0, 1, 1},
                {1, 1, 1, 1, 0, 0, 1, 0, 1, 1},
                {1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
                {1, 1, 0, 0, 0, 0, 0, 0, 1, 1},
                {1, 0, 0, 0, 0, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1}
        };
        return heights;
    }
    public static void floodMap(double[][]heights, int side, double waterLevel) {
        for (var i = 0; i < side; i++) {
            for (var j = 0; j < side; j++) {
                if (heights[i][j]>= waterLevel)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void noYouDoIt(){
        System.out.println("That's not going to happen this evening!");
    }
    }
