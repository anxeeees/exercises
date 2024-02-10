package arrays;

import java.util.Arrays;

import static arrays.Arr4.findMin;

public class Arr5 {

    public static void main(String[] args) {
        //17. Write a Java program to find the second largest element in an array.
        int[] my_array = {
                50, 20, 40, 4, 5,
                6, 7, 21};

        System.out.println(Arrays.toString(my_array));
        findSecLar(my_array);

        // 18. Write a Java program to find the second smallest element in an array.
        findSecSmall(my_array);



    }

    static void findSecLar(int arr[]) {
        Arrays.sort(arr);
        int index = arr.length - 2; //7
        System.out.println(arr[index]);

    }

    static void findSecSmall(int arr[]) {
        Arrays.sort(arr);
        int min = 1;
        System.out.println(arr[min]);

    }

    }


