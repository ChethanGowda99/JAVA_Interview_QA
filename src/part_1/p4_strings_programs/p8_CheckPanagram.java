package part_1.p4_strings_programs;

import java.util.HashSet;

public class p8_CheckPanagram {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
      boolean result  =check(input);
      if(result)
      {
          System.out.println(" it is a panagram");
      }
      else {
          System.out.println(" it is not a panagram");

      }

    }

    private static boolean check(String input) {
        HashSet<Character> characterset = new HashSet<>();
        char[] inputchar = input.toLowerCase().toCharArray();
        for (char c : inputchar) {
            if (Character.isLetter(c)) {
                characterset.add(c);
            }
        }
            if (characterset.size() == 26)
            {
                return true;
            }
            return false;
        }

    }




