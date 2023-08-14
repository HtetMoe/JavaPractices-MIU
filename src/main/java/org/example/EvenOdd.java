package org.example;

import java.util.Scanner;

public class EvenOdd {
    public  static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number : ");

        String userInput = scanner.next();
        int num = Integer.parseInt(userInput);

        //check is even or odd
        if (isEven(num))
            System.out.println(num + " is even number.");
        else
            System.out.println(num + " is odd number.");
    }

    public static Boolean isEven(int num){
        return num % 2 == 0;
    }
}
