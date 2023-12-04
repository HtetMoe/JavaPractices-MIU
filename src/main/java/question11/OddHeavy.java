package question11;

import java.util.ArrayList;
import java.util.Collections;

public class OddHeavy {
    /*
     - it contains at least one odd element, and
     - every element whose value is odd is greater than every even-valued element.
     */
    public static void main(String[] args) {
        int[] a = {-2, -4, -6, -8, -0, 11};
        System.out.println("is Odd Heavy : " + isOddHeavy(a));
    }

    public static int isOddHeavy(int[] a) {
        //if length is 1
        if (a.length == 1) {
            int num = a[0];
            if (num % 2 != 0)
                return 1;
            else
                return 0;
        }

        ArrayList<Integer> odds = new ArrayList<>();
        ArrayList<Integer> evens = new ArrayList<>();

        //get evens and odds
        for (int i = 0; i < a.length; i++) {
            int num = a[i];
            //even
            if (num % 2 == 0) //contains no odd elements
                evens.add(num);
            else
                odds.add(num);
        }

        //at least 1 odd
        if (!odds.isEmpty())//evens.isEmpty() &&
            return 1;

        //sorting
        Collections.sort(odds);
        Collections.sort(evens);

        int smallestOdd = odds.get(0);
        int largestEven = evens.get(evens.size() - 1);
        if (smallestOdd > largestEven) {
            return 1;
        }
        return 0;
    }
}
