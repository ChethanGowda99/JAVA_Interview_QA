package important_programs;

public class I6_SecondLargrestNoInGivenString
{
    public static void main(String[] args)
    {
        String input="abc321";
        char [] data=input.toCharArray();
        int first=-1;
        int second=-1;
        for(char character : data)
        {
            //convert to digits
            if (Character.isDigit(character))
            {
                //convert char to int
               int number=character-'0';
               //to find second largest no
               if( number>first)
               {
                   second=first;
                   first=number;
               }
               else if (number>second && number<first)
               {
                   second=number;
               }

            }

        }
        System.out.println(second);


    }
}
