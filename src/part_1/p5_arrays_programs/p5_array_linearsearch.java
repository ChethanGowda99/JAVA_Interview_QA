package part_1.p5_arrays_programs;

public class p5_array_linearsearch {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int target = 4;
        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                System.out.println(i);
            }

        }
    }
}
