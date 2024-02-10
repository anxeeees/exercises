package arrays;

import java.util.Arrays;

public class Arrays2 {

    public static void main(String[] args) {
        // 1. Write a Java program to sort a numeric array and a string array.

        int[] array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456
        };

        String[] array2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };

        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));

        //2. Write a Java program to sum values of an array.

        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(my_array));
        sum(my_array);

    }


    // Sum method
    static void sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        System.out.println(sum);
    }

}
