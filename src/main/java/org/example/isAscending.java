package org.example;

public class isAscending {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 6, 7, 8};
        System.out.println("result : " + isAscending(a));
    }

    public static boolean isAscending(int[] a) {
        for(int i = 0; i < a.length -1; i++){
            int first = a[i];
            int next = a[i + 1];
            if(first > next) return false;
        }
        return true;
    }
}
