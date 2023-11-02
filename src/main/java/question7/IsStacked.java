package question7;

public class IsStacked {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("result : " + isStacked(n));
    }

    public static int isStacked(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
            if (sum == n) return 1;
        }
        return 0;
    }
}
