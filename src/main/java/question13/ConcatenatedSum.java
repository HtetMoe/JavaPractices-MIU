package question13;

public class ConcatenatedSum {
    public static void main(String[] args) {
        int n = 198;
        int catlen = 2;
        System.out.println(checkConcatenatedSum(n, catlen));
    }

    public static int checkConcatenatedSum(int n, int catlen) {
        int ori = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10; // get the digit from number

            int concatdigit = 0;
            for (int i = 1; i < catlen; i++) {
                concatdigit = (digit * 10) + digit; //88+8
            }
            sum += concatdigit;
            n /= 10; // update n
        }
        return sum == ori ? 1 : 0;
    }

}
