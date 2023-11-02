package org.example;

public class isSquare {
    public static void main(String[] args) {
        int n = 7;
        System.out.println("result : " + isSquare(n));
    }

    public static boolean isSquare(int n) {
        int num = 1;
        while (num * num <= n) {
            if (num * num == n) return true;
            num++;
        }
        return false;
    }


}
