package important_programs;

import java.util.HashMap;
import java.util.Map;

public class I10_CountFrequencyOfWordsInString {
    public static void main(String[] args) {


        String input = "Hello my name is chethan chethan";
        String inputarray[] = input.split(" ");
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        for (String s : inputarray)
        {
           result.put(s,result.getOrDefault(s,0)+1);

        }
        for(Map.Entry <String,Integer> entry : result.entrySet())
                {
                    System.out.println(entry.getKey()+" "+entry.getValue());
                }


    }
}
