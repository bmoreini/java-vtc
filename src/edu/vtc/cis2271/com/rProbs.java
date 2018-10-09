package edu.vtc.cis2271.com;

public class rProbs {
    public static void main(String[] args) {
        // r4p2();
        // r4p13();
        // r4p30();
        // r6p3();
        // r6p23();
    }

    /**
     * Public Assignment 2 R Problems
     *
     */

    public static void r4p2() {
        /* R 4.2 a Output:
         *
         * 0 10
         * 1 9
         * 2 8
         * 3 7
         * 4 6
         *
         * R 4.2 b Output:
         *
         * i will always be less than j
         * So will count from 10 up by 2s
         */

    }

    public static void r4p13() {
        /* How many iterations do the following loops carry out?
         * Assume that i is not changed in the loop body.
         * a. for (int i = 1; i <= 10; i++):
         * 10 (1 to 10)
         * b. for (int i = 0; i < 10; i++):
         * 10 (0 to 9)
         * c. for (int i = 10; i > 0; i--):
         * 10 (10 to 1)
         * d. for (int i = -10; i <= 10; i++):
         * 21 (-10 to 10)
         * e. for (int i = 10; i >= 0; i++):
         * Infinite 10,11,12 ...
         * f. for (int i = -10; i <= 10; i = i + 2):
         * 11 (-10 to 10 by 2)
         * g. for (int i = -10; i <= 10; i = i + 3):
         * 7 (-10 to 8 by 3)
         */
    }

    public static void r43p0() {
        int height = 3;
        int width = 4;
        for (int i = 1; i <= height * width; i++) {
            System.out.print("*");
            if ((i % width) == 0) {
                System.out.println();
            }
        }
    }

    public static void r6p3() {
        /* Consider the following array:
         * int[] a = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 0 };
         * What is the value of total after the following loops complete?
         *
         * a. int total = 0;
         * for (int i = 0; i < 10; i++) { total = total + a[i]; }
         * total = 25
         *
         * b. int total = 0;
         * for (int i = 0; i < 10; i = i + 2) { total = total + a[i]; }
         * total = 13
         *
         * c. int total = 0;
         * for (int i = 1; i < 10; i = i + 2) { total = total + a[i]; }
         * total = 12
         *
         * d. int total = 0;
         * for (int i = 2; i <= 10; i++) { total = total + a[i]; }
         * total is out of bounds at 10 (indices 0 to 9 only - last value = 22)
         *
         * e. int total = 0;
         * for (int i = 1; i < 10; i = 2 * i) { total = total + a[i]; }
         * total = 11
         *
         * f. int total = 0;
         * for (int i = 9; i >= 0; i--) { total = total + a[i]; }
         * total = 25
         *
         * g. int total = 0;
         * for (int i = 9; i >= 0; i = i - 2) { total = total + a[i]; }
         * total = 12
         *
         * h. int total = 0;
         * for (int i = 0; i < 10; i++) { total = a[i] - total; }
         * total = -1
         */
    }

    public static void r6p23() {
        /* A run is a sequence of adjacent repeated values.
         * Give pseudocode for computing the length of the longest run in an array.
         * For example, the longest run in the array with elements
         * 1 2 5 5 3 1 2 4 3 2 2 2 2 3 6 5 5 6 3 1
         * has length 4.
         */
        // pseudocode
        /* Loop through array index i  from 1 to index < array length
         * Loop through run from 1 to array length
         * Break inner loop if value of array[index] not equal to array[index-run+1]
         * If run is greater than longRun set longRun = run and set longIndex equal to i
         * Print out index and run when outer loop ends
         */
        // code
        int longRun = 1;
        int longIndex = 0;
        int[] a = {1, 5, 5, 5, 5, 5, 5, 5, 2, 3, 6, 5, 5, 6, 3, 1};
        for (int i = 1; i < a.length; i++) { // iterate over array
            for (int run = 1; run < a.length; run++) { // count matches
                if (a[i] != a[i - run + 1]) {
                    break; // if array index value does not match start of run
                }
                if (run > longRun) {
                    longRun = run;
                    longIndex = i;
                }
            } // end count
        } // end loop interations
        System.out.println("Longest run = " + a[longIndex] + " with a run of " + longRun);
    } // end method
}
