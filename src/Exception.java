import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exception {
    public static void main(String args[])
    {
        try
        {
            int a=5;
            int b=a/0;
        }
        catch(ArithmeticException e)
        { System.out.println(e);}
    }
}