package patterns;

public class Patterns2 {
    public static void main(String[] args) {
        // LEFT HALF PYRAMID

        for (int i = 1; i <= 4; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print("  "); // double space because of the space at the star
                // other way is "" and "*"
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println();
        // REVERSED
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j < i; j++) { // space at the start <= i
                System.out.print("  "); // double space because of the space at the star
                // other way is "" and "*"
            }
            for (int k = 4; k >= i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // combination
        for (int i = 1; i <= 4; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print("  "); // double space because of the space at the star
                // other way is "" and "*"
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        for (int i = 2; i <= 4; i++) {
            for (int j = 1; j < i; j++) { // space at the start <= i
                System.out.print("  "); // double space because of the space at the star
                // other way is "" and "*"
            }
            for (int k = 4; k >= i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
