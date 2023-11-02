package question5;

public class isDivisible {
    public static void main(String[] args) {
        int[] a = {3, 3, 6, 16};
        System.out.println(isDivisible(a, 3));
    }

    public static int isDivisible(int a[], int divisor) {
        for (int value : a)
            if (value % divisor != 0) return 0;
        return 1;
    }
}
