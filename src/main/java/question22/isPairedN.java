package question22;

import java.util.ArrayList;

public class isPairedN {
    /*
         An array is defined to be paired-N
         if it contains two distinct elements that sum to N for some specified value of N and
         the indexes of those elements also sum to N

         n = sum of two distinct elements
         n = whose indexes sum
     */

    public static void main(String[] args) {
        int[] a = {1, 4, 1, 4, 5, 6};
        int n = 6;
        System.out.println("result " + isPairedN(a, n));
    }

    public static int isPairedN(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("i : " + a[i]);

            for (int j = i + 1; j < a.length; j++) {
                System.out.println("j : " + a[j]);

                if (a[i] + a[j] == n && i + j == n) return 1;
            }
            System.out.println("---");
        }
        return 0;
    }
}
