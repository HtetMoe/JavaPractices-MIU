package org.example;

/*
Bubble Sort
- Do sorting ( ascending/descending)
- Make comparison, do sort

11, 4, 20, 9, 2, 8
- 11 compare with all others

4, 20, 9, 2, 8
- 4 compare with all others

*/

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {11, 4, 20, 9, 2, 8};
        System.out.println("Original array : " + Arrays.toString(arr));
        System.out.println("After Sorted  : " + Arrays.toString(sortedNumber(arr)));
    }

    public static int[] sortedNumber(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) { //sort for remaining index
                //make comparison
                if (arr[i] > arr[j]) {
                    temp = arr[i]; // temp = largeValue
                    arr[i] = arr[j]; // [0] = smallValue
                    arr[j] = temp;   // [1] = large value
                }
            }
        }
        return arr;
    }
}
