import java.util.Scanner;
import java.lang.Math;;
public class Assignment4 {
    public static void main(String args[]) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter Weight 1");
        float weight1 = SC.nextInt();
        if (weight1 > 15) {
            try {
                throw new Exception("Total weight is more than 15kgs, ");
            } catch (Exception e) {
                System.out.println(e + "it should not exceed 15kgs");
            }
            float difference = Math.abs(15 - weight1);
            float extra_amount = difference * 100;
            System.out.println("there is an overweight of " + difference + " kgs " + "please pay rupees " + extra_amount + " for checkin");
        } else {
            System.out.println("Please enter for checkin");
        }
        System.out.println("Enter Weight 1");
        float weight2 = SC.nextInt();
        if (weight2 > 15) {
            try {
                throw new Exception("Total weight is more than 15kgs, ");
            } catch (Exception e) {
                System.out.println(e + "it should not exceed 15kgs");
            }
            float difference =Math.abs(15 - weight2);
            float extra_amount = difference * 100;
            System.out.println("there is an overweight of " + difference + " kgs " + "please pay rupees " + extra_amount + " for checkin");
        } else {
            System.out.println("Please enter for checkin");
        }
    }
}
