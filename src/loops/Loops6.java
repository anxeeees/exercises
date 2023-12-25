package loops;

import java.util.Scanner;

public class Loops6 {
    public static void main(String[] args) {
        // 1 - Write a go-to loop which has 3 blocks that break out of the second block
        boolean t = true;
        first: {
        second: {
            third:{
                System.out.println("Third block");
                if(t) break second;
            }
            System.out.println("Second block");
        }
            System.out.println("First block");
        }

        // 2 -	Write alphabet case check
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        if(ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        }
        else System.out.println("Uppercase");
    }

}