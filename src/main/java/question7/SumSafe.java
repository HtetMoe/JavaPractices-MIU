package question7;

public class SumSafe {
    public static void main(String[] args) {
        int a[] = {5, -4, 2};
        System.out.println("result : " + sumSafe(a));
    }

    public static int sumSafe(int a[]) {
        int sum = 0;
        for (int e : a) {
            sum += e;
        }

        for (int e : a) {
            if (sum == e) return 0;
        }
        return 1;
    }
}
