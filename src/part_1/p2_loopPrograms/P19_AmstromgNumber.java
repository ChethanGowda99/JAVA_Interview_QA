package part_1.p2_loopPrograms;

public class P19_AmstromgNumber
{
    public static void main(String[] args)
    {
        int num=153,temp=num,sum=0;
        while(num>0)
        {
            int digit = num%10;
            sum=sum+digit*digit*digit;
            num/=10;
        }
        if (sum == temp)
        {
            System.out.println("Amstrong Number");
        } else {
            System.out.println("Is not a Amstrong Number");
        }


    }
}
