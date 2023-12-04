package question21;

public class isMercurial {
    /*
        - if a 3 does not occur between any two 1s
     */
    public static void main(String[] args) {
        int[] a = {5, 2, 10, 3, 15, 1, 2, 2};
        System.out.println("result : " + isMercurial(a));
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
