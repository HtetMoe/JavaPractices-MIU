package org.example;

public class areAdjacent {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 2};
        int n1 = 2;
        int n2 = 3;
        System.out.println("result : " + areAdjacent(a, n1, n2));
    }

    public static boolean areAdjacent(int[] a, int n1, int n2) {
        int n1Index = 0;
        int n2Index = 0;
        for (int i = 0; i < a.length; i++) {
            int value = a[i];
            if (value == n1) n1Index = i;
            else if (value == n2) n2Index = i;
        }
        int diff = Math.abs(n1Index - n2Index);
        return diff == 1;
    }
}
