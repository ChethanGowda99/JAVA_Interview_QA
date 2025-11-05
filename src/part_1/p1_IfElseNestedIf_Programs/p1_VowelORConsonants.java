package part_1.p1_IfElseNestedIf_Programs;


public class p1_VowelORConsonants {
    public static void main(String[] args) {
        char ch = 'a';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

            System.out.println("Entered charcter is a vowel");

        } else {
            System.out.println("Entered charcter is a consonants");
        }
    }
}
