package important_programs.arrays_problems;

import java.util.Arrays;

public class I21_Max_Product_Of_tripplets
{
    public static void main(String[] args)
    {
        int a[]={-10,-3,5,6,-20};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int max1=0;
        int max2=0;
        int max3=0;
        for (int no : a)
        {


          if ( no>max3)
          {
              max1=max2;
              max2=max3;
              max3=no;
          }
          if ( no>max2)
          {
              max1=max2;
              max2=no;
          }
            if ( no>max1)
            {

                max1=no;
            }
        }
        int result=max1*max2*max3;
        System.out.println(result);

    }
}
