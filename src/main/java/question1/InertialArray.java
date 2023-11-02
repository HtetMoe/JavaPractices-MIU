package question1;
/*
- at least 1 odd
- max is even
- every odd > every even, except max

 */

import java.util.*;

public class InertialArray {
    public static void main(String[] args) {
        int[] a = {11, 4, 20, 9, 2, 8};
        System.out.println("isInitial : " + isInertial(a, a.length));
    }

    public static int isInertial(int a[], int len) {
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();

        //separate evens and odds
        for (int value : a) { // value in array
            if (value % 2 == 0)
                evens.add(value);
            else
                odds.add(value);
        }

        //To be maxValue must be even, at least one odd
        if (evens.size() == 0 || odds.size() == 0) return 0;

        //sort
        Collections.sort(odds); //2, 4, 8, 9, 20
        Collections.sort(evens); //11

        System.out.println("Sorted evens : " + evens);
        System.out.println("Sorted odds : " + odds);

        if (evens.size() == 1) { // largest number is even
            if (evens.get(0) < odds.get(odds.size() - 1))
                return 0;
            else
                return 1;

        }

        //{2, 12, 12, 4, 6, 8, 11}
        // evens -> 2, 4, 6, 8, 12, 12
        // odds  -> 11
        // odds > evens, except maxEven
        // so, here we need to remove duplicates

        //remove duplicates
        Set<Integer> uniqueEvensSet = new HashSet<>(evens);

        //convert set to list
        List<Integer> uniqueEvens = new ArrayList<>(uniqueEvensSet);

        //compare largest of evens and odds, largest number must be even.
        if (uniqueEvens.get(uniqueEvens.size() - 1) < odds.get(odds.size() - 1)) {
            return 0;
        }

        if (uniqueEvens.get(uniqueEvens.size() - 2) > odds.get(0))
            return 0;

        return 1;
    }
}
