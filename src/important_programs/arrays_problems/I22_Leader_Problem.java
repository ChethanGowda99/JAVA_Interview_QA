package important_programs.arrays_problems;

public class I22_Leader_Problem
{
    public static void main(String[] args)
    {
        int a[]={16,17,4,3,5,2};
        int length=a.length;
        int maxright=a[length-1];
        System.out.println(maxright);
        //revere traversing
        for(int index=length-2;index>=0;index--)
        {
            if ( a[index]>maxright)
            {
                maxright=a[index];
                System.out.println(maxright);
            }
        }


    }
}
