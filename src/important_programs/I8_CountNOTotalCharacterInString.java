package important_programs;

public class I8_CountNOTotalCharacterInString
{
    public static void main(String[] args) {
        String input = " Hie ";
        int count = 0;
        char[] datarray = input.toCharArray();
        for (int index = 0; index < datarray.length; index++)
        {
            if (datarray[index] == ' ')
            {
                continue;

            }
            boolean whitespaceafter = ((index < datarray.length - 1) && datarray[index + 1] == ' ');
            boolean whitespacebefore = ((index > 0) && datarray[index - 1] == ' ');
            if (!whitespaceafter == !whitespacebefore)
            {
                count++;
            }


        }
        System.out.println(count);

    }


}
