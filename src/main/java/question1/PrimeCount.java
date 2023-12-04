package question1;

public class PrimeCount {
    public static void main(String[] args) {
        int start = -10;
        int end = 6;
        int primeCount = primeCount(start, end);
        System.out.println("Your prime count between " + start + " and " + end + " is " + primeCount);
    }

    public static int primeCount(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
