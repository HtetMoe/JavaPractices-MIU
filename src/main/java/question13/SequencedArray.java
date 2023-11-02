package question13;

public class SequencedArray {
    /*
    - array : between m and n (inclusive)
    - the array must be in ascending order
    - contain only those integers.
     */
    public static void main(String[] args) {
        int[] a = {-5, -5, -4, -4, -4, -3, -3, -2, -2, -2};
        int m = -5;
        int n = -2;
        System.out.println(isSequencedArray(a, m, n));
    }

    public static int isSequencedArray(int[] a, int m, int n) {
        //check for m and n
        int first = a[0];
        int last = a[a.length - 1];
        if (first != m || last != n) return 0;

        //check ascending order
        for (int j = 0; j < a.length - 1; j++) {
            int current = a[j];
            int next = a[j + 1];

            if (current > next) return 0;
        }

        //contain only those integers m to n(inclusive)
        for (int i = m; i <= n; i++) { // m to n => 2,3,4,5,6
            boolean found = false;
            for (int num : a) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) return 0; // within outer looping
        }
        return 1;
    }
}
