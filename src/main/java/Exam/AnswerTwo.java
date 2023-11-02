package Exam;

public class AnswerTwo {
    /*
        - it contains two distinct elements that sum to N for some specified value of N and
        - the indexes of those elements also sum to N
     */
    public static void main(String[] args) {
        int[] a = {1, 4, 1, 4, 5, 6};
        int n = 5;
        System.out.println("result : " + isPairedN(a, n, a.length));
    }

    public static int isPairedN(int a[], int n, int len) {
        //sum of 2 distinct elements = n
        for (int i = 0; i < len; i++) {
            int value1 = a[i];

            for (int j = i + 1; j < len; j++) {
                int value2 = a[j];
                if (value1 + value2 == n && i + j == n) {
                    //System.out.println(i + ", " + j);
                    return 1;
                }
            }
        }
        return 0;
    }
}
