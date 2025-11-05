package part_1.p4_strings_programs;

public class p1_LengthOfLastWordInTheString
{
    public static void main(String[] args)
    {
        String s="  Hi   Chethan ";
        s=s.trim();
        System.out.println(s);
     char inputArray[] =s.toCharArray();
     int count=0;
     for(int i=inputArray.length-1;i>=0;i--)
     {
         if(inputArray[i]!=' ')
         {
             count++;
         }
         else {
             if(count>0)
             {
                 System.out.println(count);
                 break;
             }
         }
     }

    }
}
