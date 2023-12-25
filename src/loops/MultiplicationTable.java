package loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // write an integer and multiple it by incrementation loop to 10
        Scanner scanner = new Scanner(System.in); // your number = 1
        int number = scanner.nextInt(); // 1
        for(int i = 1; i <= number; i++) {
            int result = 1*i; // 1*1
            System.out.println(result);
        }

    }
}

