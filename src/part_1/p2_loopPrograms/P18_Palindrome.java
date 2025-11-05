package part_1.p2_loopPrograms;

public class P18_Palindrome {
    public static void main(String[] args) {
        int num = 121, Original = num, rev = 0, rem = 0;
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;

        }
        if (rev == Original)
        {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}


