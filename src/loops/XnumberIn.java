package loops;

public class XnumberIn {
    public static void main(String[] args) {
        // 1- Write a program for how many times a one number is in the whole number (4)
        int number = 464946444; // number
        int counter = 0;

        while(number > 0){
            int remainder = number % 10; // 464946 % 10 = 464946 = 6
            if(remainder == 4) {
                 counter++;
            }
            number = number/10; // 46494
        }
        System.out.println(counter);
    }

}
