package edu.vtc.cis2271.com;

public class classwork1002 {
    public static void main(String[] args) {
        System.out.println(trickyBoom(5));
        int[] values = {1, 4};
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {4, 3, 2, 1};
        // System.out.println("Sum = "+some(values));
        // System.out.println("Average = "+aversome(values)); // why not 2.5
        //System.out.println(difArray(array1,array2));
    }

    public static int some(int[] values) {
        int total = 0;
        for (int i = 0; i < values.length; i++) {
            total += values[i];
        }
        return total;
    }

    public static double aversome(int[] values) {
        double average = some(values) / (double) values.length;
        return average;
    }

    public static int difArray(int[] array1, int[] array2) {
        int difSum = 0;
        for (int i = 0; i < array2.length; i++) {
            difSum += (array1[i] - array2[i]) * (array1[i] - array2[i]);
        }
        return difSum;
    }

    public static void tickBoom(int ticks) {
        for (int i = 1; i < ticks + 1; i++) {
            System.out.println("Tick");
        }
        System.out.println("Boom!");
    }

    public static String trickyBoom(int ticks) {
        if (ticks > 0) {
            System.out.println("tick");
            trickyBoom(ticks - 1);
        }
        return "Boom";
    }
}
