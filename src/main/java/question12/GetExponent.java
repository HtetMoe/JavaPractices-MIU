package question12;

public class GetExponent {
    /*
       - p power x, x is the largest exponent
       -  162 = (2 power 1) * (3 power 4) -> result : p is 3, x is 4
     */
    public static void main(String[] args) {
        int n = 124;
        int p = 4;
        System.out.println("result : " + getExponent(n, p));
    }

    public static int getExponent(int n, int p) {
        int count = 0;

        if (p <= 1) return -1;

        while (n % p == 0) {
            count++;
            n /= p; // update n
        }
        return count;
    }
}
