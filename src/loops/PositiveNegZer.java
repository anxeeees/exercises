package loops;

import java.util.Scanner;

public class PositiveNegZer {
    public static void main(String[] args) {
        // Write a program to enter the numbers till the user wants
        // and at the end it should display the count of positive, negative and zeros entered.

        // this one actually took some time because 0 is also multiplication with modulus 0

        Scanner scanner = new Scanner(System.in);
        boolean userInput = true;
        int evenResult = 0;
        int oddResult = 0;
        int zeroes = 0;

        while (userInput) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                if (number % 2 == 0 && number != 0) {
                    evenResult += number;
                } else if (number % 2 == 1) {
                    oddResult += number;
                } else if (number == 0) {
                    zeroes++;
                }
            } else {
                userInput = false;
                System.out.println("Even result is: " + evenResult);
                System.out.println("Odd result is: " + oddResult);
                System.out.println("Zeroes count is: " + zeroes);
            }

        }


    }
}
