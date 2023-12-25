package loops;

public class Factorial {
    public static void main(String[] args) {
        int factorial = 5; // 4 * 3 * 2 * 1 == 4
        int result = 1;
        for (int i = factorial; i > 0; i--) { // i = 4, 3, 2, 1 cant be 0
             result *= i;
        }
        System.out.println(result);
    }
}
