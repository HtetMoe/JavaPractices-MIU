package question18;

import java.util.ArrayList;
import java.util.Collections;

public class largestDifferenceOfEvens {
    /*
    - the largest difference between (even valued elements) of its array argument
     */
    public static void main(String[] args) {
        int[] a = {2, 2, 2, 2};
        System.out.println("result : " + largestDifferenceOfEvens(a, a.length));
    }

    public static int largestDifferenceOfEvens(int a[], int len) {
        ArrayList<Integer> evens = new ArrayList<>();
        for (int element : a) {
            if (Math.abs(element) % 2 == 0) evens.add(element);
        }

        if (evens.size() < 2) return 0;

        //sort
        Collections.sort(evens);
        System.out.println(evens);

        //find the difference
        int smallest = evens.get(0);
        int largest = evens.get(evens.size() - 1);

        return largest - smallest;
    }

//    public static int largestDifferenceOfEvens(int[] a) {
//        int lde = 0; // largest diff even
//        int index = 0;
//
//        int value = 0;
//        while (index < a.length) {
//            value = a[index];
//
//            //check is Even
//            if (value % 2 == 0) {
//
//                //find even diff
//                for (int i = 0; i < a.length; i++) {
//                    if (a[i] != value && (a[i] % 2 == 0)) { // must event and index value (exclusive)
//                        int diff = value - a[i];
//                        //System.out.println("diff for : " + value + " - " + a[i] + " = " + diff);
//                        if (diff > lde) lde = diff;
//                    }
//                }
//            }
//            index++;
//        }
//        //System.out.println("lde : " + lde);
//
//        return lde > 0 ? 1 : -1;
//    }
}
