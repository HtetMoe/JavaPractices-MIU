package question16;

public class DigitIncreasing {
    public static void main(String[] args) {
        int n = 7404;
        System.out.println(isDigitIncreasing(n));
    }

    /*
        - it is equal to n + nn + nnn + ... for some digit n between 1 and 9
        - 24 = 2 + 22
     */

    public static int isDigitIncreasing(int n) {
        //for some digit n between 1 and 9
        for (int i = 1; i < 9; i++) {

            int digit = 0;
            int sum = 0;

            while (sum < n) {
                digit = i + (digit * 10);
                //System.out.println(digit);
            }
            sum += digit;

            if (sum == n) return 1;
        }
        return 0;
    }
}
