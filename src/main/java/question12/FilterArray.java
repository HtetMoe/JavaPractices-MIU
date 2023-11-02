package question12;

import java.util.ArrayList;
import java.util.Arrays;

public class FilterArray {
    public static void main(String[] args) {
        int[] a = {8, 4, 9, 0, 3, 1, 2};
        int n = 88;
        System.out.println(Arrays.toString(filterArray(a, n)));
    }

    public static int[] filterArray(int[] a, int n) {
        ArrayList<Integer> result = new ArrayList<>();
        int[] resultList;
        int count = 0; // index

        //convert n to binary
        while (n != 0) {
            if (n % 2 == 1) {
                result.add(count);
            }
            count++;
            n /= 2; // update n
        }
        System.out.println("index of 1 in Binary array : " + result);

        if (count > a.length) {
            return null;
        } else {
            resultList = new int[result.size()];
            for (int i = 0; i < result.size(); i++) {
                resultList[i] = a[result.get(i)];
            }
        }
        return resultList;
    }
}

