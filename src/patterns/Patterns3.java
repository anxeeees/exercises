package patterns;

public class Patterns3 {
    public static void main(String[] args) {

        // WHOLE PYRAMID
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *  ");
            }
            System.out.println();
        }

        System.out.println();
        // second variation
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= 1; j--) {

                if (j > i) {
                    System.out.print("  ");
                } else {
                    System.out.print(" *  ");
                }

            }
            System.out.println();

        }

    }
}
