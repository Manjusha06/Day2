import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class Assignment1 {
    public static void main(String args[])
    {
        int students, marks, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        students = sc.nextInt();
        System.out.print("Enter total subjects : ");
        marks = sc.nextInt();
        int array[][] = new int[students][marks];
        int sumarray[]  = new int[students];
        for(int i =0; i < students; i++)
        {
            System.out.println("Enter student marks" + (i+1) + " : ");
            for(int j=0; j < marks ; j++)
            {
                array[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < students; i++)
        {
            for (int j = 0; j < marks; j++)
            {
                sum += array[i][j];
            }
            System.out.println("Student " + (i+1) + "= "  + sum);
            sumarray[i] = sum;
            sum = 0;
        }

        for(int i = 0; i<sumarray.length; i++)
        {
            sum += sumarray[i];
            if(sumarray[i] <= 50)
                System.out.println("low performers : student " + (i+1) + " - "+ sumarray[i]);
        }
        System.out.println("overall class average " + sum/students);
        Arrays.sort(sumarray);
        for(int j =0; j< sumarray.length ; j++)
        {
            System.out.println("rank - " + sumarray[j] + " " + (j+1));
        }
    }
}