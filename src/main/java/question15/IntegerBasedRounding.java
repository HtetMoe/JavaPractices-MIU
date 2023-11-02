package question15;

import java.util.ArrayList;

public class IntegerBasedRounding {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int n = 3;
        doIntegerBasedRounding(a, n, a.length);
    }

    public static void doIntegerBasedRounding(int[] a, int n, int len) {
        ArrayList<Integer> roundedArray = new ArrayList<>();
        for (int i = 0; i < len; i ++){
            int roundValue = (a[i]/n) * n;
            roundedArray.add(roundValue);
        }
        System.out.println(roundedArray);
    }
}
