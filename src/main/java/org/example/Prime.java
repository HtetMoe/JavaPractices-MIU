package org.example;

import java.util.Scanner;

/*
A prime number is a number that cannot be evenly divided by any other number except (1 and itself)
- 2 (only divisible by 1 and 2)
- 3 (only divisible by 1 and 3)
- 5 (only divisible by 1 and 5)
*/


public class Prime {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number : ");

        String userInput = scanner.next();
        int num = Integer.parseInt(userInput);

        //check prime number
        if (isPrime(num))
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
