package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] a = {2, 7, 2, 2};

        Set<Integer> set = new HashSet<>();
        for(int e : a) {
            set.add(e);
        }

        ArrayList<Integer> arr = new ArrayList<>(set);
        System.out.println("arr : " + arr);
    }
}
