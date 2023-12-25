package loops;

import java.util.Scanner;

public class Loops3 {
    public static void main(String[] args) {
        // 1 - Find the largest of 3 numbers
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int max;
       max = num1;

        if(num2 > num1) {
            max = num2;
        }
        if(num3 > num2) {
            max = num3;
        }
        System.out.println(max);
        // 2 - Use Math.max to find maximum value of 2 numbers
        System.out.println(Math.max(num1,num2));
        // 3 - Use Math.max to find maximum value of 3 numbers
        System.out.println(Math.max(Math.max(num1,num2),num3));


    }
}
