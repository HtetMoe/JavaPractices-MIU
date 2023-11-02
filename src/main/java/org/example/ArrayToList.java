package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1); arr.add(2); arr.add(3);

        //Array to List
        int[] result = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            result[i] = arr.get(i);
        }
        System.out.println("Result : " + Arrays.toString(result));
    }
}
