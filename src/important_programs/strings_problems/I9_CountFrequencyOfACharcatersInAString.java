package important_programs.strings_problems;

import java.util.HashMap;
import java.util.Map;

public class I9_CountFrequencyOfACharcatersInAString {
    public static void main(String[] args) {
        String input = "Hello";
        HashMap<Character, Integer> result = new HashMap<Character, Integer>();
        char[] datarray = input.toCharArray();
        for ( Character c:datarray)
        {
            result.put(c,result.getOrDefault(c,0)+1);
        }
        for(Map.Entry< Character,Integer> entry :result.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());

        }

    }
}

