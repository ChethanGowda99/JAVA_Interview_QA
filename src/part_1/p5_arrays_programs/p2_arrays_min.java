package part_1.p5_arrays_programs;

public class p2_arrays_min
{
    public static void main(String[] args) {
        int[] marks = {81, 85, 67, 57, 89};
        int min_output = give_min(marks);
        System.out.println(min_output);
    }

    static int give_min(int[] marks)
    {
        int min=marks[0];
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]<min)
                min=marks[i];

        }
        return min;
    }

}
