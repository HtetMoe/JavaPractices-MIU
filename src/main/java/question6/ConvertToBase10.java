package question6;

public class ConvertToBase10 {
    public static void main(String[] args) {
        int a[] = {1, 0, 1, 1};
        int base = 2;
        System.out.println(convertToBase10(a, base, a.length));
    }

    public static int convertToBase10(int[] a, int base, int len) {
        if (isLegalNumber(a, base) == 0) return 0;

        int result = 0;
        for (int i = 0; i < len; i++) {
            result += (int) (a[i] * Math.pow(base, len - 1 - i));
        }
        return result;
    }

    public static int isLegalNumber(int a[], int base) {
        for (int e : a) {
            if (e >= base) return 0;
        }
        return 1;
    }
}
