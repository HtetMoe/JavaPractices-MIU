package question21;

public class isTriangular {
    /*
       - triangular if n == 1 + 2 +...+j
       - 1 (j=1), 3 (j=2), 6, (j=3), 10 (j=4)
     */
    public static void main(String[] args) {
        int n = 10;
        System.out.println("result : " + isTriangular(n));
    }

    public static int isTriangular(int n) {
        int sum = 0;
        int j = 1;
        while (sum < n) {
            sum += j;
            j++;
        }
        System.out.println("sum : " + sum);
        System.out.println("n : " + n);
        return n == sum ? 1 : 0;
    }
}
