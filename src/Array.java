package Day2;

import java.util.*;
public class Array {
    public static void main( String args[])
    {
        int marks[] ={10,20,30,50,70,60,100 };
        int max=0;
        int min=marks[0];
        for(int i =0; i<marks.length;i++)
        {
            if(marks[i]>max)
            {
                max=marks[i];
            }
        }
        for(int i =0; i<marks.length;i++)
        {
            if(marks[i]<min)
            {
                min=marks[i];
            }
        }
        System.out.println("Maximum marks " +max);
        System.out.println("Minimum marks " +min);
    }
}