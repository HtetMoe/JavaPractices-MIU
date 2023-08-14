package org.example;

import java.util.Scanner;

/*

12345 -> 54321
Last digit = get remainder of divided by 10 = 5

Left shift  = increase =  multiple with 10
Right shift = reduce   = divide by 10

12345 % 10 -> remainder = 5, quotient = 1234
Quotient % 10 -> 1234 % 10 ->  remainder = 4, quotient = 123

remainder = num % 10
reverseNumber =  (reverseNum * 10 ) + remainder

*/

public class Reverse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number : ");

        String userInput = scanner.next();
        int num = Integer.parseInt(userInput);

        //reverse number
        System.out.println("Your reverse number is " + processReverse(num));
    }

    public static int processReverse(int num){
        int remainder  = 0;
        int reverseNum = 0;

        // num = 12345
        while(num > 0 ) {
            remainder = num % 10; // get last digit, remainder value  -> 5, 4

            reverseNum = (reverseNum * 10) + remainder; // promote position -> 5, 40 + 5 = 45

            num = num / 10; // demote position, quotient value -> 1234, 123
        }

        return reverseNum;
    }
}
