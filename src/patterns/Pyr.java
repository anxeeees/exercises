package patterns;

public class Pyr {
    public static void main(String[] args) {
        //1 right half pyramid
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            {
                for (int j = 0; j <=i; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        System.out.println();
        // 2 reverse right half pyramid
        for (int i = 4; i >=0; i--) {
            {
                for (int j = 0; j <=i; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }


    }
}
