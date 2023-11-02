package question15;

public class CubePowerful {
    public static void main(String[] args) {
        int n = -81;
        System.out.println(isCubePowerful(n));
    }

    public static int isCubePowerful(int n) {
        int ori = n;
        int sum = 0;

        if (n <= 0) return 0;

        while (n != 0) {
            int digit = n % 10;
            sum += (digit * digit * digit);

            //update
            n = n / 10;
        }
        return ori == sum ? 1 : 0;
    }
}
