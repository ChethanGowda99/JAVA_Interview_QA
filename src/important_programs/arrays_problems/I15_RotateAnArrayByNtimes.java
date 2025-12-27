package important_programs.arrays_problems;

import java.util.Arrays;

public class I15_RotateAnArrayByNtimes
{
    public static void main(String[] args)
    { int a[]={1,2,3,4,5,6,7,};
        int k=3;
       k=k%a.length;
       //reverse whole array
       reverse(a,0, a.length-1);
       //reverse 2nd time
        reverse(a,0, k-1);
        //reverse 3rd time
        reverse(a,k, a.length-1);
        System.out.println(Arrays.toString(a));

    }

    public static int[] reverse(int []a,int left, int right)
    {
        while (left<right)
        {
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
        return a;
    }
}
