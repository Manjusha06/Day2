public class Exception1 {
        public static void main(String[] args)
        {
            try{
                int arr[]={1,2,3,4,5};
                for(int i=0;i<=5;i++)
                {
                    System.out.println(arr[i]);
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            { System.out.println(e);}
            finally {
                System.out.println("Hello");
            }
        }
    }

