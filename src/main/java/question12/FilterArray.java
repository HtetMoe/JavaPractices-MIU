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
        ArrayList<Integer> indexes = new ArrayList<>();
        int[] resultList;
        int count = 0; // index

        //convert n to binary
        while (n != 0) {
            if (n % 2 == 1) indexes.add(count);

            count++;
            n /= 2; // update n
        }
        System.out.println("index of 1 in Binary array : " + indexes);

        if (count > a.length) {
            return null;
        } else {
            resultList = new int[indexes.size()];
            for (int i = 0; i < indexes.size(); i++) {
                resultList[i] = a[indexes.get(i)];
            }
        }
        return resultList;
    }
}

