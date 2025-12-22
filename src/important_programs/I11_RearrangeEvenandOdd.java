package important_programs;

import java.util.Arrays;

public class I11_RearrangeEvenandOdd
{
    public static void main(String[] args)
    {
        int a[]={4,8,10,5,3,1,};
        int left=0;
        int right=a.length-1;
        while(left<right)
        {
        while (left < right && a[left]%2==0) {
            left++;
        }

            while ( left<right && a[right]%2!=0)
            {
                right--;
            }
            if (left<right)
            {
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right++;

            }

            System.out.println(Arrays.toString(a));
        }
        int evenend=0;
        while(evenend<a.length && a[evenend]%2==0)
        {
            evenend++;

        }
      Arrays.sort(a,0,evenend);
        Arrays.sort(a,evenend,a.length);
       // System.out.println(evenend);
        System.out.println("End"+ Arrays.toString(a));

    }
}
