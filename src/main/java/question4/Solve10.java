package question4;

import java.util.Arrays;

public class Solve10 {
    public static void main(String[] args){
        System.out.println("x and y in array : " + Arrays.toString(solve10()));
    }

    public static int[] solve10() {
        int tenFact = 1, xFact = 1, yFact = 1;
        int x, y = 1;
        int result[] = new int[2];
        boolean matched = false;

        //find 10!
        for(int i = 1; i <= 10; i++) {
            tenFact = tenFact * i;
        }

        // find x!, y!, match?
        for(x = 1; x <= 10; x++) {
            xFact = xFact * x;
            yFact = 1; // reset yFactorial to 1

            for(y = 1; y <= 10; y++) {
                yFact = yFact * y;
                if (tenFact == xFact + yFact) {
                    matched = true;
                    break;
                }
            }
        }
        if (matched) {
            result[0] = x;
            result[1] = y;
        }
        else {
            result[0] = 0;
            result[1] = 0;
        }
        return result;
    }
}
