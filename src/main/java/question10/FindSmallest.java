package question10;

public class FindSmallest {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("result : " + smallest(n));
    }

    public static int smallest(int n) {
        int number = 2; // smallest num that is 2
        while (true) {
            boolean hasDigit2 = true;
            for (int i = 1; i <= n; i++) {
                int multiple = number * i;
                if (!isContainTwo(multiple)) {
                    hasDigit2 = false;
                    break;
                }
            }
            if (hasDigit2)  return number;

            number++; //update
        }//end while
    }

    public static boolean isContainTwo(int num) {
        while (num > 0) {
            if (num % 10 == 2) {
                return true;
            }
            num /= 10;
        }
        return false;
    }
}
