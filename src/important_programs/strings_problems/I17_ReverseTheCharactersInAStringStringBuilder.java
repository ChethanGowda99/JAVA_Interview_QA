package important_programs.strings_problems;

import java.io.PrintStream;

public class I17_ReverseTheCharactersInAStringStringBuilder {
    public static void main(String[] args) {

        String input = "This is fun";
        String []words=input.split(" ");
        StringBuilder result= new StringBuilder();
        for( String word : words)
        {
            StringBuilder reverseword=new StringBuilder(word);
            result.append(reverseword.reverse().append(" "));
        }
        System.out.println(result.toString().trim());
    }
}
