package question19;

public class ClosestFibonacci {
    public static void main(String[] args) {
        int n = 13;
        System.out.println("result : " + closestFibonacci(n));
    }

    public static int closestFibonacci(int n) {
        if (n < 1) {
            return 0;
        }

        int a = 1;
        int b = 1;
        int fib = 1;

        while (fib <= n) {
            a = b;
            b = fib;

            fib = a + b;
        }
        System.out.println("a " + a);
        System.out.println("b " + b);

        return b < n ? b : a;
    }
}
