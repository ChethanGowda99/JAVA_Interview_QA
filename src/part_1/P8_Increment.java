package part_1;

public class P8_Increment
{
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Pre: " + (++a)); // 6
        System.out.println("Post: " + (a++)); // 6
        System.out.println("After Post: " + a); // 7
    }

}
