import java.util.*;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.toUpperCase;
import static java.lang.Character.toLowerCase;

public class Assignment2 {
    public static void main(String args[])
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=SC.nextLine();
        String str1=" ";
        for(int i=0;i<str.length();i++)
        {
            if(isLowerCase(str.charAt(i)))
            {
                str1=str1+toUpperCase(str.charAt(i));
            }
            else {
                str1=str1+toLowerCase(str.charAt(i));
            }
        }
        System.out.println(str1);
    }
}
