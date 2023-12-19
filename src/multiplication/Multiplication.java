package multiplication;

public class Multiplication {
    public static void main(String[] args) {
        // multiplication of numbers - iteration

        int x;
        int multiplication = 1;
        // multiplication = multiplication * x

        for(x = 1; x < 5; x++) {
            multiplication *=x;
        }
        System.out.println(multiplication);
    }
}
