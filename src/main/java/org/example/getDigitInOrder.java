package org.example;

public class getDigitInOrder {
    /*
        - get digit in order without using modulo

     */

    public static void main(String[] args) {
        int n = 12345;
        //digitInOrderWithModulo(n);
        digitInOrderWithoutModulo(n);
    }

    //without modulo
    public static void digitInOrderWithoutModulo(int n){
        String str = String.valueOf(n);
        for(char ch : str.toCharArray()){
            int digit = Integer.parseInt(String.valueOf(ch));
            System.out.println("digit : " + digit);
        }
    }

    //with modulo
    public static void digitInOrderWithModulo(int n){
        while (n > 0){
            int digit = n % 10;
            System.out.println("digit : " + digit);
            //update
            n /= 10;
        }
    }
}
