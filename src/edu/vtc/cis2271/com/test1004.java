package edu.vtc.cis2271.com;

public class test1004 {

    public static void main(String[] args) {
        System.out.println("i =" + l3());
    }

    public static int l3()
        {
        int i=0;
        while (i<12)
            {
                int j;
                for (j=0;j<i;j++)
                {
                    if ((i+j)%3  == 0)
                        j+=2;
                }
                i+=j+1;
            }
        return i;
    }

}
