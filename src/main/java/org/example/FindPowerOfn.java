package org.example;

public class FindPowerOfn {
    public static void main(String[] args) {
        int n = 31;
        System.out.println("result : " + findPowerOfn(n));
    }

    public static int findPowerOfn(int n) {
        int power = 0;
        while (n > 0){
            if(n % 2 != 0) power++;
            n /= 2;
        }
        return power;
    }

}
