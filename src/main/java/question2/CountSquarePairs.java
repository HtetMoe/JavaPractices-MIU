package question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CountSquarePairs {
    public static void main(String[] args) {
        int a[] = {2, 7, 2, 2};
        System.out.println(countSquarePairs(a));
    }

    public static int countSquarePairs(int[] a) {
        int count = 0;

        Set<Integer> set = new HashSet<>();
        for(int element : a) {
            set.add(element);
        }

        //remove duplicate
        ArrayList<Integer> uniqueList = new ArrayList<>(set);
        System.out.println("after removed duplicates : " + uniqueList);

        Collections.sort(uniqueList);
        System.out.println("sorted arr : " + uniqueList);

        //outer loop
        for (int i = 0; i < uniqueList.size() - 1; i++) {
            int x = uniqueList.get(i);

            //because both members of a square pair have to be greater than 0
            if ( x < 1 ) continue;

            //inner loop
            for (int j = i + 1; j < uniqueList.size(); j++) {
                int y = uniqueList.get(j);

                int sum = x + y;
                if(isPerfectSquare(sum) == 1 ) count++;
            }
        }
        return count;
    }

    public static int isPerfectSquare(int n) {
        if (n < 0) return 0;
        int num = 1;
        while (num * num <= n) {
            if (num * num == n) {
                return 1;
            }
            num++;
        }
        return 0;
    }
}
