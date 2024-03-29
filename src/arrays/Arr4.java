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

        //9. Write a Java program to insert an element (specific position) into an array.
        int[] arr = {25, 14, 56, 15, 36, 0, 0, 0};
        add(arr, 2, 35);

        // 10. Write a Java program to find the  minimum value of an array.
        int[] array2 = {25, 14, 18, 15, 36, 56, 77, 18, 29, 50};
        findMin(array2);

        // 12. Write a Java program to find duplicate values in an array of integer values.
        int[] arr2 = {25, 18, 18, 1, 1, 20, 20, 100, 100};
        System.out.println(Arrays.toString(arr2));
        System.out.println(findDuplicate(arr2));

        // 16. Write a Java program to remove duplicate elements from an array.
        removeDuplicate(arr2);

    }

    // Remove method
    static void remove(int arr[], int index) {
        int i;
        for (i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[i] = 0;
    }

    static void add(int arr[], int index, int value) {
        int i;
        for (i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
        System.out.println(Arrays.toString(arr));
    }

    static void findMin(int arr[]) {
        //arr[i] = 1 2 3 4 5
        int startIndex = 0;
        int endIndex = arr.length - 1;

        int min = arr[startIndex]; // Imagine that first index is the maximum of all


        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    static boolean findDuplicate(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    return true;
                }
            }
        }
        return false;
    }

    static void removeDuplicate(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    remove(arr, j);
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }


}


