package loops;

public class EvenAndOdd {

    public static void main(String[] args) {
        // Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
        int resultEven = 0;
        int resultOdd = 0;
        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0) {
                 resultEven +=i;
            }
            else resultOdd +=i;
        }
        System.out.println(resultEven);
        System.out.println(resultOdd);
    }

}
