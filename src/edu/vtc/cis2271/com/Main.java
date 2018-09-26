package edu.vtc.cis2271.com;
import java.util.Scanner;
public class Main {
    // this is a method

    public static void additup(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of values");
        int n= in.nextInt();
        System.out.print("Enter the "+n+" values:");
        int[] a = new int[n];
        for (int i=0; i < n; i++)
            a[i]=in.nextInt();
        int total = 0;
        for (int i=0; i < a.length; i++)
            total += a[i];
        System.out.print("The total is "+total);

        in.close();
    }

    public static void main(String[] args) {
        int items = 2;
        double total;
        total = pricer(items);
        System.out.println("Amount due: $" +total);
    }

    public static double pricer(int items)
    {
        Scanner in = new Scanner(System.in);
        double price = 0;
        for (int item=1;item<items+1;item++) {
            System.out.print("Item " + item + ": $");
            price+=in.nextDouble();
            }
        System.out.print("Tax rate: ");
        double rate = in.nextDouble();
        rate=Math.round(rate * 1000 ) / 1000.0;
        System.out.println("Tax rate in percent: "+rate*100);
        double tax = Math.round(price * rate*100)/100;
        return (price + tax);
    }
}
