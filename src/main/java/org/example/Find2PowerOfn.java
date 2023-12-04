package org.example;

public class Find2PowerOfn {
    public static void main(String[] args) {
        int n = 20;
        System.out.println("result : " + find2PowerOfn(n));
    }

    public static int find2PowerOfn(int n) {
        int power = 0;
        while (n > 0) {
            if (n / 2 != 0) power++; // quotient
            n /= 2;
        }
        return power;
    }
}
