package question20;

import java.util.ArrayList;
import java.util.Arrays;

public class isFibonacci {
    public static void main(String[] args) {
        int n = 13;
        System.out.println("result : " + isFibonacci(n));
    }

    public static int isFibonacci(int n) {
        ArrayList<Integer> fibSequence = new ArrayList<>();
        int a = 1;
        int b = 1;
        int fib = 1;

        fibSequence.add(a);
        fibSequence.add(b);

        while (fib <= n){
            a = b;
            b = fib;
            fib = a + b;
            fibSequence.add(fib);
        }
        System.out.println("fib seq : " + fibSequence);
        return fibSequence.contains(n) ? 1 : 0;
    }
}
