package arrays;

import java.util.Arrays;

import static arrays.Arr4.findMin;

public class Arr5 {

    public static void main(String[] args) {
        //17. Write a Java program to find the second largest element in an array.
        int[] my_array = {
                1, 20, 3, 4, 5,
                1999, 2222, 60000};

        Arrays.sort(my_array);
        System.out.println(Arrays.toString(my_array));
        findSecLar(my_array);

        // 18. Write a Java program to find the second smallest element in an array.
        findSecSmall(my_array);




    }

    static void findSecLar(int arr[]) {
        int index = arr.length - 1; //7
        index--;
        System.out.println(arr[index]);

    }

    static void findSecSmall(int arr[]) {
        Arrays.sort(arr);

        for (int i = 1; i < 2; i++) {
            System.out.println(arr[i]);
        }

    }

    }


