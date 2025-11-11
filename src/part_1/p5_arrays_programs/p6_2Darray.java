package part_1.p5_arrays_programs;

public class p6_2Darray
{
    public static void main(String[] args)
    {
        int[][] array2d={ {1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i< array2d.length;i++)
        {
            for (int j = 0; j < array2d[i].length; j++)
            {
                System.out.print(array2d[i][j]);
            }
            System.out.println();
        }

    }
}
