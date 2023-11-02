package question15;

public class DecodeArray {
    public static void main(String[] args) {
        int[] a = {-1, 5, 8, 17, 15}; //-6392
        System.out.println(decodeArray(a));
    }

    public static int decodeArray(int[] a) {
        int result = 0;
        int sign = 1;
        for (int i = 0; i < a.length - 1; i++) {
            int current = a[i]; int next = a[i + 1];
            int diff = Math.abs(current - next);
            result = diff + (result * 10);
        }
        if ( a[0] < 0) sign = -1;

        return sign * result;
    }
}
