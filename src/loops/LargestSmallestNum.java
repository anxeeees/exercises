package loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LargestSmallestNum {
    public static void main(String[] args) {
        // Write a program to enter the numbers
        // till the user wants and at the end the program should display the largest and smallest numbers entered.

        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE; // min value of number
        int min = Integer.MAX_VALUE;  // max value of number

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }
        }

        System.out.println("Max is " + max);
        System.out.println("Min is " + min);
    }
}