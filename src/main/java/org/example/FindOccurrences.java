package org.example;

public class FindOccurrences {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 2, 5, 2};
        int n = 2;
        System.out.println("occurrences of " + n + " : " + findOccurrences(a, n));
    }

    public static int findOccurrences(int[] a, int n) {
        int count = 0;
        for (int element : a) {
            if (element == n) {
                count++;
            }
        }
        return count;
    }
}
