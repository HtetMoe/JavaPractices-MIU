package question17;

import java.util.Arrays;

public class EncodeArray {
    /*
        0 -> 1
        1 -> 0, 1
        2 -> 0, 0, 1

        -1 -> -1, 0, 1
        -2 -> -1, 0, 0, 2
     */

    public static void main(String[] args) {
        //{0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1} -> 12345
        int n = 12;
        System.out.println("result : " + Arrays.toString(encodeArray(n)));
    }

    public static int[] encodeArray(int n) {
        int absN = Math.abs(n);
        int[] encodedArray;
        int len = 0;

        if (n < 0) len += 1; // if n is negative, set -1 at the beginning

        //calculate the length
        while (absN > 0) {
            int digit = absN % 10;
            len += digit + 1;

            absN /= 10;
        }
        System.out.println("length : " + len);

        absN = Math.abs(n);
        encodedArray = new int[len];
        int index = 0;

        //if digit is -, set first index -1
        if (n < 0) {
            encodedArray[0] = -1;
            index++;
        }

        //encode the given value
        String stringValue = String.valueOf(absN);
        for (char c : stringValue.toCharArray()) {
            int digit = Integer.parseInt(String.valueOf(c));

            for (int i = 0; i <= digit; i++) {
                if (i == digit) encodedArray[index] = 1; // last index
                else encodedArray[index] = 0;
                index++;
            }
        }
        return encodedArray;
    }
}
