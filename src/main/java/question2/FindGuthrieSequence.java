package question2;

import java.util.ArrayList;
import java.util.Arrays;

public class FindGuthrieSequence {
    public static void main(String[] args) {
        int[] a = {8, 4, 2, 1};
        System.out.println("result : " + isGuthrieSequence(a));
    }

    public static int isGuthrieSequence(int[] a) {
        int[] gs = findGuthrieSequence(a[0]);
        System.out.println("g sequence : " + Arrays.toString(gs));
        return Arrays.equals(a, gs) ? 1 : 0;
    }

    public static int[] findGuthrieSequence(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(n);
        /*
            Start with a positive number n
            if n is even then divide by 2
            if n is odd then multiply by 3 and add 1
            continue this until n becomes 1
         */

        while (n != 1) {
            int value = (n % 2 == 0) ? n/2 : (n * 3) + 1;
            result.add(value);
            n = value; //update n
        }

        //convert arr to list
        int[] gsList = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            gsList[i] = result.get(i);
        }
        return gsList;
    }
}
