package part_1.p2_loopPrograms;

public class P12_EvenOddRange
{
    public static void main(String[] args)
    { int start=1;
        int end=20;
        System.out.println("Even Number:");
        for(int i=start;i<=end;i++)
        {
            if(i%2==0){
                System.out.println(i+"");
            }

        }
        System.out.println("Odd Number:");
        for(int i=start;i<=end;i++)
        {
            if(i%2 !=0)
            {
                System.out.println(i+"");
            }

        }


    }
}

