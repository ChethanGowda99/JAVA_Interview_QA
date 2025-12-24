package important_programs.strings_problems;

public class I4_ReverseTheFirstWordInGivenString
{
    public static void main(String[] args) {
        String input="Hello Chethan Hi";
        reversefirstword(input);
    }
    public static void reversefirstword(String input) {
        if (input == null || input.isEmpty())
        {
            System.out.println(" Can't convert the given string");
        }
        else{
           String []  words = input.split(" ",2);
            char []charArray =  words[0].toCharArray();
           int left=0;
           int right=charArray.length-1;
           while(left<right)
           {
               char temp=charArray[left];
               charArray[left]=charArray[right];
               charArray[right]=temp;
               left++;
               right--;
           }
           String result=new String(charArray);
            System.out.println("OG : "+ input);
            System.out.println(result+" "+words[1]);
        }

    }
}
