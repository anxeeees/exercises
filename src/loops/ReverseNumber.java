package loops;

public class ReverseNumber {

    public static void main(String[] args) {
        // 1- Write a program that reverses the number u put in
        // 234 - > 432

        int number = 234;
        int remainder;
        int result = 0;

        while(number > 0) {
            remainder = number % 10; // 4
            number = number / 10; // 23
            result = result * 10 + remainder; // 40
        }
        System.out.println(result);
    }


}
