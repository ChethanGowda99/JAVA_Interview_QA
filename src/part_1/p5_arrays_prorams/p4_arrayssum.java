package part_1.p5_arrays_prorams;

public class p4_arrayssum
{
    public static void main(String[] args) {
        int [] numbers={1,2,3,4,5};
        int sum=0;
        for(int i=numbers.length-1;i>=0;i--)
        {
           sum+=numbers[i];
        }
        System.out.println(sum);
    }
}