package question20;

public class isOneBalanced {
    /*
        - begins with zero or more 1s
        - followed by zero or more non-1s
        - and concludes/end with zero or more 1s.

        - start = zero || 1
        - middle = zero || non1
        - end = zero || 1
     */
    public static void main(String[] args) {
        int[] a = {1, 1, 1, 2, 3, -18, 45, 1};
        System.out.println("result : " + isOneBalanced(a));
    }

    public static int isOneBalanced(int[] a) {
        int onesAtStart = 0;
        int onesAtEnd   = 0;

        int nonOnesCount = 0; //middles

        for (int num : a) {
            if (num == 1) {
                if (nonOnesCount == 0) {
                    onesAtStart++;
                } else {
                    onesAtEnd++;
                }
            } else {
                if (nonOnesCount < 0) return 0; // If we encounter non-1s after the initial sequence, return 0
                nonOnesCount++;
            }
        }

        return onesAtStart + onesAtEnd == nonOnesCount ? 1 : 0;
    }
}
