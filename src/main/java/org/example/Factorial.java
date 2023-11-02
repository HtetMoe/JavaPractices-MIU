package org.example;

import java.util.Scanner;

/*
This is factorial of n number
    Factorial of n = n! = n×(n−1)×(n−2)×…×3×2×1
    Factorial of 5 = 5! = 5*4*3*2*1 = 120
*/

public class Factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number : ");

        String userInput = scanner.next();
        int num = Integer.parseInt(userInput);

        // num!
        System.out.println( num + "! is " + calculateFactorial(num));
    }

    // 5! = 5 * 4 * 3 * 2 * 1 = 120

    public static int calculateFactorial(int num){
        int result = 1;
        for (int i = 1; i <= num; i++){
            result *= i;
        }
        return result;
    }
}
