package important_programs.arrays_problems;

import java.util.Arrays;

public class I14_RotateAnArray
{
    public static void main(String[] args)
    {
        int a[] = {1, 2, 3, 4, 5};
        int k=2;
        k=k%a.length;
       a= reverse(a,0,k-1);//reverse the first k elements
        //revesre the remaing part
        a=reverse( a,k,a.length-1);
        //reverse whole array
        a=reverse(a,0, a.length-1);
        System.out.println(Arrays.toString(a));
    }


        public static int[] reverse(int[]a,int left,int right)
        {
            int temp;
            while(left<right)
            {
                temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }
            return a;

        }


}
