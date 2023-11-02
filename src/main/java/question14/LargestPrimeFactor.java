package question14;

public class LargestPrimeFactor {
    /*
        - Divide the number by the smallest prime number (2) repeatedly until you can no longer divide evenly. This will remove all the even factors.
            6936 ÷ 2 = 3468
            3468 ÷ 2 = 1734
            1734 ÷ 2 = 867

        - Now, you have an odd number (867). Start dividing by the next prime number (3) and continue until you can no longer divide evenly.
            867 ÷ 3 = 289
            289 ÷ 17 = 17

        - At this point, you've reduced 6936 to the prime factorization:
            6936 = 2^3 * 3 * 17

        - So, the prime factors of 6936 are 2, 3, and 17.
     */
    public static void main(String[] args) {
        int n = 6936;
        System.out.println(largestPrimeFactor(n));
    }

    public static int largestPrimeFactor(int n) {
        if (n <= 1) {
            return 0;
        }

        //remove all even factors
        while (n % 2 == 0) { // until remainder 0
            n /= 2;
        }
        //System.out.println("Now, n is " + n); // 867

        int largestfactor = 0;
        //find factors among odds
        for (int i = 3; i <= n/2; i += 2) { // 289
            //largest factors
            while (n % i == 0){ // until remainder 0
                largestfactor = i;
                n /= i; // update
            }
        }
        System.out.println("Now, n is " + n);//1, if not 1 (>2), it's its own largest prime.
        return n > 2 ? n : largestfactor;
    }
}
