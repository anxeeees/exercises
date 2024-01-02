package patterns;

public class Patterns7 {

    //1
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                    System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        // 2
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j || i + j == 5 - 1) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }

    }
}
