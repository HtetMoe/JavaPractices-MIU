package question16;

public class DigitIncreasing {
    public static void main(String[] args) {
        int n = 7404;
        System.out.println("result : "  + isDigitIncreasing(n));
    }

    /*
        - it is equal to n + nn + nnn + ... for some digit n between 1 and 9
        - 24 = 2 + 22
     */

    public static int isDigitIncreasing(int n) {
        int ori = n;
        for (int i = 1; i <= 9; i++) {
            int sum = 0;
            int digit = 0;
            while (sum < n) {
                digit = (digit * 10) + i;
                //System.out.println("digit : " + digit);
                sum += digit;
            }

            if (sum == ori)  return 1;
        }
        return 0;
    }
}
