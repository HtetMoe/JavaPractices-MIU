package question3;

public class SumFactor {
    public static void main(String[] args) {
        int a[] = {3, 0, 2, -5, 0};
        System.out.println(sumFactor(a));
    }

    public static int sumFactor(int[] a) {
        int result = 0;

        int sum = 0;
        for (int e : a) {
            sum += e;
        }

        for (int e : a) {
            if (e == sum) result++;
        }
        return result;
    }
}
