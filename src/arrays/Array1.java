package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class Array1 {
    public static void main(String[] args) {

        // 1 Create array of 1 2 3 4 5 and print it

        int arr[] = new int[5]; // 5 numbers
        // 0 1 2 3 4

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        // print array
        System.out.println(Arrays.toString(arr));

        // Swap numbers in this array
        swap(arr, 1,3);
        System.out.println(Arrays.toString(arr));

    }

    // Create swap method
    static void swap(int arr[], int number1, int number2) {
        int temp;
        temp = arr[number1]; // 1
        arr[number1] = arr [number2]; //2
        arr[number2] = temp; // 1
    }
}
