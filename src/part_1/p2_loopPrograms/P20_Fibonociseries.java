package part_1.p2_loopPrograms;

public class P20_Fibonociseries
{
    public static void main(String[] args)
    {
        //Each number is the sum of the previous two numbers

        int n1=0,n2=1,n3;
        int count =10;// how many numbers to print
        System.out.print(n1 + " " + n2); // print first two
        for(int i=2;i<count;i++)
        {
            n3=n1+n2;//next term
            System.out.print(" " + n3);
            n1 = n2;           // shift numbers
            n2 = n3;
        }


    }
}
