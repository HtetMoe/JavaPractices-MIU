package question21;

public class isMercurial {
    /*
        - if a 3 does not occur between any two 1s
     */
    public static void main(String[] args) {
        int[] a = {1, 2, 10, 3, 15, 1, 2, 2};
        int[] a1 = {5, 2, 10, 3, 15, 1, 2, 2};
        int[] a2 = {1, 2, 10, 3, 15, 16, 2, 2};
        int[] a3 = {3, 2, 18, 1, 0, 3, -11, 1, 3};
        int[] a4 = {2, 3, 1, 1, 18};
        int[] a5 = {8, 2, 1, 1, 18, 3, 5};
        int[] a6 = {3, 3, 3, 3, 3, 3};
        int[] a7 = {1};
        int[] a8 = {};
        System.out.println("result : " + isMercurial(a8));
    }

    public static int isMercurial(int[] a) {
        boolean oneSeen = false;
        int i = 0;
        while (i < a.length) {
            int current = a[i];
            if (current == 1) {
                oneSeen = true;
            } else if (current == 3) {
                if (oneSeen) {
                    //check the rest if there has another 1
                    for (int j = i + 1; j < a.length; j++) {
                        if (a[j] == 1) return 0;
                    }
                }
            }
            i++; // update
        }
        return 1;
    }
}
