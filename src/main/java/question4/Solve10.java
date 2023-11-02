package question4;

import java.util.Arrays;

public class Solve10 {
    public static void main(String[] args){
        System.out.println("x and y in array : " + Arrays.toString(solve10()));
    }

    public static int[] solve10(){
        int[] result = new int[2];
        int n = 10;

        for (int x = 1; x < n; x++) {
            int y = n - x;
            System.out.println("x : " + x + ", y : " + y);
            if (findFactorial(x) + findFactorial(y) == findFactorial(n)) {
                result[0] = x;
                result[1] = y;
                break;
            }
        }

        return result;
    }

//    public static int[] solve10() {
//        int tenFact = findFactorial(10), xFact = 1, yFact = 1;
//        int x, y = 1;
//
//        int result[] = new int[2];
//
//        boolean matched = false;
//        // find x!, y!, match?
//        for(x = 1; x <= 10; x++) {
//            xFact *= x;
//            //System.out.println(x + "! (x)= " + xFact);
//
//            yFact = 1; //reset yFactorial to 1 *******
//            for(y = 1; y <= 10; y++) {
//                yFact *= y;
//                //System.out.println( y +"! (y) = " + yFact);
//                if (tenFact == xFact + yFact) {
//                    matched = true;
//                    break;
//                }
//            }
//        }
//
//        if (matched) {
//            result[0] = x;
//            result[1] = y;
//        }
//        return result;
//    }

    public static int findFactorial(int n){
        int result = 1;
        for(int i = 1; i <= n; i ++){
            result *= i;
        }
        return result;
    }
}
