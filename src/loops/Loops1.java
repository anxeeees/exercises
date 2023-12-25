package loops;

import java.util.Scanner;

public class Loops1 {
    public static void main(String[] args) {
        // 1 - print numbers from 1 to 5


        for(int num =1; num < 6; num++) {
            System.out.println("Num = "+num);
        }

        // 2 - Use loop with commas
        int a;
        int b;
        for(a = 1, b =5; a <4; a++, b--) {
            System.out.println("a is " + a);
            System.out.println("b is " + b);
        }

        // 3 - Write a program with user input, which will be the biggest value of the loop ( <=n)
        // u write 100 and It will print numbers from 1 to 100

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for(int i = 0; i <= number; i++) {
            System.out.print(" "+i);
        }

        // 4- Print Hello World 10 times
        for (int i = 0; i <11; i++) {
            System.out.println("Hello world");
        }

    }
}
