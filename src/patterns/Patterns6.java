package patterns;

public class Patterns6 {
    public static void main(String[] args) {

        // 1
        for (int i = 1; i <= 5; i++) {

            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < i * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //2
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < i * 2; k++) {
                if (k > 1 && k < i * 2 - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println();
        // 3 reversed !!
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < i * 2; k++) {
                if (k > 1 && k < (i * 2) - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();

    }
}

