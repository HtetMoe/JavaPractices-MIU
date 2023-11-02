package question17;

import java.util.ArrayList;

public class PrimeHappy {
    /*
    - if there is at least one prime less than n
    - the sum of all primes less than n is evenly divisible by n.

     - find primes
     - sumPrimes is and divisible by n
     */
    public static void main(String[] args) {
        int n = 5;
        System.out.println(isPrimeHappy(n));
    }

    public static int isPrimeHappy(int n) {
        if (n <= 2) return 0; // there are no primes less than 2.

        int primesSum = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                //System.out.println(i);
                primesSum += i;
            }
        }
        //System.out.println("primes sum " + primesSum);
        if (primesSum % n == 0) return 1;

        return 0;
    }

//    public static int isPrimeHappy(int n) {
//        if (n <= 2) {
//            return 0;
//        }
//
//        ArrayList<Integer> primes = new ArrayList<>();
//        int sumPrimes = 0;
//
//        // Find primes less than n
//        for (int i = 2; i < n; i++) {
//            if (isPrime(i)) {
//                primes.add(i);
//                sumPrimes += i;
//            }
//        }
//        System.out.println("primes of " + n + " : " + primes);
//        System.out.println("sum : " + sumPrimes);
//
//        //check isDivisible
//        return (sumPrimes % n) == 0 ? 1 : 0;
//    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
