package arrays;


import java.util.Arrays;

public class Arr4 {
    public static void main(String[] args) {
        // 7. Write a Java program to remove a specific element from an array.

        int[] array = {25, 14, 18, 15, 36, 56, 77, 18, 29, 50};
        System.out.println(Arrays.toString(array));
        remove(array, 1);


        //8. Write a Java program to copy an array by iterating old array.

        int[] new_array = new int[10];
        for (int i = 0; i < array.length; i++) {
            new_array[i] = array[i];
        }
        System.out.println(Arrays.toString(new_array));


    }

    // Remove method
    static void remove(int arr[], int index) {
        int i;
        for (i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[i] = 0;
        System.out.println(Arrays.toString(arr));
    }
}

