package important_programs.strings_problems;

public class I5_CountUpperAndLowerCaseInString {
    public static void main(String[] args) {
        String input ="ChetHaN";
        countupperandlower(input);
    }

    public static void countupperandlower(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println(" Can't convert the given string");
        } else {


            char[] charArray = input.toCharArray();
            int upper = 0;
            int Lower = 0;
            for (Character temp : charArray) {
                if (Character.isUpperCase(temp)) {
                    upper++;
                } else if (Character.isLowerCase(temp)) {
                    Lower++;
                }


            }
            System.out.println( "No of Upper case :"+upper);
            System.out.println("No of lower case :"+Lower);
        }
    }
}

