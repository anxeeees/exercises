package loops;

public class Loops2 {
    public static void main(String[] args) {
        // 1 - Write while condition for numbers from 1 to 10
        int i = 1;
        while (i < 11) {
            System.out.println(i);
            i++;
        }
        // 2-Write while to find midpoint of 2 numbers
        int num = 300; // midpoint = 150
        int num2 = 0;

        while(num2 < num) {
            num2++;
            num--;
        }
        System.out.println(num);

        // 3 - Write while loop that runs only once and then checks the condition
        int j = 0;
        do {
            System.out.println("Hello how are u");

        } while(j > 10);



    }

}
