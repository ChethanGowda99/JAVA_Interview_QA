package part_1.p5_arrays_programs;

public class p7_MissingNumberOfAnArray {

    public static void main(String[] args) {
        int number[]={1,2,4,5,6};
        int totalnumbers=6;
        int totalsumofnumbers=totalnumbers*(totalnumbers+1)/2;
        System.out.println(totalsumofnumbers);
        int sum=0;

        for(int i=0;i<number.length;i++)
        {
            sum=number[i]+sum;
        }
        System.out.println(sum);
        System.out.println("The missing number : "+(totalsumofnumbers-sum));

    }
}

