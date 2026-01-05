package important_programs.strings_problems;

public class I19_Decoding_string
{
    public static void main(String[] args) {
        String input="d2m4t2b0a1";

        StringBuilder result=new StringBuilder();
        for(int i=0;i<input.length();i=i+2)
        {
            char letter=input.charAt(i);
            int value=Character.getNumericValue(input.charAt(i+1));
            for(int j=0;j<value;j++)
            {
                result.append(letter);
            }
        }
        System.out.println(result);
    }
}
