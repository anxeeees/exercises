package arrays;

import java.util.Arrays;

public class Arrays3 {
    public static void main(String[] args) {
        //3. Write a Java program to print the following grid.

        /*  - - - - - - - - - -
            - - - - - - - - - -
            - - - - - - - - - -
            - - - - - - - - - -
            - - - - - - - - - -
            - - - - - - - - - -
            - - - - - - - - - -
            - - - - - - - - - -
            - - - - - - - - - -
            - - - - - - - - - -*/

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("- ");
            }
            System.out.println();
        }

        // 4. Write a Java program to calculate the average value of array elements.
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};

        int[] numbers2 = new int[]{20, 40};

        average(numbers2);
        average(numbers);


        // 5. Write a Java program to test if an array contains a specific value.

        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456
        };

        System.out.println(findVal(my_array1, 2457));

        // 6. Write a Java program to find the index of an array element.

        int[] my_array2 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        findInd(my_array2, 49);

    }


    // findIndex
    static void findInd(int arr[], int number) {
        // arr[i] = value
        // i = index

        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                System.out.println(i);
                break;
            }

        }


    }


    // Average method
    static void average(int arr[]) {
        int counter = 0;
        int sum = 0;
        for (int element : arr) {
            sum += element;
            counter++;
        }
        System.out.println(sum / counter);
    }


    // Find value in array method
    static boolean findVal(int arr[], int value) {
        for (int element : arr) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }
}
