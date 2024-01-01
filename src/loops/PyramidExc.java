package loops;

public class PyramidExc {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) { // 1, 2, 3, 4, 5
            for (int j = 1; j <= i - rows; j--) { //4 3 2 1 0 space
                System.out.print("  ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(".");
            }

            for (int l = i + 1; l <= rows - i + 5; l++) {
                System.out.print(" ");
            }

            for (int m = 1; m <= i; m++) {
                System.out.print(".");
            }

            System.out.println();
        }
    }
}
