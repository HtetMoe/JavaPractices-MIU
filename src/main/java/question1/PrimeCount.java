package question1;

public class PrimeCount {
    public static void main(String[] args) {
        int start = -10;
        int end   = 6;
        int primeCount = primeCount(start, end);
        System.out.println("Your prime count between " + start + " and " + end + " is " + primeCount);
    }

    public static int primeCount(int start, int end) {
        int count = 0;

        if (end == 1)
            return 0;

        if (start < 1) { // if start range is negative numbers
            start = 2;
        }

        //within start and end, check prime count
        for (int i = start; i <= end; i++) {
            //check is prime
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }

        }

        return count;
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

}
