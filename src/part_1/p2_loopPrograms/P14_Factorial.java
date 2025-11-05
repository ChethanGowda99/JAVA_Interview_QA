package part_1.p2_loopPrograms;

public class P14_Factorial
{
    public static void main(String[] args)
    {
        int n=5;
        long fact=1;
        for (int i=1;i<=5;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
