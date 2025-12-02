package important_programs;

public class I1_TransposeMatrix {
    public static void main(String[] args) {
        int a[][] = new int[2][3];
        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;

        a[1][0] = 4;
        a[1][1] = 5;
        a[1][2] = 6;
        if (a == null || a.length == 0 || a[0].length == 0) {
            System.out.println("Transpose is not possible");
        } else {
            for (int row = 0; row < 2; row++) {
                for (int col = 0; col < 3; col++) {

                    System.out.print(a[row][col] + " ");
                }
                System.out.println("");


            }
            int result[][] = new int[3][2];
            for (int row = 0; row < 2; row++) {
                for (int col = 0; col < 3; col++) {

                    result[col][row] = a[row][col];
                }


            }
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 2; col++) {

                    System.out.print(result[row][col] + " ");
                }
                System.out.println("");
            }
        }
    }
}