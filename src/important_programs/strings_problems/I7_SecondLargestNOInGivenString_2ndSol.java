package important_programs.strings_problems;

import java.util.TreeSet;

public class I7_SecondLargestNOInGivenString_2ndSol {

    public static void main(String[] args) {
        String input = "abjhgc32198766";
        char[] data = input.toCharArray();
        TreeSet<Integer> dataset=new TreeSet<Integer>();
        for (char character : data)
        {
            //convert to digits
            if (Character.isDigit(character)) {
                //convert char to int
                int number = character - '0';
                dataset.add(number);

            }
        }
        System.out.println(dataset);
         dataset.pollLast();
        System.out.println(dataset);
        System.out.println(dataset.last());
    }
}

