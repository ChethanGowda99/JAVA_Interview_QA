package part_1.p2_loopPrograms;

public class P21_CountDigits
{
    public static void main(String[] args) {
        int num=97435,count=0;

        while(num!=0)
        {
            num/=10;//remove last digit
            count++;// increase counter
        }
        System.out.println("Number of digits:"+count);
    }
}
