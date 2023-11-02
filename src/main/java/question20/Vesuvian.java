package question20;

import java.util.ArrayList;

public class Vesuvian {
    /*
        - A number n is vesuvian if it is the sum of two different pairs of squares
        - 50 == 25 + 25 and 1 + 49.

        n = (square + square)  and (1 + square)

        1st -> n - square = square
        2nd -> n - 1 = square
     */

    public static void main(String[] args) {
        int n = 50; // 50, 65, 85
        System.out.println("result : " + isVesuvian(n));
    }

    public static int isVesuvian(int n) {
        ArrayList<Integer> squares = new ArrayList<>();

        //find squares
        int i = 1;
        while (i * i <= n) {
            int square = i * i;
            squares.add(square);
            i++;
        }

        //check condition -> 50 == 25 + 25 and 1 + 49
        for (int square : squares) {
            if (squares.contains(n - square) || n - 1 == square) return 1;
        }
        return 0;
    }

}
