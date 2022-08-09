import java.util.Arrays;

public class OneArray {
    public static void main(String args[])
    {
        int[] arr = new int[]{ 1,2,3,4,3};
        int sum=0;
        for(int i=0;i<5;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("Length "+arr.length);
        int mean=sum/5;
        System.out.println("mean is "+mean);
        double median=arr[(arr.length)/2];
        System.out.println("Median is "+median);
        int maxVal=0, count=0, maxCount=0;

        for(int i=0;i<5;i++) {
            count = 0;
            for(int j=0;j<5;j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxVal = arr[i];
            }
        }
        System.out.println("Mode is "+maxVal);

    }
}
