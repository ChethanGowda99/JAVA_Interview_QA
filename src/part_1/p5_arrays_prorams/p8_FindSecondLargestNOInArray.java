package part_1.p5_arrays_prorams;

public class p8_FindSecondLargestNOInArray {
    public static void main(String[] args) {


        int[] arr = {1, 3, 4, 7, 8, 9};
        int FirstLargest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;
        for (int no : arr) {
            if (no > FirstLargest) {
                SecondLargest = FirstLargest;
                FirstLargest = no;

            }
            if (no > SecondLargest && no != FirstLargest) {
                SecondLargest = no;

            }

        }
        System.out.println(" FirstLargest Number is :" + FirstLargest);
        System.out.println(" SecondLargest Number is :" + SecondLargest);

    }
}
