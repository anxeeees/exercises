package loops;

public class Pyramid {
    public static void main(String[] args) {
        //Write a program to print pyramid
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            System.out.println(" ");
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        //Write a program to print pyramid
        for (int i = 0; i < rows; i++) {
            System.out.println(" ");
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
