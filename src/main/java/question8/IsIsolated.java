package question8;

public class IsIsolated {
    public static void main(String[] args) {
        int n = 69;
        System.out.println("result : " + isIsolated(n));
    }
    /*
        - square does not contain any of the digits used in the cube
     */

    public static int isIsolated(long n) {
        if (n > 2097151 || n < 1) return -1;

        long square = n * n; // 26569
        long cube   = square * n; //4330747

        String sqString = String.valueOf(square);
        while (cube != 0) {
            long digit = cube % 10;
            if (sqString.contains(String.valueOf(digit))) { // get rightmost bit
                return 0;
            }
            cube = cube / 10; //433074  // right shift
        }
        return 1;
    }
}
