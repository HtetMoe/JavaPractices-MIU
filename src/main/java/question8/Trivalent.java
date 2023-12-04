package question8;

import java.util.HashSet;
import java.util.Set;

public class Trivalent {
    public static void main(String[] args) {
        int a[] = {22, 19, 10, 10, 19, 22, 22, 11};
        System.out.println("result : " + isTrivalent(a));
    }

    public static int isTrivalent(int[] a) {
        if (a.length < 3) return 0;

        Set<Integer> set = new HashSet<>();
        for (int e : a) {
            set.add(e);
        }

        if (set.size() == 3) return 1;

        return 0;
    }
}
