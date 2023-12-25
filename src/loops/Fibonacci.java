package loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 7 - 13
        int number = scanner.nextInt();
        int previous = 0;
        int next = 1;
        int counter = 2; // 1 and 0 = 2 numbers

        while (counter <= number) {
            int temp = next; // 1
            next = next + previous; // 1 + 0
            previous = temp; // last next = 1
            counter++; // 3
        }
        System.out.println(next);





    }
}
