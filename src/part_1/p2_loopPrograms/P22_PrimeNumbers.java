package part_1.p2_loopPrograms;

public class P22_PrimeNumbers
{
    public static void main(String[] args)
    {
        System.out.println("Prime numbers between 1 and 100:");
        for(int num=2;num<=100;num++)
        {
            boolean isprime=true;

            for(int i=2;i<=num/2;i++)
            {
                if(num%2==0)
                {
                    isprime=false;
                    break;
                }
            }

            if (isprime)
                System.out.print(num + " ");
        }

    }
}
