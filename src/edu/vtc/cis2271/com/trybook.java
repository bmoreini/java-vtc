package edu.vtc.cis2271.com;

public class trybook {
    public static void main(String[] args)
    {
        double sum = 0;
        int i;
        for (i = 0; i < 10; i++)
        {
            sum = sum + i % 3;
        }
        System.out.println(sum / i);
    }
}
