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
        swap(arr, 1, 3);
        System.out.println("This is the swapped number: \n" + Arrays.toString(arr));

        // FindMax method with indexes
        System.out.println("Max number:");
        findMax(arr, 1, 2);
        System.out.println("StartIndex: 1 \nEndIndex: 2 ");

        // FindMax method without indexes
        System.out.println("Find maximum number in the whole array:");
        findMax(arr);

        //Reverse array
        System.out.println("Reverse array:");
        reverse(arr);


    }

    // Create swap method
    static void swap(int arr[], int number1, int number2) {
        int temp;
        temp = arr[number1]; // 1
        arr[number1] = arr[number2]; //2
        arr[number2] = temp; // 1
    }

    // Find max method

    static void findMax(int arr[], int startIndex, int endIndex) {
        //arr[i] = 1 2 3 4 5
        int max = arr[startIndex]; // Imagine that first index is the maximum of all

        for (int i = startIndex; i < endIndex; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    static void findMax(int arr[]) {
        //arr[i] = 1 2 3 4 5
        int startIndex = 0;
        int endIndex = arr.length - 1;

        int max = arr[startIndex]; // Imagine that first index is the maximum of all


        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

            while (start < end) {
                swap(arr, end, start);
                start++;
                end--;
            }


        System.out.println(Arrays.toString(arr));
    }

}
