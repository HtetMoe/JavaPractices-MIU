package question18;

public class isFactorialPrime {
    /*
        - n is prime
        - n = some! + 1
     */
    public static void main(String[] args) {
        int n = 11;
        System.out.println("result : " + isFactorialPrime(n));
    }

    public static int isFactorialPrime(int n) {
        boolean isCorrect =  false;

        if (!isPrime(n)) return 0;

        for(int i = 1; i <= n; i ++){
            int fact = findFactorial(i);

            if(fact + 1 == n){
                // System.out.println(i + "! + 1");
                isCorrect = true;
                break;
            }
        }
        return isCorrect ? 1 : 0;
    }

    public static int findFactorial(int num){
        int fact = 1;
        for (int i = 1; i <= num; i++){
            fact *= i;
        }
        return fact;
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

