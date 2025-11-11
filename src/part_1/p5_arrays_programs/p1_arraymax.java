package part_1.p5_arrays_programs;

public class p1_arraymax
{
    public static void main(String[] args)
    {
        int[] marks = {81, 85, 67, 57, 89};
        int max_output = give_max(marks);
        System.out.println(max_output);
    }

        static int give_max(int[] marks)
        {
            int max=0;
          for(int i=0;i<marks.length;i++)
          {
              if(marks[i]>max)
                  max=marks[i];

          }
            return max;
        }

    }

