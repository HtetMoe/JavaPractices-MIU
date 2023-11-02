package org.example;

public class PerfectSquare {
    public static void main(String[] args) {
        int n = 25;
        System.out.println("result : " + isPerfectSquare(10));
    }

    public static boolean isPerfectSquare(int n){
        if (n < 0) {
            return false;
        }
        int num = 1;
        while (num * num <= n) {
            if (num * num == n) {
                return true; // Found a perfect square
            }
            num++; //update
        }
        return false;
    }
}
