package edu.vtc.cis2271.com;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("End Fibs where?");
        int lastFib= input.nextInt();
        int[] fibVal = new int[]{ 1,1,2 };
        int[] fibN = new int[lastFib];
        for (int i =0; i<3;i++) {
            fibN[i]=fibVal[i];
        }
        for (int i=3 ; i<fibN.length;i++) {
            fibN[i]=fibN[i-1]+fibN[i-2];
        }
        System.out.println(Arrays.toString(fibN));
        System.out.println("Value of Fib "+lastFib+" is "+fibN[lastFib-1]);
        input.close(); }
}

