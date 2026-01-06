package important_programs.strings_problems;

import java.util.LinkedHashSet;

public class I22_Print_Unique_Characters_in_String
{
    public static void main(String[] args) {
        String input="aabbccddeef";
       char []a= input.toCharArray();
        LinkedHashSet<Character> set=new LinkedHashSet<Character>();
        StringBuilder sb=new StringBuilder();
        for(char character:a )
        {
            if (set.add(character))
            {
                sb.append(character);
            }
        }
      // for( char result : set)
      // {
          // sb.append(result);
      // }
        System.out.println(sb);
    }

}
