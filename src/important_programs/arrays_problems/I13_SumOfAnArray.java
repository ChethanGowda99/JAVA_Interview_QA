package important_programs.arrays_problems;

public class I13_SumOfAnArray
{
    public static void main(String[] args) {

        int a[]={ 4,5,10,3,7};
        int sum=0;
        for( int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println(sum);
        int totalnoofelements=a.length;
        double avg=((double)sum/totalnoofelements);
        System.out.println(avg);
    }
}
