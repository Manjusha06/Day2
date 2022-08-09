public class Holiday {
    private String name;
    private int day;
    private String month;
    Holiday(String name , int day , String month)
    {
        this.name=name;
        this.day=day;
        this.month=month;
    }
    public static boolean inSameMonth(Holiday h,Holiday h1)
    {
        if((h.month).equals(h1.month))
        {
            return true;
        }
        else {
            return false;
        }

    }

    public static double avgDate(Holiday[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum = sum + array[i].day;
        }
        return ((double) sum)/array.length;
    }
    public static void main(String args[])
    {
        Holiday h=new Holiday("Independence day",4,"july");
        Holiday h1=new Holiday("Independence day",4,"july");
        Holiday[] array=new Holiday[2];
        array[0]=h;
        array[1]=h1;
        System.out.println(inSameMonth(h,h1));
        System.out.println(avgDate(array));




    }


}
