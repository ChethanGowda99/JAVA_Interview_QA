package part_1.p4_strings_programs;

import java.util.HashMap;

public class p4_FrequencyOfGivenString {

    public static void main(String[] args) {
        String input="madam";
        HashMap<Character,Integer> frequencymap=new HashMap<>();
        char []a=input.toCharArray();

        for(char c:a)
        {
           frequencymap.put(c,frequencymap.getOrDefault(c,0)+1);
        }
       System.out.println(frequencymap);

        for(char key: frequencymap.keySet())
        {
            System.out.println(key+" "+frequencymap.get(key));
        }
    }
}



