package patterns;

public class Patterns5 {
    public static void main(String[] args) {
        //1
        for (int i = 1; i <= 6; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        // 2 reversed
        for (int i = 1; i <= 6; i++) {

            for (int j = 5; j >=i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //

    }
}
