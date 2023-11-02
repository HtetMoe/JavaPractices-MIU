package question7;

public class Matches {
    public static void main(String[] args) {
        int A[] = {1, 2, 3, -5, -5, 2, 3, 18};
        int P[] = {3, -2, 3};
        System.out.println("result : " + matches(A, A.length, P));
    }
    /*
        - a.length =  sum of all elements (abs) of P
        - for n in P, if n is positive then the sequence of n elements of A must all be positive
     */

    public static int matches(int a[], int len, int p[]) {

        //check the size first,
        int size = 0;
        for (int value : p) {
            size += Math.abs(value);
        }
        if (size != len) return 0;

        //p
        for (int i = 0; i < p.length; i++) {
            int aLength = p[i];
            int pSign = p[i] < 0 ? -1 : 1;

            //a
            for (int j = 0; j < aLength; j++) {
                int aSign = a[j] < 0 ? -1 : 1; // check the sign
                if (aSign != pSign) return 0;
            }
        }
        return 1;
    }

    //This is teacher answer
//    public static int matches(int[ ] a, int[ ] p) {
//        int count = 0;
//        for (int i : p)
//            count += i > 0 ? i : 0 - i;
//        if (a.length != count) return 0;
//
//        int index = 0;
//        for(int out : p) {
//            int start = index;
//            for(; start < (out > 0 ? index + out : (0 - out) + index) ; start++) {
//                if ((out > 0 && a[start] < 0) || (out < 0 && a[start] > 0))
//                    return 0;
//            }
//            index = start;
//        }
//
//        return 1;
//    }
}
