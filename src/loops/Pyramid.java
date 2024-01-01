package loops;

public class Pyramid {
    public static void main(String[] args) {
        //Write a program to print a pyramid
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
        //2
        for (int i = 0; i < rows; i++) {
            System.out.println(" ");
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        //3
        for (int i = 0; i < rows; i++) { // i < 9 = max i = 8, // 0,1,2,3,4,5,6,7,8
            System.out.println(" ");
            for (int j = 0; j < rows - i + 5; j++) { // j = 0,1,2,3,4,5,6,7,8 space from  i = 8
                System.out.print("  ");
            }
            for (int k = 0; k < 2 * i + 1; k++) { // * in the row
                System.out.print("* ");
            }
        }

        //+4
        for (int i = rows - 2; i >= 0; i--) {
            System.out.println(" ");
            for (int j = 0; j < rows - i + 5; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < 2 * i + 1; k++) { // * in the row
                System.out.print("* ");
            }
        }
        System.out.println();
        System.out.println(" ");

        int columns = 4;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(". ");
            }
            System.out.println();
        }

        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(". ");
            }
            System.out.println();
        }

        for (int i = 5; i > 0; i--) {
            System.out.println(" ");
            for (int j = 5; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows -i -1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print(".");
            }

            System.out.println();
        }
        System.out.println(" ");
        //
        for (int i = 4; i >=0; i--) {
            for (int j = 0; j < rows -i -1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print(".");
            }

            System.out.println();
        }


    }
}

