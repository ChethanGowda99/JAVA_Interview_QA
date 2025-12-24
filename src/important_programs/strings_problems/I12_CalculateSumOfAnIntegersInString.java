package important_programs.strings_problems;

public class I12_CalculateSumOfAnIntegersInString {
    public static void main(String[] args) {
        String input = "This is 1000 and it should be 20 30 40 50 and 100";
        String[] words = input.split(" ");
        int sum = 0;
        for (String word : words) {
            try {
                int value = Integer.parseInt(word);
                sum = sum + value;
            }
            catch (NumberFormatException e)
            {
               
            }

        }
        System.out.println(sum);

    }
}
