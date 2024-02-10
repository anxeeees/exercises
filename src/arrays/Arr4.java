package arrays;


import java.util.Arrays;

public class Arr4 {
    public static void main(String[] args) {
        // 7. Write a Java program to remove a specific element from an array.

        int[] array = {25, 14, 18, 15, 36, 56, 77, 18, 29, 50};
        System.out.println(Arrays.toString(array));
        remove(array, 5);
    }

    // Remove method
    static void remove(int arr[], int index) {
        int i;
        for ( i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[i] = 0;
        System.out.println(Arrays.toString(arr));
    }
}

