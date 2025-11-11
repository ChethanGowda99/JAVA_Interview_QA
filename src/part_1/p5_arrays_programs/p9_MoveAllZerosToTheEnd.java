package part_1.p5_arrays_programs;

public class p9_MoveAllZerosToTheEnd
{
    public static void main(String[] args) {
        int []a={1,0,2,0,3,0};
        int Putnonzerovalue=0;
        int temp=0;
        for( int current=0;current< a.length;current++)
        {
            if(a[current]!=0)
            {
                temp=a[Putnonzerovalue];
                a[Putnonzerovalue]=a[current];
                a[current]=temp;
                Putnonzerovalue++;
            }
        }
        for(int no:a){
            System.out.print(no+" ");

        }

    }
}
