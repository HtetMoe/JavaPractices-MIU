package question1;

import java.util.ArrayList;
import java.util.Collections;

public class InertialArray1 {
    public static void main(String[] args) {
    /*
    a. it contains at least one odd value
    b. the maximum value in the array is even
    c. every odd value is greater than every even value that is not the maximum value.

    - 1 odd
    - max is even
    - odds > evens, except max

     */
        int[] a = {1, 1, 1, 1, 1, 1, 2};
        System.out.println("result : " + isInertial(a, a.length));
    }

    public static int isInertial(int a[], int len) {
        //b. max is even
        int max = findMax(a);
        System.out.println("max : " + max);
        if (max % 2 != 0) return 0;


        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            int value = a[i];
            if (value != max){
                if (value % 2 == 0) evens.add(value);
                else odds.add(value);
            }
        }

        //sort
        Collections.sort(evens);
        Collections.sort(odds);

        System.out.println("evens : " + evens);
        System.out.println("odds : " + odds);

        if (odds.isEmpty()) return 0;

        if(!odds.isEmpty() && evens.isEmpty()) return 1;

        // odds > evens
        if(odds.get(0) < evens.get(evens.size() - 1)) return 0;

        return 1;
    }

    public static int findMax(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) max = a[i];
        }
        return max;
    }
}
