package part_1.p4_strings_programs;

public class p5_ReverseOnlyLetters {
    public static void main(String[] args)
    {
        String s="1ab2";
                //string to character array
      char []inputarray=  s.toCharArray();
      char temp;
      int left=0;
      int right=inputarray.length-1;
      while(left<right)
      {
          if(! Character.isLetter(inputarray[left]))
          {
              left++;
          }
          if(!Character.isLetter(inputarray[right]))
          {
              right--;

          }
          else
          { //swap
              temp=inputarray[left];
              inputarray[left]=inputarray[right];
              inputarray[right]=temp;
              left++;
              right--;

          }

      }
        System.out.println("Output: "+new String(inputarray));

    }
}
