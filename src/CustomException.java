import java.util.*;
public class CustomException {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int age;
        age = sc.nextInt();
        try {
            if (age < 25) {
                throw new Exception("Age should be greater than 25");
            }
            System.out.println("Candidate is selected");
        } catch (Exception e) {
            System.out.println(e + "Candidate Application Cancelled");
        }
    }
}