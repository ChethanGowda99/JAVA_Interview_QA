package part_1.p2_loopPrograms;

public class P17_ReversOfaNumber
{
    public static void main(String[] args) {
        int num=1234,rev=0,rem=0;
        while(num>0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num/=10;

        }
        System.out.println("Reverse Of a Number:"+rev);
    }
}
