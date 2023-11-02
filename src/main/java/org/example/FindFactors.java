package org.example;

import java.util.ArrayList;

public class FindFactors {
    public static void main(String[] args) {
        int n = 6;
        System.out.println("result : " + findFactors(n));
    }

    public static ArrayList<Integer> findFactors(int n) {
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) factors.add(i);
        }
        return factors;
    }
}
