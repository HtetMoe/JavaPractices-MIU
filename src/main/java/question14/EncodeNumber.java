package question14;

import java.util.ArrayList;
import java.util.Arrays;

public class EncodeNumber {
    public static void main(String[] args) {
        int n = 6936;
        System.out.println("result : " + Arrays.toString(encodeNumber(n)));
    }

    public static int[] encodeNumber(int n) {
        if (n <= 1) return null;

        ArrayList<Integer> primeFactors = new ArrayList<>();
        int[] result;

        //find factors
        for (int i = 2; i <= n / 2; i++) {
            //prime factors
            while (n % i == 0) {
                //System.out.println("i " + i);
                if (isPrime(i)) primeFactors.add(i);
                n /= i;
            }
        }
        System.out.println("prime factors : " + primeFactors);

        //array to list
        result = new int[primeFactors.size()];
        for (int i = 0; i < primeFactors.size(); i++) {
            result[i] = primeFactors.get(i);
        }
        return result;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
