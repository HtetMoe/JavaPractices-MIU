package question15;

import java.util.Arrays;

public class IntegerBasedRounding {
    /*
        - two multiples of n are equidistant use the greater one
        -
     */
    public static void main(String[] args) {
        int[] a = {5};
        int n = 4;
        doIntegerBasedRounding(a, n, a.length);
    }

    public static void doIntegerBasedRounding(int[] a, int n, int len) {
        if (n <= 0) return; // No modification if n <= 0

        for (int i = 0; i < len; i++) {
            if (a[i] > 0) {
                int lower = (a[i] / n) * n; // find the lower multiple of n
                int higher = lower + n; // find the higher multiple of n

                System.out.println("lower : " + lower + ", higher : " + higher);

                //find diff to determine the closest multiple
                int lowerDiff  = a[i] - lower;
                int higherDiff = higher - a[i];

                // nearest multiple of n
                if (lowerDiff < higherDiff) {
                    a[i] = lower; // closer to the lower multiple
                } else {
                    a[i] = higher; // closer to the higher multiple or equidistant
                }
            }
        }
        System.out.println("result : " + Arrays.toString(a));
    }
}
