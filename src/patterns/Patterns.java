package patterns;

public class Patterns {
    public static void main(String[] args) {
        //1 right half pyramid
        int rows = 5;
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        // 2 reverse right half pyramid
        for (int i = 1; i < 5; i++) {
            {
                for (int j = 4; j >= i; j--) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // 3 - together pattern
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < 4; i++) {
            {
                for (int j = 3; j >= i; j--) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }



    }
}
