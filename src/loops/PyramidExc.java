package loops;

public class PyramidExc {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) { // 1, 2, 3, 4, 5
            for (int j = 1; j <= i - rows; j--) { // i - 5 = - 4 -> space 4 3 2 1 0
                System.out.print("  ");
            }

            for (int k = 1; k <= i; k++) { // i = 1, k = 1
                System.out.print(".");
            }

            for (int l = i ; l <= rows - i + 5; l++) { // space from the first .
                System.out.print(" ");
            }

            for (int m = 1; m <= i; m++) { //1
                System.out.print(".");
            }

            System.out.println();
        }
    }
}
