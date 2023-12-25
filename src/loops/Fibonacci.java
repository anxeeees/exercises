package loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int previous = 0;
        int next = 1;
        int count = 2;

        while(count <= number) {
            int temp = next; // temp = next
            next += previous; // next + previous
            previous = temp; // previous = next before
            count++; // counter
        }
        System.out.println(next);
    }
}
