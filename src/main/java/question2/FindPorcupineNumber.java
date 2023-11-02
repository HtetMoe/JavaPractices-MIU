package question2;

public class FindPorcupineNumber {
    /*
         A porcupine number is a prime number
         whose last digit is 9 and
         the next prime number that follows it also ends with the digit 9

         0 return 139
     */
    public static void main(String[] args) {
        int n = 0;
        System.out.println("resutl : " + findPorcupineNumber(n));
    }
    public static int findPorcupineNumber(int n) {
        while (true){
            if(isPrime(n) && endWith9(n)){
                System.out.println("first " + n);
                int next = n + 1;
                while (true){
                    if(isPrime(next)){
                        if(endWith9(next)){
                            return n;
                        }
                        else {
                            break;
                        }
                    }
                    next++;
                }
            }
            n++;
        }
    }

//    public static int findPorcupineNumber(int n) {
//        while (true) {
//            if (isPrime(++n) && endWith9(n)) {
//                System.out.println("first prime : " + n);
//                int next = n;
//                while (true) {
//                    if (isPrime(++next)) {
//                        if (endWith9(next)) {
//                            return n;
//                        } else {
//                            break;
//                        }
//                    }
//                }
//            }
//        }
//    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)  return false;
        }
        return true;
    }

    public static boolean endWith9(int n) {
        if (n % 10 == 9) return true;
        return false;
    }

}
