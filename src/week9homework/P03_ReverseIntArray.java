package week9homework;

import java.util.Arrays;

//3. Write a Java program to reverse an array of integer values.

public class P03_ReverseIntArray {
    public static void main(String[] args) {
        int[] my_array1 = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println("Original array;" + Arrays.toString(my_array1));
        for (int i = 0; i < my_array1.length / 2; i++) {
            int temp = my_array1[i];
            my_array1[i] = my_array1[my_array1.length - i - 1];
            my_array1[my_array1.length - i - 1] = temp;
        }
        System.out.println("Reverse array: " + Arrays.toString(my_array1));
    }
}

