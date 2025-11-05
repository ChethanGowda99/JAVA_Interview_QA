package part_1.p1_IfElseNestedIf_Programs;

public class p5_LargestOfThree {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;
        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Largest: " + max);
    }

}
