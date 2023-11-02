package Exam;

public class AnswerOne {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1, 0};
        System.out.println("result : " + hasSingleMaximum(a, a.length));
    }

    public static int hasSingleMaximum(int a[], int len) {
        if (len == 0) return 0;

        //find max
        int max = a[0];
        for (int i = 1; i < len; i++) {
            int current = a[i];
            if (current > max) max = current;
        }

        //max occurs exactly once in the array
        int count = 0;
        for (int element : a) {
            if (element == max) count++;
        }
        return count > 1 ? 0 : 1;
    }
}


